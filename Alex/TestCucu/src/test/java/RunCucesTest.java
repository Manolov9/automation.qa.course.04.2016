/**
 * Created by Vesela on 4.6.2016 г..
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/Logout.feature"},
        format = {"pretty","html:target/cucumber"},
        tags = {"@complete"})


public class RunCucesTest {
}
