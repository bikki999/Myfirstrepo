package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateACampaignPage 
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
	
	@FindBy(xpath = "//a[@class='hdrLink']") private WebElement CampaignsPageButton;
	
	@FindBy(css = "img[title='Create Campaign...']") private WebElement CreateNewCampaignIcon;
	
	@FindBy(css = "img[title='Search in Campaigns...']") private WebElement SearchInCampaignsIcon;
	
	@FindBy(css = "img[title='Open Calendar...']") private WebElement OpenCalenderIcon;
	
	@FindBy(css = "img[title='Show World Clock...']") private WebElement ShowWorldClockIcon;
	
	@FindBy(css = "img[title='Open Calculator...']") private WebElement OpenCalculatorIcon;
	
	@FindBy(css = "img[title='Chat...']") private WebElement ChatIcon;
	
	@FindBy(css = "img[title='Last Viewed']") private WebElement LastViewedIcon;
	
	@FindBy(css = "img[title='Campaigns Settings']") private WebElement CampaignsSettings;
	
	
	@FindBy(xpath = "//input[contains(@class,'crmButton small save')]") private WebElement SaveButton;
	@FindBy(css = "input[title='Cancel [Alt+X]'][value='Cancel  ']") private WebElement CancelButton;
	
	@FindBy(name = "campaignname") private WebElement CampaignName;
	@FindBy(css = "input[value='U']") private WebElement UserRadioButton;
	@FindBy(css = "input[value='T']") private WebElement GroupRadioButton;
	@FindBy(name = "assigned_group_id") private WebElement AssignedToDropdown;
	@FindBy(name = "campaigntype") private WebElement CampaignTypeDropdown;
	@FindBy(id = "targetaudience") private WebElement TargetAudienceTexttField;
	@FindBy(id = "sponsor") private WebElement SponsorTextField;
	@FindBy(id = "numsent") private WebElement NumSentTextField;
	@FindBy(name = "campaignstatus") private WebElement CampaignStatusDropdown;
	@FindBy(css = "input[name='product_name']") private WebElement ProductTextField;
	@FindBy(css = "img[title='Select']") private WebElement ProductSelectIcon;
	@FindBy(css = "input[title='Clear']") private WebElement ProductClearIcon;
	@FindBy(id="jscal_field_closingdate") private WebElement ExpectedCloseDateTextField;
	@FindBy(id = "jscal_trigger_closingdate") private WebElement ExpectedCloseDateCalendarIcon;
	@FindBy(id="targetsize") private WebElement TargetSizeTextField;
	
	@FindBy(name="budgetcost") private WebElement BudgetCostTextField;
	@FindBy(css = "select[name='expectedresponse']") private WebElement ExpectedResponseDropDown;
	@FindBy(id = "expectedsalescount") private WebElement ExpectedSalesCountTextField;
	@FindBy(id = "expectedresponsecount") private WebElement ExpectedResponseCountTextField;
	@FindBy(name="expectedroi") private WebElement ExpectedROITextField;
	@FindBy(name="actualcost") private WebElement ActualCostTextField;
	@FindBy(name="expectedrevenue") private WebElement ExpectedRevenueTextField;
	@FindBy(id="actualsalescount") private WebElement ActualSalesCountTextField;
	@FindBy(id="actualresponsecount") private WebElement ActualResponseCountTextField;
	@FindBy(name="actualroi") private WebElement ActualROITextField;
	
	@FindBy(css = "textarea[name='description']") private WebElement DescriptiontextField;
	
	
	public CreateACampaignPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
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


	public WebElement getCampaignsPageButton() {
		return CampaignsPageButton;
	}


	public WebElement getCreateNewCampaignIcon() {
		return CreateNewCampaignIcon;
	}


	public WebElement getSearchInCampaignsIcon() {
		return SearchInCampaignsIcon;
	}


	public WebElement getOpenCalenderIcon() {
		return OpenCalenderIcon;
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


	public WebElement getCampaignsSettings() {
		return CampaignsSettings;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}


	public WebElement getCampaignName() {
		return CampaignName;
	}


	public WebElement getUserRadioButton() {
		return UserRadioButton;
	}


	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}


	public WebElement getAssignedToDropdown() {
		return AssignedToDropdown;
	}


	public WebElement getCampaignTypeDropdown() {
		return CampaignTypeDropdown;
	}


	public WebElement getTargetAudienceTexttField() {
		return TargetAudienceTexttField;
	}


	public WebElement getSponsorTextField() {
		return SponsorTextField;
	}


	public WebElement getNumSentTextField() {
		return NumSentTextField;
	}


	public WebElement getCampaignStatusDropdown() {
		return CampaignStatusDropdown;
	}


	public WebElement getProductTextField() {
		return ProductTextField;
	}


	public WebElement getProductSelectIcon() {
		return ProductSelectIcon;
	}


	public WebElement getProductClearIcon() {
		return ProductClearIcon;
	}


	public WebElement getExpectedCloseDateTextField() {
		return ExpectedCloseDateTextField;
	}


	public WebElement getExpectedCloseDateCalendarIcon() {
		return ExpectedCloseDateCalendarIcon;
	}


	public WebElement getTargetSizeTextField() {
		return TargetSizeTextField;
	}


	public WebElement getBudgetCostTextField() {
		return BudgetCostTextField;
	}


	public WebElement getExpectedResponseDropDown() {
		return ExpectedResponseDropDown;
	}


	public WebElement getExpectedSalesCountTextField() {
		return ExpectedSalesCountTextField;
	}


	public WebElement getExpectedResponseCountTextField() {
		return ExpectedResponseCountTextField;
	}


	public WebElement getExpectedROITextField() {
		return ExpectedROITextField;
	}


	public WebElement getActualCostTextField() {
		return ActualCostTextField;
	}


	public WebElement getExpectedRevenueTextField() {
		return ExpectedRevenueTextField;
	}


	public WebElement getActualSalesCountTextField() {
		return ActualSalesCountTextField;
	}


	public WebElement getActualResponseCountTextField() {
		return ActualResponseCountTextField;
	}


	public WebElement getActualROITextField() {
		return ActualROITextField;
	}


	public WebElement getDescriptiontextField() {
		return DescriptiontextField;
	}
	
	
	
	//SCENAIO BASED METHODS
		public void createCampaignWithMandatoryFields(String TIMESTAMP) {
			CreateNewCampaignIcon.click();
			CampaignName.sendKeys("Camp_"+TIMESTAMP);
			UserRadioButton.click();
			ExpectedCloseDateTextField.clear();
			ExpectedCloseDateTextField.sendKeys("2026-09-18");
			//SaveButton.click();
			
		}
		
		public void createCampaignWithAllFields(String TIMESTAMP) {
			CreateNewCampaignIcon.click();
			CampaignName.sendKeys("Camp_"+TIMESTAMP);
			UserRadioButton.click();
			ExpectedCloseDateTextField.clear();
			TargetAudienceTexttField.sendKeys("Audience"+TIMESTAMP);
			SponsorTextField.sendKeys("YAMAHA");
			ProductTextField.sendKeys("XSR155");
			ActualCostTextField.clear();
			ActualCostTextField.sendKeys("1.69L");
			ExpectedCloseDateTextField.sendKeys("2026-09-18");
			DescriptiontextField.sendKeys("This is a new two wheeler launched from yamaha");
			//SaveButton.click();
			
		}
	
}



