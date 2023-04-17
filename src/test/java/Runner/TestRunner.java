package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//Junit execution

	@CucumberOptions(
			
			features= {"src/test/resources/Features"},//location of feature files
			glue="StepDefinition",//location of step definition files
			plugin= {"pretty",
					"html:target/cucumber.html",
					"json:target/cucumber-reports/reports.json",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//report purpose
			monochrome=true,//console output
			dryRun=false
			)

	public class TestRunner {

	}