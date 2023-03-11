package wishlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.HomePage;
import pomRepos.PaymentPage;
import pomRepos.ProductsPage;
import pomRepos.SelectAddressPage;

public class TC_ShoopperLogin_002 extends BaseClass{
	
	@Test
	public void cashOnDelivery() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getAccountSettingsBtn()));
		homePage.getAccountSettingsBtn().click();
		homePage.getWishList().click();
//		Thread.sleep(5000);
		WebElement wishlistProduct = driver.findElement(By.xpath("//div[@class='wishlist_listContainer__8f0IY']/div/div/img"));
		Actions actions=new Actions(driver);
		actions.doubleClick(wishlistProduct).perform();
		ProductsPage productsPage=new ProductsPage(driver);
		productsPage.getBuyNowButton().click();
		SelectAddressPage addressPage=new SelectAddressPage(driver);
		addressPage.getAddressButton().click();
		addressPage.getProceedButton().click();
		PaymentPage payment=new PaymentPage(driver);
		payment.getCashOnDeliveryButton().click();
		payment.getProceedButton().click();
	}
}