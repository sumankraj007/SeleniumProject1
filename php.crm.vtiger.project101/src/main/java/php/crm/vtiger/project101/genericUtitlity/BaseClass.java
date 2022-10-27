package php.crm.vtiger.project101.genericUtitlity;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import php.crm.vtiger.project101pom.repository.HomePage;
import php.crm.vtiger.project101pom.repository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public JavaUtility jutils=new JavaUtility();
	WebDriverUtility wUtils=new WebDriverUtility();
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("database connection hasbeen established");
	}
	@BeforeClass
	  public void bcconfig() throws IOException {
		jutils.fetchDataFromPropertyFile("url");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wUtils.maximizeWindow(driver);
		wUtils.implicitWait(driver);
		driver.get("url");
		System.out.println("Chrome Browser is launched");
		System.out.println("navigate to Vtiger");
		sdriver=driver;
		  system.out.println("chamges is done 1");
		
	}
	@BeforeMethod
	public void bmconfig() throws IOException {
		String username = jutils.fetchDataFromPropertyFile("username");
		String password = jutils.fetchDataFromPropertyFile("password");
		LoginPage login =new LoginPage(driver);
		login.loginAction(username,password);
		System.out.println("login action hasbeen completed");

	}
	@AfterMethod
	public void amconfig() {
		HomePage home=new HomePage(driver);
		home.logoutAction();
		
	}
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("browser is closed");
	}
	@AfterSuite
	public void asConfig() {
		System.out.println("database connection has been closed");
	}

}
