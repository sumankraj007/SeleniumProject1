package php.crm.vtiger.project101pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()=' Leads']")
	private WebElement leadsOption;
	
	public WebElement getLeadsOption() {
		return leadsOption;
	}
	@FindBy(id= "appnavigator")
	private WebElement threeDashButton;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketingOption;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaignOption;
	

	@FindBy(xpath="//a[@role='button']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutButton;

	public WebElement getThreeDashButton() {
		return threeDashButton;
	}

	public WebElement getMarketingOption() {
		return marketingOption;
	}

	public WebElement getCampaignOption() {
		return campaignOption;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSignoutButton() {
		return signoutButton;
	}
	public void clickonCampaignOption() {
		threeDashButton.click();
		marketingOption.click();
		campaignOption.click();
	}
	public void logoutAction() {
		logoutButton.click();
		signoutButton.click();
	}

	public void clickOnLeadsOption() {
		threeDashButton.click();
		marketingOption.click();
		leadsOption.click();
	}

	
}
