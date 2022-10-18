package php.crm.vtiger.project101.campaignTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import php.crm.vtiger.project101.genericUtitlity.BaseClass;
import php.crm.vtiger.project101.genericUtitlity.ExcelUtility;
import php.crm.vtiger.project101pom.repository.CampaignDetailsPage;
import php.crm.vtiger.project101pom.repository.CampaignsPage;
import php.crm.vtiger.project101pom.repository.HomePage;

public class CreateCampaignTest extends BaseClass {
	public void CreateCampaignAndVerifyCampaignNameTest() throws EncryptedDocumentException, IOException {
		HomePage home = new HomePage(driver);
		home.clickonCampaignOption();
		
		CampaignsPage campaign=new CampaignsPage(driver);
		campaign.clickOnAddCampaign();
		int randomNo =jutils.generateRandomNumber(1000);
		ExcelUtility eUtils = new ExcelUtility();
		String campaignsName= eUtils.fetchDataFromExcelFile("Sheet2", 1, 0);
		String expectedCampaignsName=campaignsName+randomNo;
		String date =eUtils.fetchDataFromExcelFile("sheet2", 1, 1);
		
		CampaignDetailsPage campaignDetails = new CampaignDetailsPage(driver);
		String actualCampaignName=campaignDetails.verifyCampaignName(campaignsName)+randomNo;
		
		CreatingNewCampaignDetailsPage newCampaign= new CreatingNewCampaignDetailsPage(driver);
		assert.assertEquals(actualCampaignName, expectedCampaignsName);
		System.out.println("campaigname is verified");
		
		
		
		
	}

}
