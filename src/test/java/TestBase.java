import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver wd;

    @BeforeSuite
    public void setUp() {

        String browser = System.getProperty("browser", BrowserType.CHROME);
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.EDGE)) {
            wd = new EdgeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.wikipedia.org/");
    }

    @AfterSuite
    public void tearDown() {
        wd.quit();
    }

    public void back() {
        wd.navigate().back();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void maximize() {
        wd.manage().window().maximize();
    }

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
