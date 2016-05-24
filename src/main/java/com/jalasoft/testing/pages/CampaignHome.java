package com.jalasoft.testing.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Carlos Gonzales on 5/16/2016.
 */
public class CampaignHome extends AbstractHome {

    public NewCampaignForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewCampaignForm();
    }

}
