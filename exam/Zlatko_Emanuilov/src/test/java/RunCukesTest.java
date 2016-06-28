import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/Logout.feature"},
    format = {"pretty","json:target/TestRes.json"},
    tags = {"@complete"})

public class RunCukesTest {
}