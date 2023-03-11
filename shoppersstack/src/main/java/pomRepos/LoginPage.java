package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id = "Email")
		private WebElement emailTextField;

		public  WebElement getEmailTextField() {
			return emailTextField;
		}
		
		@FindBy(id = "Password")
		private WebElement passwordTextField;

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}
		
		@FindBy(id = "Login")
		private WebElement emailLoginButton;

		public WebElement getEmailLoginButton() {
			return emailLoginButton;
		}

		
	
}
