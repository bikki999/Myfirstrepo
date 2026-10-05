package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact 
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
	
	//--------------------------
	
	@FindBy(xpath = "//a[@class='hdrLink']") private WebElement ContactsPageButton;
	@FindBy(css = "img[title='Create Contact...']") private WebElement CreateContactIcon;
	@FindBy(css = "img[title='Search in Contacts...']") private WebElement SearchInContactsIcon;
	@FindBy(css = "img[title='Open Calendar...']") private WebElement OpenCalendarIcon;
	@FindBy(css = "img[title='Show World Clock...']") private WebElement ShowWorldClockIcon;
	@FindBy(css = "img[title='Open Calculator...']") private WebElement OpenCalculatorIcon;
	@FindBy(css = "img[title='Chat...']") private WebElement ChatIcon;
	@FindBy(css = "img[title='Last Viewed']") private WebElement LastViewedIcon;
	@FindBy(css = "img[title='Import Contacts']")private WebElement ImportContactsIcon;
	@FindBy(css = "img[title='Export Contacts']")private WebElement ExportContactsIcon;
	@FindBy(css = "img[title='Find Duplicates']")private WebElement FindDuplicatesIcon;
	@FindBy(css = "img[title='Contacts Settings']")private WebElement ContactsSettingsIcon;
	
	//--------------------------------
	
	@FindBy(name="salutationtype") private WebElement SalutationTypeDropdown;
	@FindBy(name="firstname") private WebElement FirstNameTextField;
	@FindBy(name="lastname") private WebElement LastNameTextField;
	@FindBy(id = "phone") private WebElement OfficePhoneTextField;
	@FindBy(name="account_name") private WebElement OrganizationNameTextField;
	@FindBy(xpath = "//tbody/tr[5]/td[2]/img[1]") private WebElement OrganizationNameSelectIcon;
	@FindBy(css = "input[onclick=\"this.form.account_id.value=''; this.form.account_name.value='';return false;\"]")private WebElement OrganizationNameClearIcon;
	@FindBy(id="mobile") private WebElement MobileTextField;
	@FindBy(css = "select[name='leadsource']") private WebElement LeadSourceDropdown;
	@FindBy(id="homephone") private WebElement HomePhoneTextField;
	@FindBy(id="title")private WebElement TitleTextField;
	@FindBy(id="otherphone") private WebElement OtherPhoneTextField;
	@FindBy(id = "department") private WebElement DepartmentTextField;
	@FindBy(id="fax") private WebElement FaxTextField ;
	@FindBy(id="email") private WebElement EmailTextField;
	@FindBy(id="jscal_field_birthday") private WebElement BirthdateTextField ;
	@FindBy(id="jscal_trigger_birthday") private WebElement BirthdateCalenderIcon;
	@FindBy(id="assistant") private WebElement AssistantTextField;
	@FindBy(css = "input[name='contact_name']") private WebElement ReportsToTextField;
	@FindBy(css = "img[onclick='selectContact(\"false\",\"general\",document.EditView)']") private WebElement ReportsToSelectIcon;
	@FindBy(css = "input[onclick=\"this.form.contact_id.value=''; this.form.contact_name.value='';return false;\"]") private WebElement ReportsToClearIcon;
	@FindBy(id="assistantphone") private WebElement AssistantPhoneTextField;
	@FindBy(id="secondaryemail") private WebElement SecondaryEmailTextField;
	@FindBy(xpath = "//input[@name='emailoptout']") private WebElement EmailOptOutButton;
	@FindBy(css = "input[name='donotcall']") private WebElement DoNotCallButton;
	@FindBy(css = "input[name='reference']") private WebElement ReferenceButton;
	@FindBy(css = "input[name='notify_owner']") private WebElement NotifyOwnerButton;
	@FindBy(css = "input[value='U']") private WebElement AssignedToUserRadioButton;
	@FindBy(css = "input[value='T']") private WebElement AssignedToGroupRadioButton;
	@FindBy(css = "select[name='assigned_user_id']") private WebElement AssignedToDropdown;
	
	@FindBy(css = "input[name='portal']") private WebElement PortalUserButton;
	@FindBy(id="jscal_field_support_start_date") private WebElement SupportStartDateTextField;
	@FindBy(xpath = "//img[@id='jscal_trigger_support_start_date']") private WebElement SupportStartDateCalendarIcon ;
	@FindBy(id = "jscal_field_support_end_date") private WebElement SupportEndDateTextfield ;
	@FindBy(xpath = "//img[@id='jscal_trigger_support_end_date']") private WebElement SupportEndDateCalendarIcon;
	@FindBy(css = "input[onclick='return copyAddressLeft(EditView)']") private WebElement CopyOtherAddressRadioButton;
	@FindBy(css = "input[onclick='return copyAddressRight(EditView)']") private WebElement CopyMailingAddressRadioButton;
	@FindBy(name="mailingstreet") private WebElement MailingStreetTextField;
	@FindBy(name = "otherstreet") private WebElement OtherStreetTextField;
	@FindBy(name = "mailingpobox") private WebElement MailingPOBoxTextField;
	@FindBy(id="otherpobox") private WebElement OtherPOBoxTextField ;
	@FindBy(id="mailingcity") private WebElement MailingCityTextField;
	@FindBy(id="othercity") private WebElement OtherCityTextField ;
	@FindBy(id = "mailingstate") private WebElement MailingStateTextField;
	@FindBy(id="otherstate") private WebElement OtherStateTextField;
	@FindBy(id="mailingzip") private WebElement MailinngPostalCodeTextfield;
	@FindBy(id = "otherzip") private WebElement OtherPostalCodeText;
	@FindBy(id = "mailingcountry") private WebElement MailingCountryTextField;
	@FindBy(id="othercountry") private WebElement OtherCountryTextField;
	@FindBy(name="description") private WebElement DescriptionTextField;
	@FindBy(name="imagename") private WebElement ContactImageUploadButton;
	@FindBy(xpath = "//input[contains(@class,'crmbutton small save')]") private WebElement SaveButton;
	@FindBy(css = "input[title='Cancel [Alt+X]'][value='  Cancel  ']") private WebElement CancelButton;
	@FindBy(css="a[href='http://www.vtiger.com']") private WebElement WebsiteLinkButton;
	
	
	public CreateNewContact(WebDriver driver) {
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


	public WebElement getContactsPageButton() {
		return ContactsPageButton;
	}


	public WebElement getCreateContactIcon() {
		return CreateContactIcon;
	}


	public WebElement getSearchInContactsIcon() {
		return SearchInContactsIcon;
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


	public WebElement getImportContactsIcon() {
		return ImportContactsIcon;
	}


	public WebElement getExportContactsIcon() {
		return ExportContactsIcon;
	}


	public WebElement getFindDuplicatesIcon() {
		return FindDuplicatesIcon;
	}


	public WebElement getContactsSettingsIcon() {
		return ContactsSettingsIcon;
	}


	public WebElement getSalutationTypeDropdown() {
		return SalutationTypeDropdown;
	}


	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}


	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}


	public WebElement getOfficePhoneTextField() {
		return OfficePhoneTextField;
	}


	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}


	public WebElement getOrganizationNameSelectIcon() {
		return OrganizationNameSelectIcon;
	}


	public WebElement getOrganizationNameClearIcon() {
		return OrganizationNameClearIcon;
	}


	public WebElement getMobileTextField() {
		return MobileTextField;
	}


	public WebElement getLeadSourceDropdown() {
		return LeadSourceDropdown;
	}


	public WebElement getHomePhoneTextField() {
		return HomePhoneTextField;
	}


	public WebElement getTitleTextField() {
		return TitleTextField;
	}


	public WebElement getOtherPhoneTextField() {
		return OtherPhoneTextField;
	}


	public WebElement getDepartmentTextField() {
		return DepartmentTextField;
	}


	public WebElement getFaxTextField() {
		return FaxTextField;
	}


	public WebElement getEmailTextField() {
		return EmailTextField;
	}


	public WebElement getBirthdateTextField() {
		return BirthdateTextField;
	}


	public WebElement getBirthdateCalenderIcon() {
		return BirthdateCalenderIcon;
	}


	public WebElement getAssistantTextField() {
		return AssistantTextField;
	}


	public WebElement getReportsToTextField() {
		return ReportsToTextField;
	}


	public WebElement getReportsToSelectIcon() {
		return ReportsToSelectIcon;
	}


	public WebElement getReportsToClearIcon() {
		return ReportsToClearIcon;
	}


	public WebElement getAssistantPhoneTextField() {
		return AssistantPhoneTextField;
	}


	public WebElement getSecondaryEmailTextField() {
		return SecondaryEmailTextField;
	}


	public WebElement getEmailOptOutButton() {
		return EmailOptOutButton;
	}


	public WebElement getDoNotCallButton() {
		return DoNotCallButton;
	}


	public WebElement getReferenceButton() {
		return ReferenceButton;
	}


	public WebElement getNotifyOwnerButton() {
		return NotifyOwnerButton;
	}


	public WebElement getAssignedToUserRadioButton() {
		return AssignedToUserRadioButton;
	}


	public WebElement getAssignedToGroupRadioButton() {
		return AssignedToGroupRadioButton;
	}


	public WebElement getAssignedToDropdown() {
		return AssignedToDropdown;
	}


	public WebElement getPortalUserButton() {
		return PortalUserButton;
	}


	public WebElement getSupportStartDateTextField() {
		return SupportStartDateTextField;
	}


	public WebElement getSupportStartDateCalendarIcon() {
		return SupportStartDateCalendarIcon;
	}


	public WebElement getSupportEndDateTextfield() {
		return SupportEndDateTextfield;
	}


	public WebElement getSupportEndDateCalendarIcon() {
		return SupportEndDateCalendarIcon;
	}


	public WebElement getCopyOtherAddressRadioButton() {
		return CopyOtherAddressRadioButton;
	}


	public WebElement getCopyMailingAddressRadioButton() {
		return CopyMailingAddressRadioButton;
	}


	public WebElement getMailingStreetTextField() {
		return MailingStreetTextField;
	}


	public WebElement getOtherStreetTextField() {
		return OtherStreetTextField;
	}


	public WebElement getMailingPOBoxTextField() {
		return MailingPOBoxTextField;
	}


	public WebElement getOtherPOBoxTextField() {
		return OtherPOBoxTextField;
	}


	public WebElement getMailingCityTextField() {
		return MailingCityTextField;
	}


	public WebElement getOtherCityTextField() {
		return OtherCityTextField;
	}


	public WebElement getMailingStateTextField() {
		return MailingStateTextField;
	}


	public WebElement getOtherStateTextField() {
		return OtherStateTextField;
	}


	public WebElement getMailinngPostalCodeTextfield() {
		return MailinngPostalCodeTextfield;
	}


	public WebElement getOtherPostalCodeText() {
		return OtherPostalCodeText;
	}


	public WebElement getMailingCountryTextField() {
		return MailingCountryTextField;
	}


	public WebElement getOtherCountryTextField() {
		return OtherCountryTextField;
	}


	public WebElement getDescriptionTextField() {
		return DescriptionTextField;
	}


	public WebElement getContactImageUploadButton() {
		return ContactImageUploadButton;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}


	public WebElement getWebsiteLinkButton() {
		return WebsiteLinkButton;
	}
	
	public void createANewContactWithMandatoryFields() {
		CreateContactIcon.click();
		LastNameTextField.sendKeys("BEHERA`");
	}
	
	public void createANewContactWithAllFields() {
		CreateContactIcon.click();
		FirstNameTextField.sendKeys("Bikash");
		LastNameTextField.sendKeys("Endu");
		OfficePhoneTextField.sendKeys("7210571747");
		OrganizationNameTextField.sendKeys("AxisWebSoft");
		MobileTextField.sendKeys("7065416797");
		PortalUserButton.click();
		DescriptionTextField.sendKeys("I am Bikashendu");
	}
}



