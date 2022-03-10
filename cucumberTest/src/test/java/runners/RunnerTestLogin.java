package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/login.feature"
        , glue = "stepDefinition"
        , monochrome = true
        , plugin = {"pretty","html:target/HTMLReports/report.html"}
        , tags = "" // Example => @smoketest
)
public class RunnerTestLogin extends AbstractTestNGCucumberTests {

}
