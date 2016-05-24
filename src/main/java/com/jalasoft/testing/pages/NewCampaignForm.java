package com.jalasoft.testing.pages;

import com.thoughtworks.selenium.webdriven.commands.Check;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCampaignForm extends AbstractBasePage {

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;
    @FindBy(id = "cpn16")
    private WebElement activeCheckBox;
    @FindBy(id = "cpn2")
    private WebElement typeListbox;
    @FindBy(id = "cpn3")
    private WebElement statusListbox;
    @FindBy(id = "cpn5")
    private WebElement startDateTextField;
    @FindBy(id = "cpn6")
    private WebElement endDateTextField;

    @FindBy(id = "cpn8")
    private WebElement expectedRevenueTextField;
    @FindBy(id = "cpn9")
    private WebElement budgetedCostTextField;
    @FindBy(id = "cpn10")
    private WebElement actualCostTextField;
    @FindBy(id = "cpn11")
    private WebElement expectedResponseTextField;
    @FindBy(id = "cpn13")
    private WebElement numSentTextField;
    @FindBy(id = "Parent_lkwgt")
    private WebElement parentCampaignTextField;

    //Description Information
    @FindBy(id = "cpn4")
    private WebElement descriptionTextField;


    @FindBy(name = "save")
    private WebElement saveButton;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        campaignNameTextField.clear();
        campaignNameTextField.sendKeys(campaignName);
    }

    public void setStartDateTextField(String startDate) {
        wait.until(ExpectedConditions.visibilityOf(startDateTextField));
        startDateTextField.clear();
        startDateTextField.sendKeys(startDate);
    }

    public void setEndDateTextField(String endDate) {
        wait.until(ExpectedConditions.visibilityOf(endDateTextField));
        endDateTextField.clear();
        endDateTextField.sendKeys(endDate);
    }

    public void setExpectedRevenueTextField(String expectedRevenue) {
        wait.until(ExpectedConditions.visibilityOf(expectedRevenueTextField));
        expectedRevenueTextField.clear();
        expectedRevenueTextField.sendKeys(expectedRevenue);
    }

    public void setBudgetedCostTextField(String budgetedCost) {
        wait.until(ExpectedConditions.visibilityOf(budgetedCostTextField));
        budgetedCostTextField.clear();
        budgetedCostTextField.sendKeys(budgetedCost);
    }

    public void setActualCostTextField(String actualCost) {
        wait.until(ExpectedConditions.visibilityOf(actualCostTextField));
        actualCostTextField.clear();
        actualCostTextField.sendKeys(actualCost);
    }

    public void setExpectedResponseTextField(String expectedResponse) {
        wait.until(ExpectedConditions.visibilityOf(expectedResponseTextField));
        expectedResponseTextField.clear();
        expectedResponseTextField.sendKeys(expectedResponse);
    }

    public void setNumSentTextField(String numSent) {
        wait.until(ExpectedConditions.visibilityOf(numSentTextField));
        numSentTextField.clear();
        numSentTextField.sendKeys(numSent);
    }

    public void setParentCampaignTextField(String parentCampaign) {
        wait.until(ExpectedConditions.visibilityOf(parentCampaignTextField));
        parentCampaignTextField.clear();
        parentCampaignTextField.sendKeys(parentCampaign);
    }

    public void setdescriptionTextField(String description) {
        wait.until(ExpectedConditions.visibilityOf(descriptionTextField));
        descriptionTextField.clear();
        descriptionTextField.sendKeys(description);
    }

    public void setTypeListbox(String type) {
        Select select = new Select(typeListbox);
        select.selectByValue(type);
    }
    public void setstatusListbox(String status) {
        Select select = new Select(statusListbox);
        select.selectByValue(status);
    }

    public void setactiveCheckBox() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(activeCheckBox));
        selectCheckbox(activeCheckBox);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }

    private void selectCheckbox(WebElement element) {
        try {
            if (element.isSelected()) {
                System.out.println("Checkbox: " + element + "is already selected");
            } else {
                element.click();
            }
        } catch (Exception e) {
            System.out.println("Unable to select the checkbox: " + element);
        }
    }

    private void deselectCheckbox(WebElement element) {
        try {
            if (element.isSelected()) {
                element.click();
            } else {
                System.out.println("Checkbox: "+element+"is already deselected");
            }
        } catch (Exception e) {
            System.out.println("Unable to deselect checkbox: "+element);
        }
    }

}
