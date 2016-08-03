import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features"},
    format = {"pretty","json:target/result.json"},
    tags = {"@complete"})

public class RunCukesTest {
}