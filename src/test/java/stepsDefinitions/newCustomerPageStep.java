package stepsDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageUI.homePageUI;
import PageUI.loginUI;
import PageUI.newAccountUI;
import PageUI.newCustomerUI;
import commons.AbstracPage;
import commons.DataHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class newCustomerPageStep extends AbstracPage {
	WebDriver driver;
	public newCustomerPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
	}
	@Given("^I open New Customer page$")
	public void iOpenNewCustomerPage()  {
		waitToElementClickAble(driver, homePageUI.CUSTOMER_LINK);
		clickToElement(driver, homePageUI.CUSTOMER_LINK); 
		sleepInSecond(1);
	}

	@When("^I input to Customer Form with Data$")
	public void iInputToCustomerFormWithData(DataTable table)  {
		waitToElementVisible(driver, newCustomerUI.NAME_TEXTBOX);
	    List<Map<String ,String>> customer = table.asMaps(String.class, String.class);
	    sendKeyElement(driver, newCustomerUI.NAME_TEXTBOX, customer.get(0).get("Name"));
	    clickToElement(driver, newCustomerUI.MALE_RADIO);
	    sendKeyElement(driver, newCustomerUI.DOB, customer.get(0).get("DateOfBirth"));
	    sendKeyElement(driver, newCustomerUI.ADDR, customer.get(0).get("Address"));
	    sendKeyElement(driver, newCustomerUI.CITY, customer.get(0).get("City"));
	    sendKeyElement(driver, newCustomerUI.STATE, customer.get(0).get("State"));
	    sendKeyElement(driver, newCustomerUI.PIN, customer.get(0).get("Pin"));
	    sendKeyElement(driver, newCustomerUI.TELE, customer.get(0).get("Phone"));
	    sendKeyElement(driver, newCustomerUI.EMAIL_TEXTBOX, customer.get(0).get("Email"));
	    sendKeyElement(driver, newCustomerUI.PASSWORD_TEXTBOX, customer.get(0).get("Password"));
	    clickToElement(driver, newCustomerUI.SUBMIT);
	}

	@Then("^Verify message Customer Registered Successfully!!! displayed success$")
	public void verifyMessageCustomerRegisteredSuccessfullyDisplayedSuccess()  {
		sleepInSecond(3);
	   Assert.assertEquals(newCustomerUI.MESSAGE_SUCCESS, "Verify message Customer Registered Successfully!!!");;
	}

}
