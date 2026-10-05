package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(css = "input[value='Search...']")
	private WebElement SearchBarTextField;
	@FindBy(className = "searchBtn")
	private WebElement SearchButton;

	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	private WebElement UserIconButton;
	@FindBy(id = "_my_preferences_")
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
	private WebElement TroubleTicketsButton;
	@FindBy(linkText = "Dashboard")
	private WebElement DashboardButton;

	@FindBy(xpath = "//a[@href='javascript:;'][normalize-space()='More']")
	private WebElement MoreButton;
	@FindBy(xpath = "//a[@name='SMSNotifier']")
	private WebElement SMSNotifierButton;
	@FindBy(name = "Our Sites")
	private WebElement OurSitesButton;
	@FindBy(name = "Integration")
	private WebElement IntegrationButton;
	@FindBy(name = "Mail Manager")
	private WebElement MailManagerButton;
	@FindBy(name = "PBX Manager")
	private WebElement PBXManagerButton;
	@FindBy(name = "Comments")
	private WebElement CommentsButton;
	@FindBy(name = "Recycle Bin")
	private WebElement RecycleBinButton;
	@FindBy(name = "RSS")
	private WebElement RSSButton;
	@FindBy(name = "Reports")
	private WebElement ReportsButton;
	@FindBy(name = "Campaigns")
	private WebElement CampaignsButton;
	@FindBy(name = "Service Contracts")
	private WebElement ServiceContractsButton;
	@FindBy(name = "Project Milestones")
	private WebElement ProjectMilestonesButton;
	@FindBy(name = "Project Tasks")
	private WebElement ProjectTasksButton;
	@FindBy(name = "Projects")
	private WebElement ProjectsButton;
	@FindBy(name = "FAQ")
	private WebElement FAQButton;
	@FindBy(name = "Services")
	private WebElement ServicesButton;
	@FindBy(name = "Assets")
	private WebElement AssetsButton;
	@FindBy(name = "Purchase Order")
	private WebElement PurchaseOrderButton;
	@FindBy(name = "Price Books")
	private WebElement PriceBooksButton;
	@FindBy(name = "Vendors")
	private WebElement VendorsButton;
	@FindBy(name = "Invoice")
	private WebElement InvoiceButton;
	@FindBy(name = "Sales Order")
	private WebElement SalesOrderButton;
	@FindBy(name = "Quotes")
	private WebElement QuotesButton;
	@FindBy(id = "qccombo")
	private WebElement QuickCreateDropDownButton;

	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement HomePageButton;

	@FindBy(css = "img[width='27'][height='27'][onclick='fnAddWindow(this,\"addWidgetDropDown\");']")
	private WebElement widgetDropDownList;
	@FindBy(id = "addmodule")
	private WebElement AddModuleButton;
	@FindBy(id = "addrss")
	private WebElement AddRSSButton;
	@FindBy(id = "adddash")
	private WebElement AddDashBoardButton;
	@FindBy(id = "addNotebook")
	private WebElement AddNotebookButton;
	@FindBy(id = "addReportCharts")
	private WebElement AddReportChartsButton;
	@FindBy(id = "defaultwidget")
	private WebElement DefaultWidgetButton;

	@FindBy(css = "img[title='Open Calendar...']")
	private WebElement OpenCalendarIcon;
	@FindBy(css = "img[title='Show World Clock...']")
	private WebElement OpenWorldClockIcon;
	@FindBy(css = "img[title='Open Calculator...']")
	private WebElement OpenCalculatorIcon;
	@FindBy(css = "img[title='Chat...']")
	private WebElement ChatIcon;
	@FindBy(css = "img[title='Last Viewed']")
	private WebElement LastViewedIcon;
	@FindBy(css = "img[title='Change layout']")
	private WebElement ChangeLayoutIcon;

	@FindBy(css = "a[href='http://www.vtiger.com']")
	private WebElement CompanyWebsiteLinkButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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

	public WebElement getQuickCreateDropDownButton() {
		return QuickCreateDropDownButton;
	}

	public WebElement getHomePageButton() {
		return HomePageButton;
	}

	public WebElement getWidgetDropDownList() {
		return widgetDropDownList;
	}

	public WebElement getAddModuleButton() {
		return AddModuleButton;
	}

	public WebElement getAddRSSButton() {
		return AddRSSButton;
	}

	public WebElement getAddDashBoardButton() {
		return AddDashBoardButton;
	}

	public WebElement getAddNotebookButton() {
		return AddNotebookButton;
	}

	public WebElement getAddReportChartsButton() {
		return AddReportChartsButton;
	}

	public WebElement getDefaultWidgetButton() {
		return DefaultWidgetButton;
	}

	public WebElement getOpenCalendarIcon() {
		return OpenCalendarIcon;
	}

	public WebElement getOpenWorldClockIcon() {
		return OpenWorldClockIcon;
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

	public WebElement getChangeLayoutIcon() {
		return ChangeLayoutIcon;
	}

	public WebElement getCompanyWebsiteLinkButton() {
		return CompanyWebsiteLinkButton;
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

	public void createANewCampaign() {
		MoreButton.click();
		CampaignsButton.click();
	}

	public void createANewContact() {
		ContactsButton.click();
	}

	public void createANewLead() {
		LeadsButton.click();
	}

	public void logout() {
		UserIconButton.click();
		SignOutButton.click();

	}


}



