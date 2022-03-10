package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features"
        , glue = {"stepDefinition"}
)
public class RunnerGeneral extends AbstractTestNGCucumberTests {

}
