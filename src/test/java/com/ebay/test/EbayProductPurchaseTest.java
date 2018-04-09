package com.ebay.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/********************************************************************
 * Class Name: EbayProductPurchaseTest
 * Generated : 07 April 2018
 * Description: This is POM class that holds locators and methods on locators.
 * Author : Priyanka
 *******************************************************************/
public class EbayProductPurchaseTest {

	WebDriver driver;

	@FindBy(xpath = "//UIANavigationBar[1]/UIAButton[1]")
	private WebElement eBayIcon;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[1]")
	private WebElement signInBtn;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[1]")
	private WebElement userNameTxtBox;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[2]")
	private WebElement passwordTxtBox;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[@name='Search']")
	private WebElement productSearchTextBox;

	@FindBy(xpath = "//UIANavigationBar[3]/UIAButton[1]")
	private WebElement selectProduct;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='BuyIt']")
	private WebElement buyItBtn;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='Review']")
	private WebElement reviewBtn;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='proceed']")
	private WebElement proceedToPay;

	@FindBy(xpath = "//UIANavigationBar[2]/UIALabel[@name='PaymentType']")
	private WebElement paymentTypeLbl;

	public EbayProductPurchaseTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 /********************************************************************
 * Function Name: verifyEbayLandingPage
 * Generated : 07 April 2018
 * Description: This method verifies that user is on eBay home page, returns true if user is on eBay home page and false if validation fails.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
 
	public boolean verifyEbayLandingPage() throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
	//	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(eBayIcon));

		if (eBayIcon != null) {
			System.out.println("User is on eBay home page");

			status = true;
			// logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		} else {

			status = false;
		}
		return status;

	}
/********************************************************************
 * Function Name: selectSignInBtn
 * Generated : 07 April 2018
 * Description: This method selects Sign In button, returns true if user clicks on Sign In button and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean selectSignInBtn() throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
	//	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));

		try {

			signInBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: enterUserPassword
 * Generated : 07 April 2018
 * Description: This method enters user name and Password on Sign In page, returns true if success and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean enterUserPassword(String userName, String password) throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		try {

			userNameTxtBox.sendKeys(userName);
			passwordTxtBox.sendKeys(password);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: tapSignIn
 * Generated : 07 April 2018
 * Description: This method taps on Sign In button, returns true if successfully selected and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean tapSignIn() throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		try {

			submitBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: enterProductSearch
 * Generated : 07 April 2018
 * Description: This method enters product name in product search text box, returns true if successfully entered and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean enterProductSearch(String product) throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		try {

			productSearchTextBox.sendKeys(product);

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectProductSearch() throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
	

		try {

			selectProduct.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: selectBuyItBtn
 * Generated : 07 April 2018
 * Description: This method selects Buy It button, returns true if successfully selected and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean selectBuyItBtn() throws InterruptedException {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		try {

			buyItBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectReviewBtn() throws InterruptedException {
		boolean status = false;
		
		
		try {

			reviewBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: selectProceedToPay
 * Generated : 07 April 2018
 * Description: This method selects proceed to Pay button, returns true if successfully selected and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean selectProceedToPay() throws InterruptedException {
		boolean status = false;
		
		try {

			proceedToPay.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}
/********************************************************************
 * Function Name: verifyPaymentPage
 * Generated : 07 April 2018
 * Description: This method verifies that user is on Payment page, returns true if successfully navigated and false if not.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
	public boolean verifyPaymentPage() throws InterruptedException {
		boolean status = false;
		

		if (paymentTypeLbl != null) {

			status = true;

		} else {

			status = false;
		}
		return status;

	}

	public boolean tapSubmit() {
		// TODO Auto-generated method stub
		return false;
	}

}
