package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "increase")
	private WebElement increaseButton;
	
	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCartButton;

	public WebElement getIncreaseButton() {
		return increaseButton;
	}

	public WebElement getRemoveFromCartButton() {
		return removeFromCartButton;
	}
	
	@FindBy(id = "buynow_fl")
	public WebElement buyNowButton;

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	
}
