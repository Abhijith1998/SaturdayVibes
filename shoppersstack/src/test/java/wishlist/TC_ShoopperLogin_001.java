package wishlist;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.HomePage;
import pomRepos.WishlistPage;

public class TC_ShoopperLogin_001 extends BaseClass {
	//test data
	String wishListPage="";
	@Test
	public void removeFromWishList() {
		HomePage homepage=new HomePage(driver);
		homepage.getAccountSettingsBtn().click();
		homepage.getWishList().click();
		WishlistPage wishlistPage=new WishlistPage(driver);
		wishlistPage.getRemoveFromWishList().click();
		driver.switchTo().alert().accept();
		String productName = driver.findElements(By.xpath("//h2")).get(1).getText();
		Reporter.log(productName, true);
	}
}