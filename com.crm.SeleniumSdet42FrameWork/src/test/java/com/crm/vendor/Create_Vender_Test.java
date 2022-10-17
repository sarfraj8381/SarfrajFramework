package com.crm.vendor;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.objetrepository.Create_Vender;
import com.crm.objetrepository.Home_Page;
public class Create_Vender_Test extends Base_Class {

	@Test
	public void Create_Vender_Test() throws Throwable
	{
		Home_Page home =new Home_Page(driver);
		home.moreLink(driver);
		
		Java_Utility ran=new Java_Utility();
		int ranNum = ran.getRandomValue();
		
		Excel_Utility elib=new Excel_Utility();
		String vendorName = elib.getDataFormater("vendor", 1, 0)+ranNum;
		String email = elib.getDataFormater("vendor", 1, 1);
		String category = elib.getDataFormater("vendor", 1, 2);		
		String phone = elib.getDataFormater("vendor", 1, 3);
		String website = elib.getDataFormater("vendor", 1, 4);
		String street = elib.getDataFormater("vendor", 1, 5);
		String city = elib.getDataFormater("vendor", 1, 6);
		String postalcode = elib.getDataFormater("vendor", 1, 7);
		String pobox = elib.getDataFormater("vendor", 1, 8);
		String state = elib.getDataFormater("vendor", 1, 9);
		String country = elib.getDataFormater("vendor", 1, 10);	
		
		
		Create_Vender vendor=new Create_Vender(driver);
		
		vendor.clickVendorsLink();
		vendor.clickCreateVendorLink();
		vendor.vendorNameTextFeild(vendorName);
		vendor.emailTextFeild(email);
		vendor.GLAccountDropDown();
		vendor.categoryTextFeild(category);
		vendor.phoneTextFeild(phone);
		vendor.websiteTextFeild(website);
		vendor.streetTextFeild(street);
		vendor.cityTextFeild(city);
		vendor.postalCodeTextFeild(postalcode);
		vendor.poboxTextFeild(pobox);
		vendor.stateTextFeild(state);
		vendor.countryTextFeild(country);
		vendor.clickVendoreSaveButton();
		
		String vendorCreated = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if(vendorCreated.contains(vendorName))
		{
			System.out.println("vendor created and pass");
		}
		else
		{
			System.out.println("vendor not created and fail");
			System.out.println("PULLED SUCCESSFULLY");
		}
		
	}
	
}
