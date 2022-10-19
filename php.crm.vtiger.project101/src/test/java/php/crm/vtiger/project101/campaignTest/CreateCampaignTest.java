package php.crm.vtiger.project101.campaignTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;



import php.crm.vtiger.project101.genericUtitlity.BaseClass;
import php.crm.vtiger.project101.genericUtitlity.ExcelUtility;
import php.crm.vtiger.project101.genericUtitlity.IPathConstant;
import php.crm.vtiger.project101pom.repository.CampaignDetailsPage;
import php.crm.vtiger.project101pom.repository.CampaignsPage;
import php.crm.vtiger.project101pom.repository.CreatingNewCampaignPage;
import php.crm.vtiger.project101pom.repository.HomePage;

public class CreateCampaignTest extends BaseClass {
	
	@Test //(retryAnalyzer = php.crm.Vtiger.Project1.genericUtitlity.IRetryAnalyserImplementationClass.class)
	public void createCampaignAndVerfiyCampaignNameTest() throws EncryptedDocumentException, IOException {
		
		HomePage home = new HomePage(driver);
		home.clickonCampaignOption();
		
		CampaignsPage campaign = new CampaignsPage(driver);
		campaign.clickOnAddCampaign();
		
		int randomNo = jutils.generateRandomNumber(IPathConstant.Random_NUMBER);
		
		ExcelUtility eUtils = new ExcelUtility();
		String campaignName = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 0);
		String expectedCampaignName = campaignName+randomNo;
		String date = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 1);
		
		CreatingNewCampaignPage newCampaign = new CreatingNewCampaignPage(driver);
		newCampaign.createNewCampaignAction(expectedCampaignName, date);
		
		CampaignDetailsPage campaignDetails = new CampaignDetailsPage(driver);
		String actualCampaignName = campaignDetails.verifyCampaignName(campaignName);
		System.out.println(actualCampaignName);
		System.out.println(expectedCampaignName);
		
		Assert.assertEquals(actualCampaignName, expectedCampaignName);
		System.out.println("Campaign Name is verified");
		
		
		
			
	}

}
