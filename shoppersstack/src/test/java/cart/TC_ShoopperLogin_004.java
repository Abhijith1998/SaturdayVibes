package cart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pomRepos.BaseClass;
import pomRepos.HomePage;

public class TC_ShoopperLogin_004 extends BaseClass {
	@Test
	public void addAndRemoveProducts() {
		HomePage homePage=new HomePage(driver);
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//div[@class='featuredProducts_cardContainer__r2Ou6']/div["+i+"]/div[3]/div[2]/button")).click();
		}
		homePage.getCartButton().click();
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//div[@class=\"cart_checkoutProductContainer__jtOKS\"]/div[1]/div[2]/div[3]")).click();
			driver.findElement(By.xpath("//button[text()='Yes']")).click();	
		}
	}
}