package day07_assertions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_RadioButton {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        //https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        //Cookies’i kabul edin
        driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
        //“Create an Account” button’una basin
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //“radio buttons” elementlerini locate edin
        //Secili degilse cinsiyet butonundan size uygun olani secin
        driver.findElement(By.xpath("//input[@value='2']")).click();
    }
    @After
    public void teardown(){
        driver.close();

    }
}
//driver.findElement(By.className("_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy"))
//cookies kisminda bu kodda calisiyor hocam, arkadaslar degistirebilir