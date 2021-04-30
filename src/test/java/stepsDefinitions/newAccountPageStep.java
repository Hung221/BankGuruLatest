package stepsDefinitions;

import org.openqa.selenium.WebDriver;

import PageUI.loginUI;
import PageUI.newAccountUI;
import commons.AbstracPage;
import commons.DataHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class newAccountPageStep extends AbstracPage {
	DataHelper dataTest;
	static String username, password;
	WebDriver driver;
	public newAccountPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
		dataTest = DataHelper.getFakeData();
	}

	@When("^Input to email ID$")
	public void inputToEmailID()  {
		waitToElementVisible(driver, newAccountUI.EMAIL_REGISTER);
		sendKeyElement(driver,  newAccountUI.EMAIL_REGISTER, dataTest.getEmailAddress());
	}

	@When("^I click to Submit button$")
	public void iClickToSubmitButton()  {
		waitToElementClickAble(driver, newAccountUI.SUBMIT_BUTTON);
		clickToElement(driver, newAccountUI.SUBMIT_BUTTON);
	}

	@Then("^Get User and password infor$")
	public void getUserAndPasswordInfor()  {
		waitToElementVisible(driver, newAccountUI.USER_ID_TEXT_VALUE);
		username =  getElementText(driver, newAccountUI.USER_ID_TEXT_VALUE);
		waitToElementVisible(driver, newAccountUI.PASSWORD_TEXT_VALUE);
		password = getElementText(driver, newAccountUI.PASSWORD_TEXT_VALUE);   
	}
	@When("^Back to Login page$")
	public void backToLoginPage()  {
		openPageUrl(driver, loginUI.LOGIN_LINK);   
	}
}
