package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/search.feature"
        , glue = "stepDefinition"
)
public class RunnerSearch extends AbstractTestNGCucumberTests {

}
