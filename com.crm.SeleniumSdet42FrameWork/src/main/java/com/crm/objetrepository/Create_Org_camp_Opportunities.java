package com.crm.objetrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Org_camp_Opportunities {

	//initialization
	public Create_Org_camp_Opportunities(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createORGlink;

	@FindBy(name="accountname")
	private WebElement orgTextBox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement OrgSaveButton;
	
	@FindBy(name="Campaigns")
	private WebElement campaignLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCAMPlink;
	
	@FindBy(name="campaignname")
	private WebElement campaignNameTextBox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement CampSaveButton;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement opportunitiesLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement opportunitiesCreateLink;
	
	@FindBy(name="potentialname")
	private WebElement OpportunitiesNameTextBox;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif' and @tabindex]")
	private WebElement selectIntiOrganization;
	
	//switch window
	@FindBy(id="search_txt")
	private WebElement orgSearchTextbox;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[contains(text(),'Qspider')]")
	private WebElement searchedOrg;
	
	//switch window
	//////////////////////////////////////////////////////
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement selectIntiCampaign;
	//switch window
	@FindBy(id="search_txt")
	private WebElement campSearchTextBox;
	
	@FindBy(name="search")
	private WebElement campSearchButton;
	
	@FindBy(xpath="//a[contains(text(),'Sarfraj')]")
	private WebElement selectSearchedCamp;
	
	//switch window
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement opportunitiesSave;
	
	

	//getter method
	public WebElement getCreateORGlink() {
		return createORGlink;
	}

	

	public WebElement getOrgTextBox() {
		return orgTextBox;
	}

	public WebElement getOrgSaveButton() {
		return OrgSaveButton;
	}

	
	public WebElement getCampaignLink() {
		return campaignLink;
	}

	
	public WebElement getCreateCAMPlink() {
		return createCAMPlink;
	}

	
	public WebElement getCampaignNameTextBox() {
		return campaignNameTextBox;
	}

	
	public WebElement getCampSaveButton() {
		return CampSaveButton;
	}
	

	
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	
	public WebElement getOpportunitiesCreateLink() {
		return opportunitiesCreateLink;
	}

	
	public WebElement getOpportunitiesNameTextBox() {
		return OpportunitiesNameTextBox;
	}

	
	public WebElement getSelectIntiOrganization() {
		return selectIntiOrganization;
	}

	
	public WebElement getOrgSearchTextbox() {
		return orgSearchTextbox;
	}
	
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	
	public WebElement getSearchedOrg() {
		return searchedOrg;
	}
	
	
	public WebElement getSelectIntiCampaign() {
		return selectIntiCampaign;
	}

	
	public WebElement getCampSearchTextBox() {
		return campSearchTextBox;
	}

	
	public WebElement getCampSearchButton() {
		return campSearchButton;
	}

	
	public WebElement getSelectSearchedCamp() {
		return selectSearchedCamp;
	}
	
	
	public WebElement getOpportunitiesSave() {
		return opportunitiesSave;
	}
	
	
	//business logic for Create Organization Link
	public void clickCreateORGlink()
	{
		createORGlink.click();
	}
	
	//business logic for Organization Text Box
	public void orgTextBox(String organizationName)
	{
		orgTextBox.sendKeys(organizationName);
	}
	
	
	//business logic for Organization Save Button
	public void clickOrgSaveButton()
	{
		OrgSaveButton.click();
	}
	
	
	//business logic for Click Campaign Link
	public void clickCampaignLink()
	{
		campaignLink.click();
	}
	
	
	//business logic for Create Campaign Link
	public void clickCreateCAMPlink()
	{
		createCAMPlink.click();
	}
	
	
	//business logic for Campaign Name Text Box
	public void campaignNameTextBox(String campaignName)
	{
		campaignNameTextBox.sendKeys(campaignName);
	}
	
	
	//business logic for Campaign Save Button
	public void clickCampSaveButton()
	{
		CampSaveButton.click();
	}
	
	
	//business logic for Opportunities Link
	public void clickOpportunitiesLink()
	{
		opportunitiesLink.click();
	}
	
	
	//business logic for Opportunities Create Link
	public void clickOpportunitiesCreateLink()
	{
		opportunitiesCreateLink.click();
	}
	
	
	//business logic for Opportunities Name Text Box
	public void OpportunitiesNameTextBox(String opportunities)
	{
		OpportunitiesNameTextBox.sendKeys(opportunities);
	}
	
	
	//business logic for Select Intigration Organization
	public void clickSelectIntiOrganization()
	{
		selectIntiOrganization.click();
	}
	
	//switch window
	//business logic for Organization Search Textbox
	public void orgSearchTextbox(String organizationSearch)
	{
		orgSearchTextbox.sendKeys(organizationSearch);
	}
	
	
	//business logic for Search Button
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	
	//business logic for Searched Organization
	public void clickSearchedOrg()
	{
		searchedOrg.click();
	}
	
	
	//business logic for Select Intigration Campaign
	public void clickSelectIntiCampaign()
	{
		selectIntiCampaign.click();
	}
	
	//switch window
	//business logic for Campaign Search Text Box
	public void campSearchTextBox(String campaignSearch)
	{
		campSearchTextBox.sendKeys(campaignSearch);
	}
	
	
	//business logic for Campaign Search Button
	public void clickCampSearchButton()
	{
		campSearchButton.click();	
	}
	
	
	//business logic for Select Searched Campaign
	public void clickSelectSearchedCamp()
	{
		selectSearchedCamp.click();
	}
	
	
	//business logic for Opportunities Save
	public void clickOpportunitiesSave()
	{
		opportunitiesSave.click();
	}
	
	
	//business logic for 
	
}
