package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by rafael on 23/5/2016.
 */
public class LeanDetail extends AbstractBasePage{
    @FindBy(id = "lea2_ileinner")
    private WebElement leadNameText;

    public String getLeadName() {
        return leadNameText.getText();
    }
}
