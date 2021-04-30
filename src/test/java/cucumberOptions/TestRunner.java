package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// direct to file feature
		features = "src/test/java/features",
		// direct to stepsDifined
		glue = "stepsDefinitions",
		//dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/site/cucumber-report-default","json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE, 
		tags = {"@register_login,@new_customer,@new_account,@desposit"})
		//tags = {"@desposit"})

public class TestRunner {

}
