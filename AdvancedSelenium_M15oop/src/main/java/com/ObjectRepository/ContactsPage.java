package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage
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
	
	
	@FindBy(xpath = "//a[normalize-space()='Go to Advanced Search']") private WebElement GoToAdvanceSearchButton;
	@FindBy(css = "input[name='search_text']") private WebElement SearchForTextField;
	@FindBy(id="bas_searchfield") private WebElement InTextField;
	@FindBy(xpath = "//input[@name='submit']") private WebElement SearchNowButton;
	
	@FindBy(id="viewname") private WebElement FiltersDropdown;
	@FindBy(xpath = "//a[normalize-space()='Create Filter']") private WebElement CreateFilterButton;
	@FindBy(name="pagenum") private WebElement PageNumberTextField;
	
	
	@FindBy(className="crmbutton small delete") private WebElement DeleteButton;
	@FindBy(css = "input[onclick=\"return mass_edit(this, 'massedit', 'Contacts', 'Marketing')\"]") private WebElement MassEditButton;
	@FindBy(css = "input[onclick=\"return eMail('Contacts',this);\"]") private WebElement SendMailButton;
	@FindBy(css = "input[fdprocessedid='gwoxh']") private WebElement SendSMSButton;
	
	@FindBy(xpath = "//a[contains(text(),'Create a')]") private WebElement CreateAContactButton;
	@FindBy(xpath = "//a[normalize-space()='Import Contacts']") private WebElement ImportContactsButton;
	
	@FindBy(xpath = "//a[normalize-space()='Create Mail Merge templates']") private WebElement CreateMailMergeTemplatesButton;
	
	@FindBy(css = "a[href='http://www.vtiger.com']") private WebElement WebsiteLinkButton;
	
	
	//----------------------
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//-----------------------------


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


	public WebElement getGoToAdvanceSearchButton() {
		return GoToAdvanceSearchButton;
	}


	public WebElement getSearchForTextField() {
		return SearchForTextField;
	}


	public WebElement getInTextField() {
		return InTextField;
	}


	public WebElement getSearchNowButton() {
		return SearchNowButton;
	}


	public WebElement getFiltersDropdown() {
		return FiltersDropdown;
	}


	public WebElement getCreateFilterButton() {
		return CreateFilterButton;
	}


	public WebElement getPageNumberTextField() {
		return PageNumberTextField;
	}


	public WebElement getDeleteButton() {
		return DeleteButton;
	}


	public WebElement getMassEditButton() {
		return MassEditButton;
	}


	public WebElement getSendMailButton() {
		return SendMailButton;
	}


	public WebElement getSendSMSButton() {
		return SendSMSButton;
	}


	public WebElement getCreateAContactButton() {
		return CreateAContactButton;
	}


	public WebElement getImportContactsButton() {
		return ImportContactsButton;
	}


	public WebElement getCreateMailMergeTemplatesButton() {
		return CreateMailMergeTemplatesButton;
	}


	public WebElement getWebsiteLinkButton() {
		return WebsiteLinkButton;
	}
	
	

}



