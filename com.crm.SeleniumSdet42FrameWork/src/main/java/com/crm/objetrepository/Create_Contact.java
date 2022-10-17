package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.Generic_utility.WebDriver_Utility;

public class Create_Contact {
	

	//Initialization
			public Create_Contact(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactLink;
	
	@FindBy(name="firstname")
	private WebElement firstNameTextFeild;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextFeild;
	
	@FindBy(id="phone")
	private WebElement phoneNumberTextFeild;
	
	@FindBy(xpath="//img[contains(@onclick,'return window.')]")
	private WebElement organizationPlusIcon;
	
	//switch the window
	
	@FindBy(xpath="//a[contains(text(),'Qspider978')]")
	private WebElement selectOrganization;
	
	//switch window again
	
	@FindBy(id="mobile")
	private WebElement mobileNumberTextFeild;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement contactSaveButton;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropDown;
	
	@FindBy(id="title")
	private WebElement titleTextFeild;
	
	@FindBy(id="department")
	private WebElement departmentTextFeild;
	
	@FindBy(id="email")
	private WebElement emailTextFeild;
	
	@FindBy(id="assistant")
	private WebElement assistantTextFeild;
	
	@FindBy(id="assistantphone")
	private WebElement assistantPhoneTextFeild;
	
	@FindBy(xpath="//input[@name='emailoptout']")
	private WebElement emailOptOutCheckBox;
	
	@FindBy(xpath="//input[@name='notify_owner']")
	private WebElement notifyOwnerCheckBox;
	

	//getter methods 
	public WebElement getTitleTextFeild()
	{
		return titleTextFeild;
	}


	
	public WebElement getDepartmentTextFeild() 
	{
		return departmentTextFeild;
	}


	public WebElement getEmailTextFeild() 
	{
		return emailTextFeild;
	}


	
	public WebElement getAssistantTextFeild()
	{
		return assistantTextFeild;
	}


	
	public WebElement getAssistantPhoneTextFeild()
	{
		return assistantPhoneTextFeild;
	}


	
	public WebElement getEmailOptOutCheckBox() 
	{
		return emailOptOutCheckBox;
	}


	public WebElement getNotifyOwnerCheckBox() 
	{
		return notifyOwnerCheckBox;
	}

	public WebElement getLeadSourceDropDown()
	{
		return leadSourceDropDown;
	}


	public WebElement getContactSaveButton() {
		return contactSaveButton;
	}


	public WebElement getCreateContactLink()
	{
		return createContactLink;
	}

	
	public WebElement getFirstNameTextFeild()  
	{
		return firstNameTextFeild;
	}

	
	public WebElement getLastNameTextFeild() 
	{
		return lastNameTextFeild;
	}

	
	public WebElement getPhoneNumberTextFeild()
	{
		return phoneNumberTextFeild;
	}

	
	public WebElement getOrganizationPlusIcon() 
	{
		return organizationPlusIcon;
	}

	
	public WebElement getSelectOrganization() 
	{
		return selectOrganization;
	}

	
	public WebElement getMobileNumberTextFeild() 
	{
		return mobileNumberTextFeild;
	}
	
	
	//business logic for Create Contact Link
	public void clickCreateContactLink()
	{
		createContactLink.click();
	}
	
	
	//business logic for First Name Last Name Text Feild
	public void firstNameLastNameTextFeild(String firstName, String lastName)
	{
		firstNameTextFeild.sendKeys(firstName);
		lastNameTextFeild.sendKeys(lastName);
	}
	
	
	//business logic for Phone Number Text Feild
	public void phoneNumberTextFeild(String phoneNumber)
	{
		phoneNumberTextFeild.sendKeys(phoneNumber);
	}
	
	
	//business logic for Organization Plus Icon
	public void clickOrganizationPlusIcon()
	{
		organizationPlusIcon.click();
	}
	
	//switch window
	//business logic for Select Organization
	public void clickSelectOrganization()
	{
		selectOrganization.click();
	}
	
	//switch window again
	//business logic for Mobile Number Text Feild
	public void mobileNumberTextFeild(String mobileNumber)
	{
		mobileNumberTextFeild.sendKeys(mobileNumber);
	}
	
	
	//business logic for Contact Save Button
	public void clickContactSaveButton()
	{
		contactSaveButton.click();
	}
	
	
	//business logic for Lead Source Drop Down
	
	public void leadSourceDropDown()
	{
		Select s=new Select(leadSourceDropDown);
		s.selectByValue("Public Relations");
		
	}
	
	//business logic for Title Text Feild
	public void titleTextFeild(String title)
	{
		titleTextFeild.sendKeys(title);
	}
	
	
	//business logic for Department Text Feild
	public void departmentTextFeild(String department)
	{
		departmentTextFeild.sendKeys(department);
	}
	
	
	//business logic for Email Text Feild
	public void emailTextFeild(String email)
	{
		emailTextFeild.sendKeys(email);
	}
	
	
	//business logic for Assistant Text Feild
	public void assistantTextFeild(String assistantName)
	{
		assistantTextFeild.sendKeys(assistantName);
	}
	
	
	//business logic for Assistant Phone Text Feild
	public void assistantPhoneTextFeild(String assistantPhone)
	{
		assistantPhoneTextFeild.sendKeys(assistantPhone);
	}
	
	
	//business logic for Check Box
	public void checkBox()
	{
		emailOptOutCheckBox.click();
		notifyOwnerCheckBox.click();
	}
	
	
	//business logic for 
	
	
	//business logic for 
	
	
	//business logic for 
}
