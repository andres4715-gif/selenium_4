package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/createNewUserAutomationPractice.feature"
        , glue = "stepDefinition"
        , monochrome = true
        , dryRun = false
        , plugin = {"pretty", "html:target/HTMLReports/report.html"}
        , tags = "" // Example => "{@smoketest}"  // (and) and (or) is aplicable with this feature
)
public class RunnerRunnerLoginDemoProject extends AbstractTestNGCucumberTests {

}
