package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features"
        , glue = {"stepDefinition"}
        , monochrome = true
        // , plugin = {"pretty","json:target/JSONReports/report.json"}
        // , plugin = {"pretty","html:target/HTMLReports/report.xml"}
        , plugin = {"pretty","html:target/HTMLReports/report.html"}
        , tags = "" // Example => @smoketest

)
public class RunnerGeneral extends AbstractTestNGCucumberTests {

}
