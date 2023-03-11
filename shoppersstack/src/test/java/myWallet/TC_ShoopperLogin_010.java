package myWallet;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibraries.ReadDataFromExcel;
import pomRepos.BaseClass;
import pomRepos.HomePage;
import pomRepos.MyWalletPage;
public class TC_ShoopperLogin_010 extends BaseClass {
	@Test
	public void useCoupon() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage homePage=new HomePage(driver);
		Thread.sleep(5000);
		homePage.getAccountSettingsBtn().click();
		homePage.getMyWalletButton().click();
		MyWalletPage myWallet=new MyWalletPage(driver);
		String couponCode=ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 7);
		myWallet.getCouponCodeTextField().sendKeys(couponCode);
		myWallet.getVerifyButton().click();
		wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(myWallet.getCouponVerification()));
		String couponVerificationMessage = myWallet.getCouponVerification().getText();
		Reporter.log(couponVerificationMessage, true);
	}
}