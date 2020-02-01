package com.telran.wikipedia.manager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    EventFiringWebDriver wd;

    WikipediaHelper wik;

    public static class MyListener extends AbstractWebDriverEventListener {
        Logger logger = LoggerFactory.getLogger(MyListener.class);

        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//            super.beforeFindBy(by, element, driver);
            logger.info("Search element " + by);
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
//            super.afterFindBy(by, element, driver);
            logger.info(by + " found");
        }


        @Override
        public void onException(Throwable throwable, WebDriver driver) {
//            super.onException(throwable, driver);
            logger.error("\nError" + throwable);
        }
    }


    public void init() {
        String browser = System.getProperty("browser", BrowserType.CHROME);
        if (browser.equals(BrowserType.CHROME)) {
            wd = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new EventFiringWebDriver(new FirefoxDriver());
        } else if (browser.equals(BrowserType.EDGE)) {
            wd = new EventFiringWebDriver(new EdgeDriver());
        } else if (browser.equals(BrowserType.IE)) {
            wd = new EventFiringWebDriver(new InternetExplorerDriver());
        }

        wd.register(new MyListener());

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        maximize();
        wd.get("https://www.wikipedia.org/");

        wik = new WikipediaHelper(wd);

    }


    public void stop() {
        wd.quit();
    }

    public void maximize() {
        wd.manage().window().maximize();
    }

    public WikipediaHelper getWik() {
        return wik;
    }

}
