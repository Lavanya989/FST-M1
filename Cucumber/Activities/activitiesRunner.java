package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/features",
glue={"stepDefinitions"},
tags="@SmokeTest",
publish=true,
monochrome=true,
plugin= {"pretty",
		"html:test-reports/HTML_Report.html",
		"json: test-reports/json-report.json",
		"junit:test-reports/XML_Report.xml"
		//"html: test-reports"
}
)
public class activitiesRunner {

	
}
