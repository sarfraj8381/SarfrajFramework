package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Product_Delete_product_pom {
		
	
		public Create_Product_Delete_product_pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductLink;
	
	@FindBy(name="productname")
	private WebElement productNameTextBox;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(name="Delete")
	private WebElement deleteButton;
	
	
	//getter methods
	public WebElement getCreateProductLink() {
		return createProductLink;
	}

	
	public WebElement getProductNameTextBox() {
		return productNameTextBox;
	}

	
	public WebElement getSaveButton() {
		return saveButton;
	}

	
	public WebElement getDeleteButton() {
		return deleteButton;
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
	
	//business logic for Save Button
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	//business logic for Delete Button
	public void clickDeleteButton()
	{
		deleteButton.click();
	}
	
	
	
	
	
	
	
	
}
