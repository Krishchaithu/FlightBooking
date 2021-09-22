package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/dataValidation.feature"},
        glue = {"stepDefinations","appHook"},
        plugin = {"pretty", "html:target/dataValidation.html"}
)
public class TestRunner {
}
