package tests.day16_pageObjectModel;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_ConfigReaderKullanimi {
    @Test
    public void method1(){
        Driver.getDriver().get( ConfigReader.getProperty( "amazonUrl" ) );
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty( "amazonAramaKelimesi" ));


        ReusableMethods.bekle( 2 );
    Driver.closeDriver();
    }

}
