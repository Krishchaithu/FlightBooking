package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"stepDefinations","appHook"},
        plugin = {"pretty", "html:target/travelWorld.html"}
)
public class TestRunner1 {
}
