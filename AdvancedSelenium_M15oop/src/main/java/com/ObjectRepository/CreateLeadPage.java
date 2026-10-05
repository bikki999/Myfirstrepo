package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage 
{
	@FindBy(css = "input[value='Search...']") 
	private WebElement SearchBarTextField;
	
	@FindBy(className = "searchBtn")
	private WebElement SearchButton;
	
	@FindBy(css = "img[src='themes/softed/images/user.PNG']") 
	private WebElement UserIconButton;
	
	@FindBy(id="_my_preferences_")
	private WebElement MyPreferencesButton;
	
	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	private WebElement SignOutButton;
	
	@FindBy(css = "img[src='themes/softed/images/info.PNG']") 
	private WebElement InfoIconButton;
	
	@FindBy(linkText = "Help") 
	private WebElement HelpButton;
	
	@FindBy(linkText = "Feedback") 
	private WebElement FeedbackButton;
	
	@FindBy(css = "img[src='themes/softed/images/mainSettings.PNG']") 
	private WebElement MainSettingsIcon;
	
	@FindBy(linkText = "CRM Settings") 
	private WebElement CRMSettingsButton;
	
	@FindBy(css = "img[src='themes/softed/images/Home.PNG']") 
	private WebElement HomePageIconButton;
	
	@FindBy(linkText = "Calendar") 
	private WebElement CalendarButton;
	
	@FindBy(linkText = "Leads") 
	private WebElement LeadsButton;
	
	@FindBy(linkText = "Organizations") 
	private WebElement OrganizationsButton;
	
	@FindBy(linkText = "Contacts") 
	private WebElement ContactsButton;
	
	@FindBy(linkText = "Opportunities") 
	private WebElement OpportunitiesButton;
	
	@FindBy(linkText = "Products") 
	private WebElement ProductsButton;
	
	@FindBy(linkText = "Documents") 
	private WebElement DocumentsButton;
	
	@FindBy(linkText = "Email") 
	private WebElement EmailButton; 
	
	@FindBy(linkText = "Trouble Tickets") 
	private WebElement  TroubleTicketsButton;
	
	@FindBy(linkText = "Dashboard") 
	private WebElement  DashboardButton;
	
	@FindBy(xpath = "//a[@href='javascript:;'][normalize-space()='More']") 
	private WebElement MoreButton;
	
	@FindBy(xpath = "//a[@name='SMSNotifier']") 
	private WebElement SMSNotifierButton;
	
	@FindBy(name = "Our Sites") 
	private WebElement  OurSitesButton;
	
	@FindBy(name = "Integration") 
	private WebElement  IntegrationButton;
	
	@FindBy(name = "Mail Manager") 
	private WebElement  MailManagerButton;
	
	@FindBy(name = "PBX Manager") 
	private WebElement  PBXManagerButton;
	
	@FindBy(name = "Comments") 
	private WebElement  CommentsButton;
	
	@FindBy(name = "Recycle Bin") 
	private WebElement  RecycleBinButton;
	
	@FindBy(name = "RSS") 
	private WebElement  RSSButton;
	
	@FindBy(name  = "Reports") 
	private WebElement ReportsButton;
	
	@FindBy(name = "Campaigns") 
	private WebElement CampaignsButton;
	
	@FindBy(name = "Service Contracts") 
	private WebElement  ServiceContractsButton;
	
	@FindBy(name = "Project Milestones") 
	private WebElement ProjectMilestonesButton;
	
	@FindBy(name = "Project Tasks") 
	private WebElement ProjectTasksButton;
	
	@FindBy(name = "Projects") 
	private WebElement ProjectsButton;
	
	@FindBy(name = "FAQ") 
	private WebElement  FAQButton;
	
	@FindBy(name = "Services") 
	private WebElement ServicesButton;
	
	@FindBy(name  = "Assets") 
	private WebElement AssetsButton;
	
	@FindBy(name  = "Purchase Order") 
	private WebElement PurchaseOrderButton;
	
	@FindBy(name  = "Price Books") 
	private WebElement PriceBooksButton;
	
	@FindBy(name  = "Vendors") 
	private WebElement VendorsButton;
	
	@FindBy(name  = "Invoice") 
	private WebElement InvoiceButton;
	
	@FindBy(name  = "Sales Order") 
	private WebElement SalesOrderButton;
	
	@FindBy(name  = "Quotes") 
	private WebElement QuotesButton;
	
	@FindBy(id="qccombo") 
	private WebElement QuickCreateDropDownButton;
	
	//----------------
	
	@FindBy(xpath = "//a[@class='hdrLink']") 
	private WebElement LeadsHeaderButton;
	
	@FindBy(css = "img[title='Create Lead...']")
	private WebElement CreateLeadIcon;
	
	@FindBy(css = "img[title='Open Calendar...']") 
	private WebElement OpenCalendarIcon;
	
	@FindBy(css = "img[title='Show World Clock...']") 
	private WebElement ShowWorldClockIcon;
	
	@FindBy(css = "img[title='Open Calculator...']") 
	private WebElement OpenCalculatorIcon;
	@FindBy(css = "img[title='Chat...']")
	private WebElement ChatIcon;
	
	@FindBy(css = "img[title='Last Viewed']")
	private WebElement LastViewedIcon;
	
	@FindBy(css = "img[title='Import Leads']")
	private WebElement ImportLeadssIcon;
	
	@FindBy(css = "img[title='Export Leads']")
	private WebElement ExportLeadsIcon;
	
	@FindBy(css = "img[title='Leads Settings']")
	private WebElement LeadsSettingsIcon;
	
	
	//------------------
	
	@FindBy(xpath = "//input[contains(@class,'crmButton small save')]")
	private WebElement SaveButton;
	
	@FindBy(css = "input[title='Cancel [Alt+X]'][value='Cancel  ']") 
	private WebElement CancelButton;
	
	@FindBy(name="salutationtype") 
	private WebElement SalutationTypeDropdown;
	
	@FindBy(name="firstname") 
	private WebElement FirstNameTextfield;
	
	@FindBy(name="lastname") 
	private WebElement LastNameTextField;
	
	@FindBy(name="company") 
	private WebElement CompanyTextField;
	
	@FindBy(id="designation") 
	private WebElement TitleTextField;
	
	@FindBy(css = "select[name='leadsource']select[name='leadsource']") 
	private WebElement LeadSourceDropdown;
	
	@FindBy(css = "select[name='industry']") 
	private WebElement IndustryDropdown;
	
	@FindBy(name="annualrevenue") 
	private WebElement AnnualRevenueTextField;
	
	@FindBy(id = "noofemployees") 
	private WebElement NoOfEmployeesTextField;
	
	@FindBy(id="secondaryemail") 
	private WebElement SecondaryEmailTextField;
	
	@FindBy(id="phone") 
	private WebElement PhoneTextField;
	
	@FindBy(id="mobile") 
	private WebElement MobileTextField;
	
	@FindBy(id="fax") 
	private WebElement FaxTextField;
	
	@FindBy(id="email") 
	private WebElement EmailTextField;
	
	@FindBy(css = "input[name='website']") 
	private WebElement WebsiteTextField;
	
	@FindBy(name="leadstatus") 
	private WebElement LeadStatusDropdown;
	
	@FindBy(name="rating") 
	private WebElement RatingDropdown;
	
	@FindBy(css = "input[value='U']") 
	private WebElement AssignedToUserRadioButton;
	
	@FindBy(css = "input[value='T']") 
	private WebElement AssignedToGroupRadioButton;
	
	@FindBy(name="assigned_user_id") 
	private WebElement AssignedToUserDropdown;
	
	@FindBy(name="assigned_group_id") 
	private WebElement AssignedToGroupDropdown;
	
	@FindBy(name="lane") 
	private WebElement StreetTextField;
	
	@FindBy(id="code") 
	private WebElement PostalCodeTextField ;
	
	@FindBy(id="country") 
	private WebElement CountryTextField;
	
	@FindBy(id="pobox") 
	private WebElement POBoxTextField;
	
	@FindBy(id="city") 
	private WebElement CityTextField;
	
	@FindBy(id="state") 
	private WebElement StateTextField;
	
	@FindBy(css = "textarea[name='description']") 
	private WebElement DescriptionTextField;
	
	@FindBy(xpath = "//a[normalize-space()='vtiger.com']") 
	private WebElement WebsiteLink;
	
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getSearchBarTextField() {
		return SearchBarTextField;
	}


	public WebElement getSearchButton() {
		return SearchButton;
	}


	public WebElement getUserIconButton() {
		return UserIconButton;
	}


	public WebElement getMyPreferencesButton() {
		return MyPreferencesButton;
	}


	public WebElement getSignOutButton() {
		return SignOutButton;
	}


	public WebElement getInfoIconButton() {
		return InfoIconButton;
	}


	public WebElement getHelpButton() {
		return HelpButton;
	}


	public WebElement getFeedbackButton() {
		return FeedbackButton;
	}


	public WebElement getMainSettingsIcon() {
		return MainSettingsIcon;
	}


	public WebElement getCRMSettingsButton() {
		return CRMSettingsButton;
	}


	public WebElement getHomePageIconButton() {
		return HomePageIconButton;
	}


	public WebElement getCalendarButton() {
		return CalendarButton;
	}


	public WebElement getLeadsButton() {
		return LeadsButton;
	}


	public WebElement getOrganizationsButton() {
		return OrganizationsButton;
	}


	public WebElement getContactsButton() {
		return ContactsButton;
	}


	public WebElement getOpportunitiesButton() {
		return OpportunitiesButton;
	}


	public WebElement getProductsButton() {
		return ProductsButton;
	}


	public WebElement getDocumentsButton() {
		return DocumentsButton;
	}


	public WebElement getEmailButton() {
		return EmailButton;
	}


	public WebElement getTroubleTicketsButton() {
		return TroubleTicketsButton;
	}


	public WebElement getDashboardButton() {
		return DashboardButton;
	}


	public WebElement getMoreButton() {
		return MoreButton;
	}


	public WebElement getSMSNotifierButton() {
		return SMSNotifierButton;
	}


	public WebElement getOurSitesButton() {
		return OurSitesButton;
	}


	public WebElement getIntegrationButton() {
		return IntegrationButton;
	}


	public WebElement getMailManagerButton() {
		return MailManagerButton;
	}


	public WebElement getPBXManagerButton() {
		return PBXManagerButton;
	}


	public WebElement getCommentsButton() {
		return CommentsButton;
	}


	public WebElement getRecycleBinButton() {
		return RecycleBinButton;
	}


	public WebElement getRSSButton() {
		return RSSButton;
	}


	public WebElement getReportsButton() {
		return ReportsButton;
	}


	public WebElement getCampaignsButton() {
		return CampaignsButton;
	}


	public WebElement getServiceContractsButton() {
		return ServiceContractsButton;
	}


	public WebElement getProjectMilestonesButton() {
		return ProjectMilestonesButton;
	}


	public WebElement getProjectTasksButton() {
		return ProjectTasksButton;
	}


	public WebElement getProjectsButton() {
		return ProjectsButton;
	}


	public WebElement getFAQButton() {
		return FAQButton;
	}


	public WebElement getServicesButton() {
		return ServicesButton;
	}


	public WebElement getAssetsButton() {
		return AssetsButton;
	}


	public WebElement getPurchaseOrderButton() {
		return PurchaseOrderButton;
	}


	public WebElement getPriceBooksButton() {
		return PriceBooksButton;
	}


	public WebElement getVendorsButton() {
		return VendorsButton;
	}


	public WebElement getInvoiceButton() {
		return InvoiceButton;
	}


	public WebElement getSalesOrderButton() {
		return SalesOrderButton;
	}


	public WebElement getQuotesButton() {
		return QuotesButton;
	}


	public WebElement getQuickCreateDropDownButton() {
		return QuickCreateDropDownButton;
	}


	public WebElement getLeadsHeaderButton() {
		return LeadsHeaderButton;
	}


	public WebElement getCreateLeadIcon() {
		return CreateLeadIcon;
	}


	public WebElement getOpenCalendarIcon() {
		return OpenCalendarIcon;
	}


	public WebElement getShowWorldClockIcon() {
		return ShowWorldClockIcon;
	}


	public WebElement getOpenCalculatorIcon() {
		return OpenCalculatorIcon;
	}


	public WebElement getChatIcon() {
		return ChatIcon;
	}


	public WebElement getLastViewedIcon() {
		return LastViewedIcon;
	}


	public WebElement getImportLeadssIcon() {
		return ImportLeadssIcon;
	}


	public WebElement getExportLeadsIcon() {
		return ExportLeadsIcon;
	}


	public WebElement getLeadsSettingsIcon() {
		return LeadsSettingsIcon;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}


	public WebElement getSalutationTypeDropdown() {
		return SalutationTypeDropdown;
	}


	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}


	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}


	public WebElement getCompanyTextField() {
		return CompanyTextField;
	}


	public WebElement getTitleTextField() {
		return TitleTextField;
	}


	public WebElement getLeadSourceDropdown() {
		return LeadSourceDropdown;
	}


	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}


	public WebElement getAnnualRevenueTextField() {
		return AnnualRevenueTextField;
	}


	public WebElement getNoOfEmployeesTextField() {
		return NoOfEmployeesTextField;
	}


	public WebElement getSecondaryEmailTextField() {
		return SecondaryEmailTextField;
	}


	public WebElement getPhoneTextField() {
		return PhoneTextField;
	}


	public WebElement getMobileTextField() {
		return MobileTextField;
	}


	public WebElement getFaxTextField() {
		return FaxTextField;
	}


	public WebElement getEmailTextField() {
		return EmailTextField;
	}


	public WebElement getWebsiteTextField() {
		return WebsiteTextField;
	}


	public WebElement getLeadStatusDropdown() {
		return LeadStatusDropdown;
	}


	public WebElement getRatingDropdown() {
		return RatingDropdown;
	}


	public WebElement getAssignedToUserRadioButton() {
		return AssignedToUserRadioButton;
	}


	public WebElement getAssignedToGroupRadioButton() {
		return AssignedToGroupRadioButton;
	}


	public WebElement getAssignedToUserDropdown() {
		return AssignedToUserDropdown;
	}


	public WebElement getAssignedToGroupDropdown() {
		return AssignedToGroupDropdown;
	}


	public WebElement getStreetTextField() {
		return StreetTextField;
	}


	public WebElement getPostalCodeTextField() {
		return PostalCodeTextField;
	}


	public WebElement getCountryTextField() {
		return CountryTextField;
	}


	public WebElement getPOBoxTextField() {
		return POBoxTextField;
	}


	public WebElement getCityTextField() {
		return CityTextField;
	}


	public WebElement getStateTextField() {
		return StateTextField;
	}


	public WebElement getDescriptionTextField() {
		return DescriptionTextField;
	}


	public WebElement getWebsiteLink() {
		return WebsiteLink;
	}
	
	public void createANewLeadWithMandatoryFields() {
		LeadsButton.click();
		CreateLeadIcon.click();
		LastNameTextField.sendKeys("BEHERA");
		CompanyTextField.sendKeys("YAMAHA");
		AssignedToUserRadioButton.click();
		
	}

	public void createANewLeadWithAllFields() {
		LeadsButton.click();
		CreateLeadIcon.click();
		FirstNameTextfield.sendKeys("Bikash");
		LastNameTextField.sendKeys("Endu");
		PhoneTextField.sendKeys("7210571747");
		CompanyTextField.sendKeys("YAMAHA");
		MobileTextField.sendKeys("7065416797");
		TitleTextField.sendKeys("TitleItIS");
		FaxTextField.sendKeys("FAXitis");
		EmailTextField.sendKeys("bikash123@gmail.com");
		WebsiteTextField.sendKeys("bimalsoftech");
		AnnualRevenueTextField.clear();
		AnnualRevenueTextField.sendKeys("98745655");
		NoOfEmployeesTextField.sendKeys("50");
		SecondaryEmailTextField.sendKeys("bikashendu123@gmail.com");
		AssignedToUserRadioButton.click();
		
		StreetTextField.sendKeys("Marathalli");
		POBoxTextField.sendKeys("587695");
		PostalCodeTextField.sendKeys("560037");
		CityTextField.sendKeys("Bengaluru");
		CountryTextField.sendKeys("India");
		StateTextField.sendKeys("Karnataka");
		
		DescriptionTextField.sendKeys("I am Bikashendu");
	}
	
	
}



