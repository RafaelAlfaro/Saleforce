package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TabBar extends AbstractBasePage {

    @FindBy(css = "#Campaign_Tab > a")
    private WebElement campaignTab;

    @FindBy(css = "#Lead_Tab > a")
    private WebElement leadTab;


    public CampaignHome clickCampaignsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(campaignTab));
        campaignTab.click();
        return new CampaignHome();
    }

    public LeadHome clickLeadTab() {
        wait.until(ExpectedConditions.elementToBeClickable(leadTab));
        leadTab.click();
        return new LeadHome();
    }

}
