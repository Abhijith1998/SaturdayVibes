package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Buy Now")
	private WebElement buyNowButton;

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	
	@FindBy(id = "Check Delivery")
	private WebElement checkDeliveryTextField;

	public WebElement getCheckDeliveryTextField() {
		return checkDeliveryTextField;
	}
	
	@FindBy(id = "Check")
	private WebElement checkButton;
	
	public WebElement getCheckButton() {
		return checkButton;
	}

	public WebElement getCheckDeliverablePinsLink() {
		return checkDeliverablePinsLink;
	}

	@FindBy(linkText = "Check deliverable pins.")
	private WebElement checkDeliverablePinsLink;
	
}
