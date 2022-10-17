package com.crm.Generic_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.objetrepository.Home_Page;
import com.crm.objetrepository.Login_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class{
	 
	public WebDriver driver;
	public static WebDriver sDriver;
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void BS()
	{
		System.out.println("DataBase connection");
	}
	
	
	
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void BT()
	{
		System.out.println("Execute in Parallel mode");
	}
	
	
	
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void BC() throws Throwable
	{
		
		System.out.println("Launching the Browser");
		
		File_Utility flib=new File_Utility();
		String BROWSER = flib.getPropertyValue("browser");
		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		sDriver=driver;
	}
	
	
	
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void BM() throws Throwable
	{
		System.out.println("Login to the Application");
		
		File_Utility flib=new File_Utility();
		
		String URL = flib.getPropertyValue("url");
		String username = flib.getPropertyValue("un");
		String password = flib.getPropertyValue("pw");
		
		WebDriver_Utility webu=new WebDriver_Utility();
		webu.waitPageToLoad(driver);
		webu.maximizeWindow(driver);
		
		driver.get(URL);
		Login_Page log=new Login_Page(driver);
		log.login(username, password);
		
	}
	
	
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void AM()
	{
		System.out.println("Logout to the Application");
		
		Home_Page home =new Home_Page(driver);
		home.getSignoutLink();
	}
	
	
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void AC()
	{
		System.out.println("Closing the Browser");
		driver.close();
	}
	
	
	
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("Executed sucessfully");
	}
	
	
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("DataBase close");
	}
	
	
	
	
	
}
