package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HandleObjects {

    private MainContainer mainContainer;

    private TabBar tabBar;

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        mainContainer = login.loginAs("rafael.alfaro.martinez@gmail.com", "Control123");
    }

    @BeforeMethod
    public void beforeMethod() {
        tabBar = mainContainer.goToTabBar();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("@AfterMethod: The annotated method will be run after each test method.");
    }

    @Test
    public void testCreateCampaign() {
        String expectedCampaignName = "New Campaign 00001";
        String type = "Webinar";
        String status = "Completed";
        String startDate = "05/02/2016";
        String endDate = "03/05/2016";
        String expectedRevenue = "12";
        String budgetedCost = "1";
        String actualCost = "33";
        String expectedResponse = "2";
        String numSent = "3";
        String parentCampaign = "4";
        String description = "Test 002";




        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.setactiveCheckBox();
        newCampaignForm.setTypeListbox(type);
        newCampaignForm.setstatusListbox(status);
        newCampaignForm.setStartDateTextField(startDate);
        newCampaignForm.setEndDateTextField(endDate);
        newCampaignForm.setExpectedRevenueTextField(expectedRevenue);
        newCampaignForm.setBudgetedCostTextField(budgetedCost) ;
        newCampaignForm.setActualCostTextField(actualCost);
        newCampaignForm.setExpectedResponseTextField(expectedResponse);
        newCampaignForm.setNumSentTextField(numSent);
        newCampaignForm.setdescriptionTextField(description);


        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();
        assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName+ " [View Hierarchy]");
    }


    @Test
    public void testCreateLeads() {
        String expectedLeadName = "Dr. Rafael Alfaro";
        //Lead Information
        String salutation = "Dr.";
        String firstNameLead = "Rafael";
        String lastNameLead = "Alfaro";
        String companyLead = "JalaSoft";
        String title = "Doctor";  //lea4
        String leadSource = "Web"; //lea5
        String industry = "Energy"; //lea6
        String annualRevenue ="test"; //lea7
        String phone = "89785-8825-55"; //lea8
        String mobile = "78966555"; //lea9
        String fax = "88893-55541-554"; //lea10
        String email = "test@jalasoft.com"; //lea11
        String website = "https://test.com.bo"; //lea12
        String leadStatus = "Working - Contacted"; //lea13
        String rating = "Cold"; //lea14
        String nEmployees = "200"; //lea15

        //Address Information
        String aStreet = "San Pablo 4566"; //lea16street
        String aCity = "Cochabamba"; //lea16city
        String aStateProvinde = "233"; //lea16state
        String aZipCode = "0000"; //lea16zip
        String aCountry = "Bolivia"; //lea16country

        //Additional Information
        String infoProduct = "GC5000 series"; //00N580000072Bcn
        String infoSicCode = "3344"; //00N580000072Bco
        String infoNumLocations = "34"; //00N580000072Bcl
        String infoCurrentGenerator = "test123"; //00N580000072Bck
        String infoPrimary = "No"; //00N580000072Bcm

        //Description Information
        String desInfoDescription = "test 12345678909876543210"; //lea17



        LeadHome leadHome = tabBar.clickLeadTab();
        NewLeadForm newLeadForm = leadHome.clickNewButton();

        newLeadForm.setsalutationListBox(salutation);
        newLeadForm.setFirstNameTextField(firstNameLead);
        newLeadForm.setLastNameTextField(lastNameLead);
        newLeadForm.setCompanyTextField(companyLead);
        newLeadForm.setCompanyTextField(leadStatus);


        newLeadForm.settitleTextField(title);
        newLeadForm.setleadSourceListBox(leadSource);
        newLeadForm.setindustryListBox(industry);
        newLeadForm.setphoneTextField(phone);
        newLeadForm.setmobileTextField(mobile);
        newLeadForm.setfaxTextField(fax);
        newLeadForm.setemailTextField(email);
        newLeadForm.setwebsiteTextField(website);
        newLeadForm.setleadStatusListBox(leadStatus);
        newLeadForm.setratingListBox(rating);
        newLeadForm.setnEmployeesTextField(nEmployees);


        newLeadForm.setStreetTextField(aStreet);
        newLeadForm.setCityTextField(aCity);
        newLeadForm.setStateTextField(aStateProvinde);
        newLeadForm.setZipTextField(aZipCode);
        newLeadForm.setCountryTextField(aCountry);

        newLeadForm.SetInfoProductListBox(infoProduct);
        newLeadForm.setInfoSicCodeTextField(infoSicCode);
        newLeadForm.setInfoNumLocationsTextField(infoNumLocations);
        newLeadForm.setInfoCurrentGenerator(infoCurrentGenerator);
        newLeadForm.setInfoPrimaryListBox(infoPrimary);

        newLeadForm.setdesInfoDescriptionTextField(desInfoDescription);
        LeanDetail leadDetail = newLeadForm.clickSaveButton();
        assertEquals(leadDetail.getLeadName(),
                expectedLeadName);
    }


    @Test
    public void testPrivacyLink() {
        Footer footer = mainContainer.gotToFooter();
        Privacy privacy =  footer.clickPrivacyLink();

        assertEquals(privacy.getTitleText(), "Privacy Statements");

        privacy.switchMainWindow();
    }

}
