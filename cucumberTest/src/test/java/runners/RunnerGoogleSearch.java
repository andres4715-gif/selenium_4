package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/googleSearch1.feature"
        , glue = "stepDefinition"
        , monochrome = false
        , plugin = {"pretty","html:target/HTMLReports/report.html"}
        , tags = "" // Example => @smoketest
)
public class RunnerGoogleSearch extends AbstractTestNGCucumberTests {

}
