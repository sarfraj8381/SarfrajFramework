package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Vender {

	//Initialization
	public Create_Vender(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Vendors']")
	private WebElement vendorsLink;
	
	@FindBy(xpath="//img[contains(@src,'themes/softed/images/btnL3A')]")
	private WebElement createVendorLink;
	
	@FindBy(name="vendorname")
	private WebElement vendorNameTextFeild;
	
	@FindBy(id="email")
	private WebElement emailTextFeild;
	
	@FindBy(name="glacct")
	private WebElement GLAccountDropDown;
	
	@FindBy(id="category")
	private WebElement categoryTextFeild;
	
	@FindBy(id="phone")
	private WebElement phoneTextFeild;
	
	@FindBy(name="website")
	private WebElement websiteTextFeild;
	
	@FindBy(name="street")
	private WebElement streetTextFeild;
	
	@FindBy(id="city")
	private WebElement cityTextFeild;
	
	@FindBy(id="postalcode")
	private WebElement postalCodeTextFeild;
	
	@FindBy(id="pobox")
	private WebElement poboxTextFeild;
	
	@FindBy(id="state")
	private WebElement stateTextFeild;
	
	@FindBy(id="country")
	private WebElement countryTextFeild;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement vendoreSaveButton;

	//@FindBy(xpath="//span[@class='lvtHeaderText']")
	//private WebElement conformationText;
	
	
	//getter methods
	public WebElement getVendorsLink() 
	{
		return vendorsLink;
	}

	
	public WebElement getCreateVendorLink()
	{
		return createVendorLink;
	}

	
	public WebElement getVendorNameTextFeild()
	{
		return vendorNameTextFeild;
	}

	
	public WebElement getEmailTextFeild()
	{
		return emailTextFeild;
	}

	
	public WebElement getGLAccountDropDown()
	{
		return GLAccountDropDown;
	}

	
	public WebElement getCategoryTextFeild()
	{
		return categoryTextFeild;
	}

	
	public WebElement getPhoneTextFeild()
	{
		return phoneTextFeild;
	}

	
	public WebElement getWebsiteTextFeild()
	{
		return websiteTextFeild;
	}

	
	public WebElement getStreetTextFeild()
	{
		return streetTextFeild;
	}

	
	public WebElement getCityTextFeild()
	{
		return cityTextFeild;
	}
	
	public WebElement getPostalCodeTextFeild() 
	{
		return postalCodeTextFeild;
	}


	public WebElement getPoboxTextFeild() 
	{
		return poboxTextFeild;
	}

	
	public WebElement getStateTextFeild() 
	{
		return stateTextFeild;
	}

	
	public WebElement getCountryTextFeild() 
	{
		return countryTextFeild;
	}

	
	public WebElement getVendoreSaveButton() 
	{
		return vendoreSaveButton;
	}
	
	/*public WebElement getConformationText() 
	{
		return conformationText;
	}*/
	
	
	//business logic for Vendors Link
	public void clickVendorsLink()
	{
		vendorsLink.click();
	}
	
	
	//business logic for Create Vendor Link
	public void clickCreateVendorLink()
	{
		createVendorLink.click();
	}
	
	
	//business logic for Vendor Name Text Feild
	public void vendorNameTextFeild(String vendor)
	{
		vendorNameTextFeild.sendKeys(vendor);
	}
	
	
	//business logic for Email Text Feild
	public void emailTextFeild(String email)
	{
		emailTextFeild.sendKeys(email);
	}
	
	
	//business logic for GL Account Drop Down
	public void GLAccountDropDown()
	{
		Select s=new Select(GLAccountDropDown);
		s.selectByValue("304-Sales-Software-Support");
	}
	
	
	//business logic for Category Text Feild
	public void categoryTextFeild(String category)
	{
		categoryTextFeild.sendKeys(category);
	}
	
	
	//business logic for Phone Text Feild
	public void phoneTextFeild(String phone)
	{
		phoneTextFeild.sendKeys(phone);
	}
	
	
	//business logic for Website Text Feild
	public void websiteTextFeild(String website)
	{
		websiteTextFeild.sendKeys(website);
	}
	
	
	//business logic for Street Text Feild
	public void streetTextFeild(String street)
	{
		streetTextFeild.sendKeys(street);
	}
	
	
	//business logic for City Text Feild
	public void cityTextFeild(String city)
	{
		cityTextFeild.sendKeys(city);
	}
	
	//business logic for Postal Code Text Feild
	public void postalCodeTextFeild(String postalcode)
	{
		postalCodeTextFeild.sendKeys(postalcode);
	}
	
	
	//business logic for PO Box Text Feild
	public void poboxTextFeild(String pobox)
	{
		poboxTextFeild.sendKeys(pobox);
	}
	
	
	//business logic for State Text Feild
	public void stateTextFeild(String state)
	{
		stateTextFeild.sendKeys(state);
	}
	
	
	//business logic for Country Text Feild
	public void countryTextFeild(String country)
	{
		countryTextFeild.sendKeys(country);
	}
	
	
	//business logic for Vendore Save Button
	public void clickVendoreSaveButton()
	{
		vendoreSaveButton.click();
	}
	
	
	//business logic for Conformation Text
	/*public void conformationText()
	{
		conformationText.getText();
	}*/
	
}
