import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikipediaTest {

    WebDriver driver;
    @BeforeMethod
    public void  setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void openWikipedia() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#js-link-box-en")).click();
        driver.findElement(By.xpath("//*[@id='ca-history']")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#ca-viewsource")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[contains(@title, 'Arts')]")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type='search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[title=Wikipedia]")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='mw-wiki-logo']")).click();
        driver.findElement(By.xpath("//*[contains(@title, 'Technology')]")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@title='Commons']")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@title, 'Foundation')]")).click();
        driver.navigate().back();
        Thread.sleep(3000);




    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }










}
