package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
//         plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:testOutput/HtmlReport/ExtentHtml.html"},
        plugin = { "pretty", "json:target/cucumber-reports/API_Report.json",
                "junit:target/cucumber-reports/API_Report.xml"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}
)

public class Runner {

}
