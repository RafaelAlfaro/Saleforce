package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Carlos Gonzales on 5/20/2016.
 */
public class LeadCampaignForm extends NewLeadForm {
    @FindBy(id = "cpn1_ileinner")
    private WebElement leanText;

    public String getCampaignName() {
        return leanText.getText();
    }
}
