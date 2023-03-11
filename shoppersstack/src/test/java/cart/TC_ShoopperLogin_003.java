package cart;

import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.CartPage;
import pomRepos.HomePage;

public class TC_ShoopperLogin_003 extends BaseClass {
	@Test
	public void addToCart() {
		HomePage homePage=new HomePage(driver);
		homePage.getAddToCartButton().click();
		homePage.getCartButton().click();
		CartPage cartPage=new CartPage(driver);
		cartPage.getIncreaseButton().click();
		cartPage.getIncreaseButton().click();
		cartPage.getRemoveFromCartButton().click();
	}
}