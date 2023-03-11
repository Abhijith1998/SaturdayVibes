package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountSettingsBtn;
	
	public WebElement getAccountSettingsBtn() {
		return accountSettingsBtn;
	}
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishList;
	
	public WebElement getWishList() {
		return wishList;
	}
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath = "//div[@class='featuredProducts_cardContainer__r2Ou6']/div[3]/div[3]/div[2]/button")
	private WebElement addToCartButton;
	
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(id = "cart")
	private WebElement cartButton;

	public WebElement getCartButton() {
		return cartButton;
	}
	
	@FindBy(xpath = "//li[text()='My Orders']")
	private WebElement myOrdersButton;

	public WebElement getMyOrdersButton() {
		return myOrdersButton;
	}
	@FindBy(xpath = "//div[contains(@class,'featuredProducts_cardContainer')]/div[1]")
	private WebElement selectProduct;

	public WebElement getSelectProduct() {
		return selectProduct;
	}
	@FindBy(xpath = "//li[text()='My Wallet']")
	private WebElement myWalletButton;

	public WebElement getMyWalletButton() {
		return myWalletButton;
	}
}
