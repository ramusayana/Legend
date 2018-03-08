package runner ;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Feature_Files"}, dryRun = false , strict = false , monochrome = true , format = { "pretty", "html:target/cucumber"}, glue = {"stepdefinitions"}, tags = "@Regression")




public class RunTest {

}
