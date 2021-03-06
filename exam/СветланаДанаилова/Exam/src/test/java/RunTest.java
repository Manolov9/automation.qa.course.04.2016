import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/NewJob.feature"},
        format = {"pretty","html:target/cucumber"},
        tags = {"@complete"})

public class RunTest {
}