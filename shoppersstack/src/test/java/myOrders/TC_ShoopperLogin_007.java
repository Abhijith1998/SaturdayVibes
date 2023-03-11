package myOrders;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.HomePage;
import pomRepos.MyOrdersPage;

public class TC_ShoopperLogin_007 extends BaseClass{
	@Test
	public void trackOrder() throws InterruptedException {
		Thread.sleep(5000);
		HomePage homePage=new HomePage(driver);
		homePage.getAccountSettingsBtn().click();
		homePage.getMyOrdersButton().click();
		MyOrdersPage ordersPage=new MyOrdersPage(driver);
		ordersPage.getTrackOrderbutton().click();
		String trackingDetails = ordersPage.getTrackingDetails().getText();
		Reporter.log(trackingDetails, true);
		ordersPage.getCloseIcon().click();
	}
}
