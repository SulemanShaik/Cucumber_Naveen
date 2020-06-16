package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features ="E:\\Selenium Practice - SEPTEMBER\\CucumberPractice_Naveen\\Features\\tagging.feature",   //the path of the feature file
		                                //Or
		         //features={".//Features/tagging.feature"},    
		         glue= {"StepDefinition"},  //the path of the step definition file
		         //plugin= {"pretty","html-test output"},
		         plugin= {"pretty"},
		         monochrome=true, // display the console output in a proper readable format
		         strict=true,   //it will check if any step is not define in step definition file
		         dryRun=false,   //to   check the mapping is proper between feature file and step definition file
   	             tags = {"~@SmokeTest" , "~@RegressionTest"}
		         )

public class TestRunner {

}

//OR : tags {"@RegressionTest, @SmokeTest"} --> execute all tests tagged as @SmokeTest OR @RegressionTest
//AND : tags {"@RegressionTest","@SmokeTest"} -->execute all tests tagged as @SmokeTest AND @RegressionTest
//~  :    tags = {"~@SmokeTest" , "~@RegressionTest"} --> it will ignore the particular test