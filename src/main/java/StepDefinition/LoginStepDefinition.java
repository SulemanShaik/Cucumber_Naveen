package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
/*
	@When("user enter username and password")         
	public void user_enter_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}
	*/
	// Reg Exp
	// 1.\"([^\"]*)\"  
	 //      or
	// 2. \"(.*)\"
	/*@When("user enter {string} and {string}")    //DD Test without Examples Keyword 
	public void user_enter_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}*/
	
	@When("user enters {string} and {string}") //DD Test Using Examples Keyword 
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}
	
	

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}


	
	}



