package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'wishlist_listContainer')]/div[1]/div[2]/div[2]/button[2]")
	private WebElement removeFromWishList;

	public WebElement getRemoveFromWishList() {
		return removeFromWishList;
	}
}