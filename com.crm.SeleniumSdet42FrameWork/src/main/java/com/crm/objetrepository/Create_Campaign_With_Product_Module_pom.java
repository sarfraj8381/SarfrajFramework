package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Campaign_With_Product_Module_pom {
	
	
		
		public Create_Campaign_With_Product_Module_pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductLink;
	
	@FindBy(name="productname")
	private WebElement productNameTextBox;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement productSaveButton;
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createCampaignLink;
	
	@FindBy(name="campaignname")
	private WebElement campaignNameTextBox;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement intigrationProductLink;
	
	@FindBy(id="search_txt")
	private WebElement intigrationSearchTextBox;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
	@FindBy(partialLinkText="Hp Laptop")
	private WebElement selectSearchItem;		
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement campaignSaveButton;
	
	
	//getter methods
	public WebElement getCreateProductLink() {
		return createProductLink;
	}

	
	public WebElement getProductNameTextBox() {
		return productNameTextBox;
	}

	
	public WebElement getProductSaveButton() {
		return productSaveButton;
	}

	
	public WebElement getCreateCampaignLink() {
		return createCampaignLink;
	}

	
	public WebElement getCampaignNameTextBox() {
		return campaignNameTextBox;
	}

	
	public WebElement getIntigrationProductLink() {
		return intigrationProductLink;
	}

	
	public WebElement getIntigrationSearchTextBox() {
		return intigrationSearchTextBox;
	}

	
	public WebElement getSearchButton() {
		return searchButton;
	}

	
	public WebElement getSelectSearchItem() {
		return selectSearchItem;
	}

	public WebElement getCampaignSaveButton() {
		return campaignSaveButton;
	}
	
	//business logic for Create Product Link 
	public void clickCreateProductLink()
	{
		createProductLink.click();
	}
	
	
	//business logic for Product Name TextBox
	public void putProductNameTextBox(String productName)
	{
		productNameTextBox.sendKeys(productName);
	}
	
	
	//business logic for 
	public void clickProductSaveButton()
	{
		productSaveButton.click();
	}
	
	
	//business logic for Create campaign link 
	public void clickCreateCampaignLink()
	{
		createCampaignLink.click();
	}
	
	
	//business logic for Campaign Name TextBox
	public void putCampaignNameTextBox(String campaignName)
	{
		campaignNameTextBox.sendKeys(campaignName);
	}
	
	
	//business logic for Integration Product Link
	public void clickIntegrationProductLink()
	{
		intigrationProductLink.click();
	}
	
	
	//business logic for Integration Search TextBox 
	public void putIntegrationSearchTextBox(String productName)
	{
		intigrationSearchTextBox.sendKeys(productName);
	}
	
	
	//business logic for Search Button
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	
	//business logic for Select Search Item
	public void clickSelectedSearchItem()
	{
		selectSearchItem.click();
	}
	
	
	//business logic for Campaign Save Button
	public void clickCampaignSaveButton()
	{
		campaignSaveButton.click();
	}
}
