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
		"html:src/reports/HTML_Report.html",
		"json:src/reports/JSON_Report.json",
		"junit:src/reports/XML_Report.xml"
}
)
public class activitiesRunner {

	
}
