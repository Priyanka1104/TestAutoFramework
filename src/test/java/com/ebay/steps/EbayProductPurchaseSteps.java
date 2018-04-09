package com.ebay.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.test.EbayProductPurchaseTest;
import com.ebay.test.EbayProductPurchaseTest;

import com.ebay.utility.AppiumDriverLibraryImpl;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/********************************************************************
 * Class Name: EbayProductPurchaseSteps
 * Generated : 07 April 2018
 * Description: This class holds the various functions to map scenario steps to their step definition Java class files and records status as Pass or Fail. .
 * Author : Priyanka
 *******************************************************************/
public class EbayProductPurchaseSteps extends AppiumDriverLibraryImpl{

 /********************************************************************
 * Function Name: verifyEbayLandingPage
 * Generated : 07 April 2018
 * Description: This method calls verifyEbayLandingPage method to verify user is on eBay Home page.
 * Return type: void
 * Author : Priyanka
 *******************************************************************/	
  
    @Given("^User is on eBay landing page$")
    public void verifyEbayLandingPage() throws Throwable {
    boolean landingStatus =  new EbayProductPurchaseTest(driver).verifyEbayLandingPage();
     if(landingStatus)
     {
    	 
    	 logger.log(LogStatus.PASS, "User is on home page");
     }
     else
     {
    	 logger.log(LogStatus.FAIL, "Test step failed : User is not on eBay home page");
     }
    
    }  
/********************************************************************
 * Function Name: selectSignInBtn
 * Generated : 07 April 2018
 * Description: This method calls selectSignInBtn method to click on Sign in button.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/
	@When("^User tap on Sign In button$")
    public void selectSignInBtn() throws Throwable {
		boolean signInStatus = new EbayProductPurchaseTest(driver).selectSignInBtn();
        
        
        if(signInStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User clicked on SignIn button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on SignIn button");
        }
        
        
        
    }
	
 /********************************************************************
 * Function Name: enterUserPassword
 * Generated : 07 April 2018
 * Description: This method calls enterUserPassword method to enter user name and password.
 * Return type: void
 * Author : Priyanka
 *******************************************************************/	
	@And("^User enters user name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterUserPassword(String userName, String password) throws Throwable {
      
       
       boolean credentialInputStatus =  new EbayProductPurchaseTest(driver).enterUserPassword(userName, password); 
       
       
       if(credentialInputStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User and password entered successfull");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to enter usr name or password");
       }
    }
 /********************************************************************
 * Function Name: tapSignIn
 * Generated : 07 April 2018
 * Description: This method calls tapSubmit method to select Sign In button.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/	
	@And("^user selects Sign In button to navigate on home page$")
    public void tapSignIn() throws Throwable {
        
    boolean submitBtnStatus = new EbayProductPurchaseTest(driver).tapSubmit();
        
        
        if(submitBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User clicked on Sign In button after entering username and Password");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to Sign In");
        }
        
    }
  /********************************************************************
 * Function Name: enterProductSearch
 * Generated : 07 April 2018
 * Description: This method calls enterProductSearch method to enter product to be searched.
 * Return type: void
 * Author : Priyanka
 *******************************************************************/
	@And("^user search product to purchase from search text box as \"([^\"]*)\"$")
    public void enterProductSearch(String product) throws Throwable {
        
        
        
        boolean productSearchtStatus =  new EbayProductPurchaseTest(driver).enterProductSearch(product);
        
        
        if(productSearchtStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully entered product to search");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to entered product to search");
        }
        
        
        
    }
 /********************************************************************
 * Function Name: selectProductSearch
 * Generated : 07 April 2018
 * Description: This method calls selectProductSearch method to select searched product.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/	
	@And("^user select searched product$")
    public void selectProductSearch() throws Throwable {
       
       
       boolean productSearchtSeleStatus =  new EbayProductPurchaseTest(driver).selectProductSearch();
       
       
       if(productSearchtSeleStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User successfully clicked on searched product button");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to click on searched product button");
       }
       
    }
 /********************************************************************
 * Function Name: selectBuyItBtn
 * Generated : 07 April 2018
 * Description: This method calls selectBuyItBtn method to tap on Buy it now button.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/	
	@And("^user tap on Buy it now button$")
    public void selectBuyItBtn() throws Throwable {
        
        
        boolean buyItBtnSeleStatus =  new EbayProductPurchaseTest(driver).selectBuyItBtn();
        
        
        if(buyItBtnSeleStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully clicked on Buy it now button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on Buy it now button");
        }
    }
 /********************************************************************
 * Function Name: selectReviewBtn
 * Generated : 07 April 2018
 * Description:  This method calls selectReviewBtn method to tap on Review option.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/	
	@And("^user tap on Review option$")
    public void selectReviewBtn() throws Throwable {
        
        
       boolean reviewBtnStatus =  new EbayProductPurchaseTest(driver).selectReviewBtn();
        
        
        if(reviewBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully clicked on Select review button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on Select review button");
        }
    }
 /********************************************************************
 * Function Name: selectProceedToPay
 * Generated : 07 April 2018
 * Description:  This method calls selectProceedToPay method to tap on proceed to pay option.
 * Return type : void
 * Author : Priyanka
 *******************************************************************/	
	@And("^user tap on proceed to pay option$")
    public void selectProceedToPay() throws Throwable {
        
        
    boolean proceedToPaBtnStatus =  new EbayProductPurchaseTest(driver).selectProceedToPay();
        
        
        if(proceedToPaBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully selected proceed to pay button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on selected proceed to pay button");
        }
    }
	
 /********************************************************************
 * Function Name: verifyPaymentPage
 * Generated : 07 April 2018
 * Description:  This method calls verifyPaymentPage method to verify thet user is on payment option page.
 * Return type: void
 * Author : Priyanka
 *******************************************************************/
	@Then("^user should get payment option page$")
    public void verifyPaymentPage() throws Throwable {
       
       
       boolean PaymentPageStatus =  new EbayProductPurchaseTest(driver).verifyPaymentPage();
       
       
       if(PaymentPageStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User successfully navigated to Payment page");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to navigated to Payment page");
       }
    
	
}
}
