package com.cucumber.selenium.pageobject.example.pages;

import com.cucumber.selenium.pageobject.example.driver.SharedWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SearchPage {

    private WebDriver webDriver;

    public SearchPage(SharedWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String page) {
        webDriver.get(page);
    }

    public void doSearch(String search) {
        WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys(search);
        element.submit();
    }

    public void checkTitleContains(String text) {
        assertTrue(webDriver.getTitle().contains(text));
    }
}
