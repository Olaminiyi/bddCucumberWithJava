package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/GoogleSearch.feature",
glue = {"StepsDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
            "json:target/JSONReports/report.json",
            "html:target/HtmlReports/report.html"})
public class TestRunner {
}

