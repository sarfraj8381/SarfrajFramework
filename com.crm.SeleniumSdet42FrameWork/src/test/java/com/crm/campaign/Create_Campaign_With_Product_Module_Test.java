package com.crm.campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
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
import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.File_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Campaign_With_Product_Module_pom;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;
import com.crm.objetrepository.Validation_And_Varification_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Campaign_With_Product_Module_Test extends Base_Class {

	@Test//(groups = {"smokeTest","regressionTest"})
	public void create_Campaign_With_Product_Module_Test() throws Throwable
	{
		
		WebDriver_Utility webu=new WebDriver_Utility();
		Home_Page home=new Home_Page(driver);
		Excel_Utility elib=new Excel_Utility();
		
		Java_Utility j= new Java_Utility();
		int ranNum = j.getRandomValue();
		
		
		String campaign = elib.getExcelValue("Sheet1", 0, 2)+ranNum;
		String product = elib.getExcelValue("Sheet1", 0, 1)+ranNum;
		
		
		home.clickProduct();
		
		Create_Campaign_With_Product_Module_pom campPro =new Create_Campaign_With_Product_Module_pom(driver);
		
		campPro.clickCreateProductLink();
		campPro.putProductNameTextBox(product);
		campPro.clickProductSaveButton();
		
		home.moreLink(driver);
		home.clickCampaigns();
		
		campPro.clickCreateCampaignLink();
		campPro.putCampaignNameTextBox(campaign);
		campPro.clickIntegrationProductLink();
		
		//Thread.sleep(5000);
		//switching the window
		webu.switchToWindow(driver,"Products&action");
		
		campPro.putIntegrationSearchTextBox(product);
		campPro.clickSearchButton();
		campPro.clickSelectedSearchItem();

		Thread.sleep(2000);
		//here we switch window again
		webu.switchToWindow(driver, "Campaigns&action");
		
		 campPro.clickCampaignSaveButton();
		 
		 Validation_And_Varification_Page validate =new Validation_And_Varification_Page(driver);
		 validate.campaignProductValidation(driver, product);
	}
}
