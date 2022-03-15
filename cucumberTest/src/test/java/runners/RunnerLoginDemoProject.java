package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/loginDemoProject.feature"
        , glue = "stepDefinition"
        , monochrome = false
        , dryRun = false
        , plugin = {"pretty", "html:target/HTMLReports/report.html"}
        , tags = "" // Example => "{@smoketest}"  // (and) and (or) is aplicable with this feature
)
public class RunnerLoginDemoProject extends AbstractTestNGCucumberTests {

}
