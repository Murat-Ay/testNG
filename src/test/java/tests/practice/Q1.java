package tests.practice;

import org.testng.annotations.Test;

public class Q1 {
    /*TestNG test methodlarini alfabetik siraya gore run eder,
    yukaridan asagiya dogru degil.
    > priority annotation testlre oncelik vermek icin kullanilir,
     kucuk olan numara daha once calisir.
    > priority : TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir.
    > priority default degeri sifirdir.
    > enabled = false methodu : Testi gormezden gelmek icin @Test 'in yanina yazilir.  */
    @Test(priority = 300)
    public void b(){
    System.out.println("b");
}
    @Test(priority = -300)
    public void a(){
        System.out.println("a");
}
    @Test(priority = 301)
    public void c() {
        System.out.println( "c" );
    }
    @Test(enabled = false)
    public void d() {
        System.out.println( "d" );
        }
    @Test(dependsOnMethods = "c")
    public void e() {
        System.out.println( "e" );
    }
}