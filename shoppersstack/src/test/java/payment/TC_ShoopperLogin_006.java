package payment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraries.ReadDataFromExcel;
import pomRepos.BaseClass;
import pomRepos.CartPage;
import pomRepos.HomePage;
import pomRepos.PaymentPage;
import pomRepos.SelectAddressPage;

public class TC_ShoopperLogin_006 extends BaseClass {
	@Test
	public void paymentThroughNetBanking() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.getAddToCartButton().click();
		homePage.getCartButton().click();
		CartPage cartPage=new CartPage(driver);
		cartPage.getBuyNowButton().click();
		SelectAddressPage addressPage=new SelectAddressPage(driver);
		addressPage.getAddressButton().click();
		addressPage.getProceedButton().click();
		PaymentPage payment=new PaymentPage(driver);
		payment.getNetBankingRadioButton().click();
		payment.getProceedButton().click();
		driver.switchTo().frame(payment.getNetBankingFrame());
		payment.getTciciRadioButton().click();
		payment.getBankSubmitButton().click();
		driver.switchTo().frame(payment.getNetBankingLoginFrame());
		String username=ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 4);
		String password=ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 5);
		payment.getUserIdTextField().sendKeys(username);
		payment.getPasswordTextFiled().sendKeys(password);
		payment.getBankSubmitButton().submit();
		Thread.sleep(4000);
		driver.switchTo().frame(payment.getNetBankingLoginFrame());
		driver.switchTo().frame(payment.getPayAmountFrame());
		Thread.sleep(4000);
		payment.getPayNowButton().click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='CloseIcon']")).click();
		driver.switchTo().defaultContent();
	}
}
