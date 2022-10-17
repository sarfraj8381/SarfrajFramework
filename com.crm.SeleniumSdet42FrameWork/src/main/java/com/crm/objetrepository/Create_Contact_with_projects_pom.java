package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Contact_with_projects_pom {

	
	//initialization
	public Create_Contact_with_projects_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactLink;
	
	@FindBy(name="firstname")
	private WebElement firstNameTextFeild;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextFeild;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement contactSaveButton;
	
	//after going to the more then click project link
	//more link is written inside the home_page class
	@FindBy(xpath="//a[@name='Projects']")
	private WebElement projectLink;
	
	@FindBy(xpath="//img[@title='Create Projects...']")
	private WebElement createProjectLink;
	
	@FindBy(xpath="//input[@name='projectname']")
	private WebElement projectNametextFeild;
	
	@FindBy(xpath="//select[@id='linktoaccountscontacts_type']")
	private WebElement selectDropDownLink;

	@FindBy(xpath="(//option[@value='Contacts'])[2]")
	private WebElement selectDropDownContact;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selectPlusContacticon;

	//switch window
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchContactTextFeild;
/////////////////////////////////////////////
	@FindBy(xpath="//input[@type='button']")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement selectSearchContact;
	
	//switch window again
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement projectSaveButton;
	
	

	//getter methods
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

	
	public WebElement getContactSaveButton() 
	{
		return contactSaveButton;
	}

	
	public WebElement getProjectLink() 
	{
		return projectLink;
	}

	
	public WebElement getCreateProjectLink()
	{
		return createProjectLink;
	}

	
	public WebElement getProjectNametextFeild()
	{
		return projectNametextFeild;
	}

	
	public WebElement getSelectDropDownLink()
	{
		return selectDropDownLink;
	}
	
	
	
	public WebElement getSelectDropDownContact() {
		return selectDropDownContact;
	}


	public WebElement getSelectPlusContacticon() {
		return selectPlusContacticon;
	}
	
	
	//business logic for Create Contact Link
	public void clickCreateContactLink()
	{
		createContactLink.click();
	}
	
	

	public WebElement getSearchContactTextFeild() {
		return searchContactTextFeild;
	}
	
	
	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}


	/**
	 * @return the selectSearchContact
	 */
	public WebElement getSelectSearchContact() {
		return selectSearchContact;
	}


	/**
	 * @return the projectSaveButton
	 */
	public WebElement getProjectSaveButton() {
		return projectSaveButton;
	}


	
	//business logic for First Name And Last Name Text Feild
	public void firstLastNameTextFeild(String firstName, String lastName)
	{
		firstNameTextFeild.sendKeys(firstName);
		lastNameTextFeild.sendKeys(lastName);
	}
	
	
	//business logic for Contact Save Button
	public void clickContactSaveButton()
	{
		contactSaveButton.click();
	}
	
	
	//after going to the more then click project link
	//more link is written inside the home_page class
	
	//business logic for Project Link
	public void clickProjectLink()
	{
		projectLink.click();
	}
	
	
	//business logic for Create Project Link
	public void clickCreateProjectLink()
	{
		createProjectLink.click();
	}
	
	
	//business logic for Project Name text Feild
	public void projectNametextFeild(String projectName)
	{
		projectNametextFeild.sendKeys(projectName);
	}
	
	
	//business logic for Select Drop Down Link
	public void clickSelectDropDownLink()
	{
		selectDropDownLink.click();
	}
	
	
	//business logic for Select Drop Down Contact
	public void clickSelectDropDownContact()
	{
		selectDropDownContact.click();
	}
	
	
	//business logic for Select Plus Contact Icon
	public void clickSelectPlusContacticon()
	{
		selectPlusContacticon.click();
	}
	
	//business logic for Search Contact Text Feild
	public void searchContactTextFeild(String contact)
	{
		searchContactTextFeild.sendKeys(contact);
	}
	
	
	//business logic for Search Button
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	
	//business logic for Select Searched Contact
	public void clickSelectSearchContact()
	{
		selectSearchContact.click();
	}
	
	//switch window again
	//business logic for Project Save Button
	public void clickProjectSaveButton()
	{
		projectSaveButton.click();
	}
	
	
	
	
}
