
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/jira.feature"},
        format = {"pretty","html:target/cucumber"},
        tags = {"@complete"})

/**
 * Created by Ico on 6/6/2016.
 */
public class RunTest {
}
