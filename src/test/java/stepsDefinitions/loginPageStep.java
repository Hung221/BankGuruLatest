package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageUI.loginUI;
import commons.AbstracPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class loginPageStep extends AbstracPage {
	WebDriver driver;
	public loginPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
	}
	
	@When("^Open Register Page$")
	public void openRegisterPage()  {
		waitToElementClickAble(driver, loginUI.HERE_LINK);
		clickToElement(driver, loginUI.HERE_LINK);
	}
	
	@Given("^Get Login Page Url$")
	public void getLoginPageUrl()  {
		openPageUrl(driver, loginUI.LOGIN_LINK);
	}
	@When("^Submit valid infor to login form$")
	public void submitValidInforToLoginForm()  {
		waitToElementVisible(driver, loginUI.USER_TEXTBOX);
		sendKeyElement(driver, loginUI.USER_TEXTBOX, newAccountPageStep.username);
		waitToElementVisible(driver, loginUI.PASS_TEXTBOX);
		sendKeyElement(driver, loginUI.PASS_TEXTBOX, newAccountPageStep.password);
		clickToElement(driver, loginUI.LOGIN_BUTTON);
	}

}
