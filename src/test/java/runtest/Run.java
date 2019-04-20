package runtest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/cucum/Require1.feature",glue="steps",
				monochrome=true,tags="@Smoke and @Regression")
//~@Smoke(For not ignoring smoke)
				
public class Run extends AbstractTestNGCucumberTests {
	
//dryRun=true,
//	snippets=SnippetType.CAMELCASE)	

}
