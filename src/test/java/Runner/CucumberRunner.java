package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@TC_1",
        dryRun = false,
        publish = true,
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",

        }

)

public class CucumberRunner {
}
