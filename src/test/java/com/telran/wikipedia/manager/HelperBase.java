package com.telran.wikipedia.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void back() {
        wd.navigate().back();
    }

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
