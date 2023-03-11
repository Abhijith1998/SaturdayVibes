package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAddressPage {
	
	public SelectAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "address")
	private WebElement addressButton;
	
	public WebElement getAddressButton() {
		return addressButton;
	}
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;

	public WebElement getProceedButton() {
		return proceedButton;
	}
}
