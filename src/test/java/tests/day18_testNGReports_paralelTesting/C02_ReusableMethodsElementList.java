package tests.day18_testNGReports_paralelTesting;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ReusableMethodsElementList {
    @Test
    public void test01(){
        // amazon anasayfaya gidin
        Driver.getDriver().get( ConfigReader.getProperty( "amazonUrl" ) );
        // arama kutusunun yanindaki dropdown menuyu locate edin
        // dropdown menudeki tum options listesini olusturup
        // menude Electronics basligi oldugunu test edin


    }
}
