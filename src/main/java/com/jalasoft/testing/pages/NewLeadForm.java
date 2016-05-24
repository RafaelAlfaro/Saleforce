package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class NewLeadForm extends AbstractBasePage{

    @FindBy(id = "name_salutationlea2")
    private WebElement salutationListBox;
    @FindBy(id = "name_firstlea2")
    private WebElement firstNameTextField;
    @FindBy(id = "name_lastlea2")
    private WebElement lastNameTextField;
    @FindBy(id = "lea3")
    private WebElement companyTextField;
    @FindBy(id = "lea4")
    private WebElement  titleTextField;
    @FindBy(id = "lea5")
    private WebElement leadSourceListBox;
    @FindBy(id = "lea6")
    private WebElement  industryListBox;
    @FindBy(id = "lea7")
    private WebElement  annualRevenueTextField;
    @FindBy(id = "lea8")
    private WebElement  phoneTextField;
    @FindBy(id = "lea9")
    private WebElement  mobileTextField;
    @FindBy(id = "lea10")
    private WebElement  faxTextField;
    @FindBy(id = "lea11")
    private WebElement  emailTextField;
    @FindBy(id = "lea12")
    private WebElement  websiteTextField;
    @FindBy(id = "lea13")
    private WebElement  leadStatusListBox;
    @FindBy(id = "lea14")
    private WebElement  ratingListBox;
    @FindBy(id = "lea15")
    private WebElement  nEmployeesTextField;

    //Address Information
    @FindBy(id = "lea16street")
    private WebElement  streetTextField;
    @FindBy(id = "lea16city")
    private WebElement  cityTextField;
    @FindBy(id = "lea16state")
    private WebElement  stateTextField;
    @FindBy(id = "lea16zip")
    private WebElement  zipTextField;
    @FindBy(id = "lea16country")
    private WebElement  countryTextField;

    //Additional Information
    @FindBy(id = "00N580000072Bcn")
    private WebElement  infoProductListBox;
    @FindBy(id = "00N580000072Bco")
    private WebElement  infoSicCodeTextField;
    @FindBy(id = "00N580000072Bcl")
    private WebElement  infoNumLocationsTextField;
    @FindBy(id = "00N580000072Bck")
    private WebElement  infoCurrentGeneratorTextField;
    @FindBy(id = "00N580000072Bcm")
    private WebElement  infoPrimaryListBox;

    //Description Information
    @FindBy(id = "lea17")
    private WebElement  desInfoDescriptionTextField;


    //Buttton
    @FindBy(name = "save")
    private WebElement saveButton;

    public void setsalutationListBox(String salutation) {
        Select select = new Select(salutationListBox);
        select.selectByValue(salutation);
    }

    public void setFirstNameTextField(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameTextField));
        firstNameTextField.clear();
        firstNameTextField.sendKeys(firstName);
    }

    public void setLastNameTextField(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(lastNameTextField));
        lastNameTextField.clear();
        lastNameTextField.sendKeys(lastName);
    }

    public void setCompanyTextField(String company) {
        wait.until(ExpectedConditions.visibilityOf(companyTextField));
        companyTextField.clear();
        companyTextField.sendKeys(company);
    }

    public void settitleTextField(String title) {
        wait.until(ExpectedConditions.visibilityOf(titleTextField));
        titleTextField.clear();
        titleTextField.sendKeys(title);
    }

    public void setleadSourceListBox(String leadSource) {
        Select select = new Select(leadSourceListBox);
        select.selectByValue(leadSource);
    }

    public void setindustryListBox(String industry) {
        Select select = new Select(industryListBox);
        select.selectByValue(industry);
    }

    public void setannualRevenueTextField(String annualRevenue) {
        wait.until(ExpectedConditions.visibilityOf(annualRevenueTextField));
        annualRevenueTextField.clear();
        annualRevenueTextField.sendKeys(annualRevenue);
    }

    public void setphoneTextField(String phone) {
        wait.until(ExpectedConditions.visibilityOf(phoneTextField));
        phoneTextField.clear();
        phoneTextField.sendKeys(phone);
    }

    public void setmobileTextField(String mobile) {
        wait.until(ExpectedConditions.visibilityOf(mobileTextField));
        mobileTextField.clear();
        mobileTextField.sendKeys(mobile);
    }

    public void setfaxTextField(String fax) {
        wait.until(ExpectedConditions.visibilityOf(faxTextField));
        faxTextField.clear();
        faxTextField.sendKeys(fax);
    }

    public void setemailTextField(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }

    public void setwebsiteTextField(String website) {
        wait.until(ExpectedConditions.visibilityOf(websiteTextField));
        websiteTextField.clear();
        websiteTextField.sendKeys(website);
    }

    public void setleadStatusListBox(String leadStatus) {
        Select select = new Select(leadStatusListBox);
        select.selectByValue(leadStatus);
    }

    public void setratingListBox(String rating) {
        Select select = new Select(ratingListBox);
        select.selectByValue(rating);
    }

    public void setnEmployeesTextField(String nEmployees) {
        wait.until(ExpectedConditions.visibilityOf(nEmployeesTextField));
        nEmployeesTextField.clear();
        nEmployeesTextField.sendKeys(nEmployees);
    }

    public void setLeadStatusListBox(String status) {
        Select select = new Select(leadStatusListBox);
        select.selectByValue(status);
    }

    //Address Information

    public void setStreetTextField(String street) {
        wait.until(ExpectedConditions.visibilityOf(streetTextField));
        streetTextField.clear();
        streetTextField.sendKeys(street);
    }

    public void setCityTextField(String city) {
        wait.until(ExpectedConditions.visibilityOf(cityTextField));
        cityTextField.clear();
        cityTextField.sendKeys(city);
    }

    public void setStateTextField(String state) {
        wait.until(ExpectedConditions.visibilityOf(stateTextField));
        stateTextField.clear();
        stateTextField.sendKeys(state);
    }

    public void setZipTextField(String zip) {
        wait.until(ExpectedConditions.visibilityOf(zipTextField));
        zipTextField.clear();
        zipTextField.sendKeys(zip);
    }

    public void setCountryTextField(String country) {
        wait.until(ExpectedConditions.visibilityOf(countryTextField));
        countryTextField.clear();
        countryTextField.sendKeys(country);
    }

    //Additional Information
    public void SetInfoProductListBox(String infoProduct) {
        Select select = new Select(infoProductListBox);
        select.selectByValue(infoProduct);
    }

    public void setInfoSicCodeTextField(String infoSicCode) {
        wait.until(ExpectedConditions.visibilityOf(infoSicCodeTextField));
        infoSicCodeTextField.clear();
        infoSicCodeTextField.sendKeys(infoSicCode);
    }

    public void setInfoNumLocationsTextField(String infoNumLocations) {
        wait.until(ExpectedConditions.visibilityOf(infoNumLocationsTextField));
        infoNumLocationsTextField.clear();
        infoNumLocationsTextField.sendKeys(infoNumLocations);
    }

    public void setInfoCurrentGenerator(String infoCurrentGenerator) {
        wait.until(ExpectedConditions.visibilityOf(infoCurrentGeneratorTextField));
        infoCurrentGeneratorTextField.clear();
        infoCurrentGeneratorTextField.sendKeys(infoCurrentGenerator);
    }

    public void setInfoPrimaryListBox(String infoPrimary) {
        Select select = new Select(infoPrimaryListBox);
        select.selectByValue(infoPrimary);
    }


    public void setdesInfoDescriptionTextField(String desInfoDescription) {
        wait.until(ExpectedConditions.visibilityOf(desInfoDescriptionTextField));
        desInfoDescriptionTextField.clear();
        desInfoDescriptionTextField.sendKeys(desInfoDescription);
    }

    public LeanDetail clickSaveButton() {
        saveButton.click();
        return new LeanDetail();
    }




}
