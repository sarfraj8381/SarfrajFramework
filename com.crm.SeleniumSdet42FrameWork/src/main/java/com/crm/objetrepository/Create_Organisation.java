package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Organisation {

	

	//initialization
			public Create_Organisation(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//img[@title='Create Organization...']")
			private WebElement createOrganizationLink;
			
			@FindBy(name="accountname")
			private WebElement giveOrganizationName;
			
			@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
			private WebElement clickOnSaveLink;
			
			
			//create getter methods
			
			public WebElement getCreateOrganizationLink() {
				return createOrganizationLink;
			}
			
			
			public WebElement getGiveOrganizatinName() {
				return giveOrganizationName;
			}
			
			
			public WebElement getClickOnSaveLink() {
				return clickOnSaveLink;
			}
			
			
			//business logic for Create Organization 
			public void clickCreateOrganizationLink()
			{
				createOrganizationLink.click();
			}
			
			
			//business logic for putting value in send key 
			public void putOrganizatinName(String organization)
			{
				giveOrganizationName.sendKeys(organization);
			}
			//business logic for save button
			
			public void clickOnSaveButton()
			{
				clickOnSaveLink.click();
			}
			
			
			
			
			}
