package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Opportunities {

	//initialization
	public Create_Opportunities(WebDriver driver) 
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
