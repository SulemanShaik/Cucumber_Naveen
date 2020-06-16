package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HooksStepDefinition {
	
	@Before
	public void setUp() {
		System.out.println("launch the FF");
		System.out.println("Enter URL for OrangeHRM App");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
		
	}
	@Given("user is an PIM page")
	public void user_is_an_PIM_page() {
		
	    }

	@When("user click on Add Employee")
	public void user_click_on_Add_Employee() {
	    
	}

	@When("user fills all details of employee")
	public void user_fills_all_details_of_employee() {
	    
	}

	@When("Employee is created")
	public void employee_is_created() {
	   
	}
	
	@Given("user is an jobs page")
	public void user_is_an_jobs_page() {
	}
	@When("user click on Add jobs")
	public void user_click_on_Add_jobs() {
	}

	@When("user fills all details of jobs")
	public void user_fills_all_details_of_jobs() {
	    
	}

	@When("job is created")
	public void job_is_created() {
	    
	}




}
