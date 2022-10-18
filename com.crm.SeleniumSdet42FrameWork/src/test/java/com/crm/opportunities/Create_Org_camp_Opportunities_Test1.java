package com.crm.opportunities;

import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Org_camp_Opportunities;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;

public class Create_Org_camp_Opportunities_Test1 extends Base_Class {

	@Test
	
	public void Create_Org_camp_Opportunities_test() throws Throwable
	{
		Login_Page log=new Login_Page(driver);
		Home_Page home=new Home_Page(driver);
		WebDriver_Utility web=new WebDriver_Utility();
		Java_Utility jav=new Java_Utility();
		int ranNum = jav.getRandomValue();
		Excel_Utility elib=new Excel_Utility();
		String organization = elib.getDataFormater("Sheet1",0,0)+ranNum;
		String campaign = elib.getDataFormater("Sheet1",0,2)+ranNum;
		String Opportunity = elib.getDataFormater("Opportunities",0,0)+ranNum;
		
		home.clickOrganizations();
		Create_Org_camp_Opportunities opp=new Create_Org_camp_Opportunities(driver);
		opp.clickCreateORGlink();
		opp.orgTextBox(organization);
		opp.clickOrgSaveButton();
		Thread.sleep(2000); 
		home.moreLink(driver);
		home.clickCampaigns();
		Thread.sleep(2000);
		opp.clickCreateCAMPlink();
		opp.campaignNameTextBox(campaign);
		opp.clickCampSaveButton();
		Thread.sleep(2000);
		opp.clickOpportunitiesLink();
		opp.clickOpportunitiesCreateLink();
		opp.OpportunitiesNameTextBox(Opportunity);
		opp.clickSelectIntiOrganization();
		web.switchToWindow(driver, "Accounts&action");
		opp.orgSearchTextbox(organization);
		opp.clickSearchButton();
		Thread.sleep(3000);
		opp.clickSearchedOrg();
		web.switchToWindow(driver, "Potentials&action");
		Thread.sleep(2000);
		opp.clickSelectIntiCampaign();
		
		web.switchToWindow(driver, "Campaigns&action");
		opp.campSearchTextBox(campaign);
		opp.clickCampSearchButton();
		Thread.sleep(3000);
		opp.clickSelectSearchedCamp();
		web.switchToWindow(driver, "Potentials&action");
		Thread.sleep(2000);
		
	}
}
