package com.jalasoft.testing.pages;

import java.util.LinkedList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Privacy extends AbstractBasePage {

    @FindBy(css = ".cell-content > h3")
    private WebElement titleText;

    private LinkedList<String> windowsList;

    public Privacy() {
        windowsList = new LinkedList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.getLast());
    }

    public String getTitleText() {
        return titleText.getText();
    }

    public void switchMainWindow() {
        driver.close();
        driver.switchTo().window(windowsList.getFirst());
    }
}
