/**
 * Created by Divdedov QA on 6/8/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/tubePage.feature"},
        format = {"pretty","html:target/cucumber"},
        tags = {"@complete"})


public class Cucum_nastroiki {
}
