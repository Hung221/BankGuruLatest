package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageUI.despositUI;
import PageUI.newAccountBankUI;
import commons.AbstracPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class despositStep extends AbstracPage {
	String amountPlus = "1000";
	WebDriver driver;
	public despositStep () {
		this.driver = Hooks.openAndQuitBrowser();
	}
	@Given("^I click Deposit$")
	public void iClickDeposit()  {   
	    clickToElement(driver, despositUI.DEPOSIT_LINK);
	}

	@When("^I input account number$")
	public void iInputAccountNumber()  {
	    sendKeyElement(driver, despositUI.ACCOUNT_NO, newAccountBankStep.accountId);
	}

	@When("^I input amount$")
	public void iInputAmount()  {
	    sendKeyElement(driver, despositUI.AMOUNT, amountPlus);
	}

	@When("^I input Description$")
	public void iInputDescription()  {
	    sendKeyElement(driver, despositUI.DESC, "chuyen");
	    
	}

	@When("^I submit$")
	public void iSubmit()  {
	    clickToElement(driver, despositUI.SUBMIT);
	}

	@Then("^The mount is deposited successfully$")
	public void theMountIsDepositedSuccessfully()  {
	    sleepInSecond(1);
	    Assert.assertEquals(getElementText(driver, despositUI.CURENT_BALANCE), "6000");
	}
}
	
