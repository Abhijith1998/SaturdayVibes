package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@aria-label='simple table']")
	private WebElement availablePincodes;

	public WebElement getAvailablePincodes() {
		return availablePincodes;
	}
}