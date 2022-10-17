package com.crm.product;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
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
import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.File_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Product_Delete_product_pom;
import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Product_Delete_product_M_Test extends Base_Class {

	@Test//(groups = {"smokeTest","regressionTest"})
	public void create_Product_Delete_product_M_Test() throws Throwable 
	{
		
		WebDriver_Utility webu=new WebDriver_Utility();
		Java_Utility jav=new Java_Utility();
		int ranNum = jav.getRandomValue();
		
		Excel_Utility excl=new Excel_Utility();
		String product = excl.getExcelValue("Sheet1", 0, 1)+ranNum;
		
		Home_Page home=new Home_Page(driver);
		home.clickProduct();
		
		Create_Product_Delete_product_pom pro=new Create_Product_Delete_product_pom(driver);
		pro.clickCreateProductLink();
		pro.putProductNameTextBox(product);
		
		pro.clickSaveButton();
		pro.clickDeleteButton();
		driver.switchTo().alert().accept();
		
	}

}
