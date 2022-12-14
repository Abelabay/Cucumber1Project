package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//abela//OneDrive//Desktop//bootcamp_session//Cucumber1//Features//cucumber.feature",
        glue = "stepDefinition"
)

public class iLearnTestRunner {

}
