package com.telran.wikipedia.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikipediaTest extends TestBase{

    @Test
    public void openWikipedia() throws InterruptedException {

        app.maximize();
        app.getWik().click(By.cssSelector("#js-link-box-en"));
        app.getWik().click(By.xpath("//*[@id='ca-history']"));
        app.getWik().back();
        app.getWik().pause(3000);
        app.getWik().click(By.cssSelector("#ca-viewsource"));
        app.getWik().pause(3000);
        app.getWik().back();
        app.getWik().click(By.xpath("//*[contains(@title, 'Arts')]"));
        app.getWik().back();
        app.getWik().pause(3000);
        app.getWik().click(By.xpath("//*[@type='search']"));
        app.getWik().pause(3000);
        app.getWik().click(By.cssSelector("[title=Wikipedia]"));
        app.getWik().back();
        app.getWik().pause(3000);
        app.getWik().click(By.xpath("//*[@class='mw-wiki-logo']"));
        app.getWik().click(By.xpath("//*[contains(@title, 'Technology')]"));
        app.getWik().back();
        app.getWik().pause(3000);
        app.getWik().click(By.xpath("//*[@title='Commons']"));
        app.getWik().back();
        app.getWik().pause(3000);
        app.getWik().click(By.xpath("//*[contains(@title, 'Foundation')]"));
        app.getWik().back();
        app.getWik().pause(3000);

    }

}
