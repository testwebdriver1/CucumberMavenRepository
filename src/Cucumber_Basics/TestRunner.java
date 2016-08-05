package Cucumber_Basics;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/Cucumber_Basics",
				 plugin={"pretty","html:target/Destination",
				 "json:C:\\Users\\Suzan\\.jenkins\\jobs\\CucumberMavenReportingPlugin\\target\\cucumber.json",
				 "junit:target_junit/cucumber.xml"})

public class TestRunner {
	

}


