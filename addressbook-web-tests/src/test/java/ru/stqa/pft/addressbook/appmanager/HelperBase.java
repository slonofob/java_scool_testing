package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String ntext) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(ntext);
    }
    protected boolean isElementPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
