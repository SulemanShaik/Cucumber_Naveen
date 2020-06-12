package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features ="Features",   //the path of the feature file
		         glue= {"StepDefinition"},  //the path of the step definition file
		         //plugin= {"pretty","html-test output"},
		         plugin= {"pretty"},
		         monochrome=true, // display the console output in a proper readable format
		          dryRun=false ,   //to   check the mapping is proper between feature file and step definition file
   	             strict=false    //it will check if any step is not define in step definition file
		         )

public class TestRunner {

}
