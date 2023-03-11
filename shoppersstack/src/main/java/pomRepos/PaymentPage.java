package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Cash On Delivery (COD)']/..//input[@type=\"radio\"]")
	private WebElement cashOnDeliveryButton;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;

	public WebElement getCashOnDeliveryButton() {
		return cashOnDeliveryButton;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}
	
	@FindBy(xpath = "//p[text()='CREDIT']/../../..//input[@type=\"radio\"]")
	private WebElement creditCardPaymentButton;

	public WebElement getCreditCardPaymentButton() {
		return creditCardPaymentButton;
	}
	
	@FindBy(id = "PIN")
	private WebElement pinTextField;
	
	@FindBy(id = "Submit")
	private WebElement submitButton;

	public WebElement getPinTextField() {
		return pinTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath = "//input[@value='Net Banking']")
	private WebElement netBankingRadioButton;

	public WebElement getNetBankingRadioButton() {
		return netBankingRadioButton;
	}
	
	@FindBy(xpath = "//span[text()='TCICI']/..//input")
	private WebElement tciciRadioButton;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement bankSubmitButton;

	public WebElement getTciciRadioButton() {
		return tciciRadioButton;
	}

	public WebElement getBankSubmitButton() {
		return bankSubmitButton;
	}
	
	@FindBy(xpath = "//iframe[@title='Netbanking']")
	private WebElement netBankingFrame;
	
	public WebElement getNetBankingFrame() {
		return netBankingFrame;
	}

	public WebElement getNetBankingLoginFrame() {
		return netBankingLoginFrame;
	}

	public WebElement getUserIdTextField() {
		return userIdTextField;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getPayAmountFrame() {
		return payAmountFrame;
	}

	public WebElement getPayNowButton() {
		return payNowButton;
	}

	@FindBy(xpath = "//iframe[@title='Netbanking Login']")
	private WebElement netBankingLoginFrame;
	
	@FindBy(id = "User ID")
	private WebElement userIdTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextFiled;
	
	@FindBy(xpath = "//iframe[@title='Pay Amount']")
	private WebElement payAmountFrame;
	
	@FindBy(xpath = "//button[text()='Pay Now']")
	private WebElement payNowButton;
	
}
