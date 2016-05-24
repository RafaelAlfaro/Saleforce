package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Carlos Gonzales on 5/20/2016.
 */
public class Footer extends AbstractBasePage {

    @FindBy(xpath = "//a[contains(@href,'privacy')]")
    private WebElement privacyLink;

    public Privacy clickPrivacyLink() {
        wait.until(ExpectedConditions.elementToBeClickable(privacyLink));
        privacyLink.click();
        return new Privacy();
    }
}
