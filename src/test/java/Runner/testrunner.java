package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "features"
,glue= "stepdefinition2" 
,tags="@LogInWithExampleKeyword" 
,strict=false
,dryRun=false
,monochrome=true
)

public class testrunner {

	
}