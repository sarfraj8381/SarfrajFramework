package com.crm.contact;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Generic_utility.Base_Class;
import com.crm.Generic_utility.Excel_Utility;
import com.crm.Generic_utility.Java_Utility;
import com.crm.Generic_utility.WebDriver_Utility;
import com.crm.objetrepository.Create_Contact;
import com.crm.objetrepository.Home_Page;

public class Create_Contact_Test extends Base_Class{

	
	@Test
	public void Create_Contact_Test() throws Throwable
	{
		Home_Page home =new Home_Page(driver);
		home.clickContactLink();
		Java_Utility j=new Java_Utility();
		int ranNum = j.getRandomValue();
		Excel_Utility elib=new Excel_Utility();
		String firstName = elib.getDataFormater("contact", 0, 0)+ranNum;
		String lastName = elib.getDataFormater("contact",0,1)+ranNum;
		String phoneNumber = elib.getDataFormater("contact",0,2);
		String moblieNumber = elib.getDataFormater("contact",1,0);
		String title = elib.getDataFormater("contact", 2,0)+ranNum;
		String department = elib.getDataFormater("contact", 2, 1);
		String email = elib.getDataFormater("contact", 2, 2);
		String assistant = elib.getDataFormater("contact", 2, 3)+ranNum;
		String assistantPhone = elib.getDataFormater("contact", 2, 4);
		
		Create_Contact cont=new Create_Contact(driver);
		cont.clickCreateContactLink();
		cont.firstNameLastNameTextFeild(firstName, lastName);
		cont.clickOrganizationPlusIcon();
		
		WebDriver_Utility web=new WebDriver_Utility();
		web.switchToWindow(driver, "Accounts&action");
		
		cont.clickSelectOrganization();
		web.switchToWindow(driver, "Contacts&action");
		Thread.sleep(3000);
		cont.phoneNumberTextFeild(phoneNumber);
		cont.mobileNumberTextFeild(moblieNumber);
		cont.leadSourceDropDown();
		cont.titleTextFeild(title);
		cont.departmentTextFeild(department);
		cont.emailTextFeild(email);
		cont.assistantTextFeild(assistant);
		cont.assistantPhoneTextFeild(assistantPhone);
		cont.checkBox();
		
		
		
		cont.clickContactSaveButton();
		
		String createdContact = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(createdContact.contains(lastName))
		{
			System.out.println("contact created and pass");
		}
		else
		{
			System.out.println("contact not created and fail");
		}
	}
}
