package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import utilities.TestBase;


public class C01_TestNGIlktest extends TestBase {
    @Test(priority = 10)
    public void ilkTest() {
        driver.get( "https://amazon.de" );
    }
    @Test(priority = 11)
    public void ikinciTest() {
        driver.get( "https://wisequarter.com" );
    }
    @Test(priority = 12)
    public void ucubcuTest() {
        driver.get( "https://youtube.com" );
    }
    }


