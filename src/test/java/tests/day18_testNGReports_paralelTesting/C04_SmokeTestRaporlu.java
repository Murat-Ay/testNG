package tests.day18_testNGReports_paralelTesting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C04_SmokeTestRaporlu extends TestBaseRapor {

    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
    @BeforeClass
    public void setup(){
        extentTest=extentReports.createTest( "yanlis kullanici adi", "yanlis kullanici adi" )
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get( ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLinki.click();
    }

    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // 1- yanlis kullanici adi, gecerli password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();
        // Basarili olarak giris yapilamadigini test edin
        // bunun icin hala login linklinin gorunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
    }
    @Test
    public void yanlisPasswordTesti(){
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
    }

    @Test
    public void yanlisEmailSifreTesti(){
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
    }

    @AfterClass
    public void teardown(){
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}

