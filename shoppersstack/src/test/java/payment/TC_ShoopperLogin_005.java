package payment;

import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.CartPage;
import pomRepos.HomePage;
import pomRepos.PaymentPage;
import pomRepos.SelectAddressPage;

public class TC_ShoopperLogin_005 extends BaseClass{
	@Test
	public void paymentThroughCreditCard() {
		HomePage homePage=new HomePage(driver);
		homePage.getAddToCartButton().click();
		homePage.getCartButton().click();
		CartPage cartPage=new CartPage(driver);
		cartPage.getBuyNowButton().click();
		SelectAddressPage addressPage=new SelectAddressPage(driver);
		addressPage.getAddressButton().click();
		addressPage.getProceedButton().click();
		PaymentPage payment=new PaymentPage(driver);
		payment.getCreditCardPaymentButton().click();
		payment.getPinTextField().sendKeys("6763");
		payment.getSubmitButton().submit();
	}
}