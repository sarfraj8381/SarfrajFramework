package com.crm.campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.File_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Campaign_pom;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;
import com.crm.objetrepository.Validation_And_Varification_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.crm.Generic_utility.ListenerImplementationClass.class)
public class Create_Campaign_Test extends Base_Class {

	@Test(groups = "smokeTest")
	public void create_Campaign_Test() throws Throwable 
	{
		
		Java_Utility jav=new Java_Utility();
		int ranNum = jav.getRandomValue();
		
		Excel_Utility excl=new Excel_Utility();
		String campaignN = excl.getExcelValue("Sheet1", 0, 2)+ranNum;
		
		Home_Page home=new Home_Page(driver);
		home.moreLink(driver);
		home.clickCampaigns();
		
		
		Create_Campaign_pom camp=new Create_Campaign_pom(driver);
		camp.clickCreateCampaignLink();
		camp.CreateCampaignTextbox(campaignN);
		camp.clickSaveButton();
		
		Validation_And_Varification_Page validate =new Validation_And_Varification_Page(driver);
		validate.campaignValidation(driver, campaignN);
	}

}
