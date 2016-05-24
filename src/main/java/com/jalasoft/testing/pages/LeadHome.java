package com.jalasoft.testing.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadHome extends AbstractHome {

    public NewLeadForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new LeadCampaignForm();
    }

}
