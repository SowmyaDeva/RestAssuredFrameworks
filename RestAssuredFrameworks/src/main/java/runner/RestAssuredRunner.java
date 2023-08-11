package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/main/java/features/IncidentManagement.feature", glue = "steps", monochrome = true)
public class RestAssuredRunner extends AbstractTestNGCucumberTests{

}
