package tests.practice;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Q2 extends TestBase {
    /*
    - Birbirine bagimli testler olusturun.
    - beforeClass olusturup setUp ayarlarini yapin.
    - Birbirine bagimli testlr olusturarak ;
        =>ilk once facebook'a gidin
        =>sonra facebook'a bagimli olarak google'a gidin
        =>daha sonra google'a bagimli olarak amazon'a gidin
    -driver'i kapatin.    */

    @Test(dependsOnMethods = "test3")
    public void test1 (){
        driver.get( "http//:amazon.com" );

    }
    @Test
    public void test2 (){
        driver.get( "http//:google.com" );

    }
    @Test(dependsOnMethods = "test2")
    public void test3 (){
        driver.get( "http//:facebook.com" );

    }
}
