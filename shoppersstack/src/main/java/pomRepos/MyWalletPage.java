package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWalletPage {
	public MyWalletPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Coupon Code")
	private WebElement couponCodeTextField;
	
	@FindBy(id = "Verify")
	private WebElement verifyButton;
	
	@FindBy(xpath = "//button[@id='Verify']/../..//p")
	private WebElement couponVerification;

	public WebElement getCouponCodeTextField() {
		return couponCodeTextField;
	}

	public WebElement getVerifyButton() {
		return verifyButton;
	}

	public WebElement getCouponVerification() {
		return couponVerification;
	}
}
