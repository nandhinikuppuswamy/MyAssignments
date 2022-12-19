package SFRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/salesforceFeature/salesforce.feature",
glue = "SFstepFile",
monochrome=true,
publish=true
)
public class runnerFile extends AbstractTestNGCucumberTests {

}
