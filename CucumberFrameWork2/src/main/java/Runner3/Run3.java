package Runner3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Feature3/Contact.Feature"},glue= {"StepDefinition3"},monochrome= true,tags = {"@Runs"}) 

public class Run3 {
	

}
