package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.AbstracPage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;

public class homePageStep extends AbstracPage{
	WebDriver driver;
	public homePageStep() {
		this.driver = Hooks.openAndQuitBrowser();
	}
	@Then("^Home page display$")
	public void homePageDisplay()  {
		sleepInSecond(3);
		Assert.assertEquals(getCurrentPageTitle(driver), "Guru99 Bank Manager HomePage");
	}
}