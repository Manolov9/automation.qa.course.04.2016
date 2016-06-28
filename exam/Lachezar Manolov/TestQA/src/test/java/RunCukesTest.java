import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/LogInLogOut.feature"},
        format = {"pretty","json:target/Logout.json"},
        tags = {"@complete"})

public class RunCukesTest {
}