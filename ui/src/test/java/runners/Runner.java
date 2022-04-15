package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
//      plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:testOutput"},
        plugin = { "pretty", "json:target/cucumber-reports/UI_Report.json",
                "junit:target/cucumber-reports/UI_Report.xml"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}
)

public class Runner {
}
