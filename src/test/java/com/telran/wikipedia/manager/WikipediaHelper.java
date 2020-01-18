package com.telran.wikipedia.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaHelper extends HelperBase{


    public WikipediaHelper(WebDriver wd) {
        super(wd);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

}
