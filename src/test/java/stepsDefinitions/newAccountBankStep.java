package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageUI.newAccountBankUI;
import commons.AbstracPage;
import commons.AbtractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class newAccountBankStep extends AbstracPage {
	static String accountId;
	String amount = "5000";
	WebDriver driver;
	public newAccountBankStep() {
		driver = Hooks.openAndQuitBrowser();
	}
	@Given("^I click New Account$")
	public void iClickNewAccount()  {
		waitToElementClickAble(driver, newAccountBankUI.NEW_ACCOUNT_LINK);
	   clickToElement(driver, newAccountBankUI.NEW_ACCOUNT_LINK);
	}

	@When("^I input CustomerID$")
	public void iInputCustomerID()  {
	    sendKeyElement(driver,  newAccountBankUI.CUSTOMER_ID, newCustomerPageStep.customerID); 
	}

	@When("^I select Account type$")
	public void iSelectAccountType()  {
	    selectItemInDropDown(driver, newAccountBankUI.SECLECT_ACCOUNT, "Savings");
	}

	@When("^I input intital despoit$")
	public void iInputIntitalDespoit()  {
	    sendKeyElement(driver, newAccountBankUI.INTITAL_DESPOIT, amount);
	}

	@When("^I press submit$")
	public void iPressSubmit()  {
	    clickToElement(driver, newAccountBankUI.SUBMIT);
	}

	@Then("^Current amount will be as same as value intital despoit$")
	public void currentAmountWillBeAsSameAsValueIntitalDespoit()  {
	    sleepInSecond(1);
	    waitToElementVisible(driver, newAccountBankUI.CURRENT_AMOUNT);
	    Assert.assertEquals(getElementText(driver, newAccountBankUI.VALUE_CURRENT_AMOUNT), amount);
	    accountId = getElementText(driver, newAccountBankUI.ACCOUNT_ID_VALUE);
	    
	}
}
