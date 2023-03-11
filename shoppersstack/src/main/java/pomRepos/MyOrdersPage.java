package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
	
	public MyOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//h3[text()='PLACED'])[1]/../..//button[text()='Track Order']")
	private WebElement trackOrderbutton;
	
	@FindBy(xpath = "(//h3[text()='PLACED'])[1]/../..//button[text()='Cancel Order']")
	private WebElement cancelOrderButton;

	public WebElement getTrackOrderbutton() {
		return trackOrderbutton;
	}

	public WebElement getCancelOrderButton() {
		return cancelOrderButton;
	}
	
	@FindBy(xpath = "//div[contains(@class,'cart_orderTracker')]")
	private WebElement trackingDetails;

	public WebElement getTrackingDetails() {
		return trackingDetails;
	}
	
	@FindBy(xpath = "(//*[@data-testid=\"CloseIcon\"])[7]")
	private WebElement closeIcon;

	public WebElement getCloseIcon() {
		return closeIcon;
	}
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	private WebElement yesButton;

	public WebElement getYesButton() {
		return yesButton;
	}
	
}
