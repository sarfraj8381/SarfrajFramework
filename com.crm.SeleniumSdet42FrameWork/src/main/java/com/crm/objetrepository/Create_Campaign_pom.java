package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Campaign_pom {
		
	
	public Create_Campaign_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createCampaignLink;
	
	@FindBy(name="campaignname")
	private WebElement campaignNameTextBox;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	public WebElement getCreateCampaignLink() {
		return createCampaignLink;
	}

	
	public WebElement getCampaignNameTextBox() {
		return campaignNameTextBox;
	}

	
	public WebElement getSaveButton() {
		return saveButton;
	}
	//business logic for Create Campaign Link
	public void clickCreateCampaignLink()
	{
		createCampaignLink.click();
	}
	
	//business logic for Create Campaign Name TextBox
	public void CreateCampaignTextbox(String campaignName)
	{
			campaignNameTextBox.sendKeys(campaignName);
	}
	
		//business logic for save Button
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
