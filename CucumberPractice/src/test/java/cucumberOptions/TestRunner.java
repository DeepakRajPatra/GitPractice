package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

/*
 * features will contain path of package or feature file we are executing.
 * If we provide only till package path, all feature files will get executed. If a specific file
 * is mentioned in the path, only that file will be executed.
 * glue will contain name of the step definition class
 */
@CucumberOptions(features = "src/test/java/features",
					glue = "stepDefinitions")

public class TestRunner {
	public void Runner() {
		
	}
}
