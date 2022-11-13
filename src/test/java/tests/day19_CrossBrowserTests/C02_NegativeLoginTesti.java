package tests.day19_CrossBrowserTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;
public class C02_NegativeLoginTesti extends TestBaseCross {

    @Test
    public void negativeTest(){
        // mycoursedemy anasayfaya gidin
        driver.get(ConfigReader.getProperty("myUrl"));
        // login butonuna basin
        WebElement loginLinki=driver.findElement(By.xpath("//a[text()='Log in']"));
        loginLinki.click();
        // email ve password icin gecersiz degerler girin
        driver.findElement(By.xpath("//input[@id='login-email']"))
                .sendKeys(ConfigReader.getProperty("myYanlisEmail"));

        driver.findElement(By.xpath("//input[@id='login-password']"))
                .sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        // login butonuna basin
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        // giris yapilamadigini test edin
        Assert.assertTrue(loginLinki.isDisplayed());
    }
}