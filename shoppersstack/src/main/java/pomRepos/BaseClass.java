package pomRepos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericLibraries.ReadDataFromExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// test data
	String welcomePageTitle = "";
	String loginPageTitle = "";
	String homePageTitle = "";
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeClass
	public void browserSetup() throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String url = ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 1);
		driver.get(url);
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginButton().click();
	}

	@BeforeMethod
	public void loginToShoopersstack() throws EncryptedDocumentException, IOException {
		String email = ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 2);
		String password = ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 3);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys(email);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getEmailLoginButton().click();
	}
	
	@AfterMethod
	public void logoutFromShoppersstack() throws InterruptedException {
//		HomePage homepage=new HomePage(driver);
//		wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(homepage.getAccountSettingsBtn()));
//		Thread.sleep(10000);
//		homepage.getAccountSettingsBtn().click();
//		homepage.getLogout().click();
	}
	
	@AfterClass
	public void browserTearDown() {
//		driver.quit();
	}
}
