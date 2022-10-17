package com.crm.organisation;

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
import org.testng.asserts.SoftAssert;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.File_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Organisation;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;
import com.crm.objetrepository.Validation_And_Varification_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.crm.Generic_utility.ListenerImplementationClass.class)
public class Create_Organisation_Module_Test extends Base_Class {
	
	@Test//(retryAnalyzer = com.crm.Generic_utility.RetryAnalyzer.class)
	public void create_Organisation_Module_Test() throws Throwable {
		
		Java_Utility ja=new Java_Utility();
		int ranNum = ja.getRandomValue();
		
		Excel_Utility excl=new Excel_Utility();
		String organization = excl.getExcelValue("Sheet1", 0, 0)+ranNum;
		
		Home_Page home=new Home_Page(driver);
		home.clickOrganizations();
		
		Create_Organisation org=new Create_Organisation(driver);
		org.clickCreateOrganizationLink();
		//Assert.assertEquals(true, false);
		org.putOrganizatinName(organization);
		
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(true, false);
		
		org.clickOnSaveButton();
		
		Validation_And_Varification_Page validate=new Validation_And_Varification_Page(driver);
		validate.organizationValidation(driver, organization);
		//soft.assertAll();
	}
	
}
