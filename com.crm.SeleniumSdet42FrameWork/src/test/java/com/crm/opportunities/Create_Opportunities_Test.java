package com.crm.opportunities;

import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.objetrepository.Create_Campaign_pom;
import com.crm.objetrepository.Create_Organisation;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Validation_And_Varification_Page;

public class Create_Opportunities_Test extends Base_Class {

	@Test
	public void Create_Opportunities_Test() throws Throwable {
		
		Java_Utility ja=new Java_Utility();
		int ranNum = ja.getRandomValue();
		
		Excel_Utility excl=new Excel_Utility();
		String organization = excl.getExcelValue("Sheet1", 0, 0)+ranNum;
		
		Home_Page home=new Home_Page(driver);
		home.clickOrganizations();
		
		Create_Organisation org=new Create_Organisation(driver);
		org.clickCreateOrganizationLink();
		org.putOrganizatinName(organization);
		org.clickOnSaveButton();
		
		Validation_And_Varification_Page validate=new Validation_And_Varification_Page(driver);
		validate.organizationValidation(driver, organization);
		
		
		//now we create campaign 
		String campaignN = excl.getExcelValue("Sheet1", 0, 2)+ranNum;
		
		home.moreLink(driver);
		home.clickCampaigns();
		
		Create_Campaign_pom camp=new Create_Campaign_pom(driver);
		camp.clickCreateCampaignLink();
		camp.CreateCampaignTextbox(campaignN);
		camp.clickSaveButton();
		
		validate.campaignValidation(driver, campaignN);
	}
}
