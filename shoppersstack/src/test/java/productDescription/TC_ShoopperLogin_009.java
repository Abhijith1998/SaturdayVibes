package productDescription;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibraries.ReadDataFromExcel;
import pomRepos.BaseClass;
import pomRepos.HelpPage;
import pomRepos.HomePage;
import pomRepos.ProductsPage;

public class TC_ShoopperLogin_009 extends BaseClass{
	@Test
	public void viewDeliverablePincodes() throws EncryptedDocumentException, IOException {
		HomePage homePage=new HomePage(driver);
		homePage.getSelectProduct().click();
		ProductsPage products=new ProductsPage(driver);
		String pincode = ReadDataFromExcel.readDataInStringFromat("HappyFlow", 5, 6);
		pincode=pincode.substring(0, 6);
		System.out.println(pincode);
		products.getCheckDeliveryTextField().sendKeys(pincode);
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(products.getCheckButton()));
		products.getCheckButton().click();
		products.getCheckDeliverablePinsLink().click();
		HelpPage help=new HelpPage(driver);
		String availablePincodes=help.getAvailablePincodes().getText();
		Reporter.log(availablePincodes, true);
	}
}
