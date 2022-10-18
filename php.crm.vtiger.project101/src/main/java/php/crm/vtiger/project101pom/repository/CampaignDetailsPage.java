package php.crm.vtiger.project101pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	WebDriver driver;
	public CampaignDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
        this.driver=driver;
	}
	public String verifyCampaignName(String CampaignName){
		return driver.findElement(By.xpath("//span[text()='"+CampaignName+"']")).getText();
		
	}

}
