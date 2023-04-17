package StepDefinition;


//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.Helper;
//import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
//import io.qameta.allure.Allure;


public class Hooks {
	public static WebDriver driver;
	 @BeforeAll
	   public static void setUp() {
	    	
	    	Helper.setUpDriver();
	   }
	 @Before
		public void scenario(Scenario scenario) {
//			LoggerLoad.info("===============================================================================================");
//			LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
//			LoggerLoad.info("-----------------------------------------------------------------------------------------------");
			Helper.setUpDriver();
		}
	 @AfterStep
		public void afterstep(Scenario scenario) {
			if (scenario.isFailed()) {
				Helper.getDriver();
//				LoggerLoad.error("Steps Failed , Taking Screenshot");
//				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", "My screenshot");
//				Allure.addAttachment("Myscreenshot",
//						new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//			
			}
		}
//	 @AfterAll
//		public static void after() {
////			LoggerLoad.info("Closing Driver");
//			Helper.tearDown();
//		}
}

