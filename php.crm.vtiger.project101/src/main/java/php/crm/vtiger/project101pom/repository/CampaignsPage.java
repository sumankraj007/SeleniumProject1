package php.crm.vtiger.project101pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	public WebElement addCampaignButton;

	public WebElement getAddCampaignButton() {
		return addCampaignButton;
	}
	
	public void clickOnAddCampaign() {
		addCampaignButton.click();
	}
	

}
