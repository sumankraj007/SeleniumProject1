package basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import php.crm.vtiger.project101pom.repository.LoginPage;

public class ToVerifyHomePage {
	@Test
	public void ToVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
	}

}
