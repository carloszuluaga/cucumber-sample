package co.com.ceiba.cucumbersample.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloCucumberWebSteps {
	private final WebDriver webDriver;
	
	public HelloCucumberWebSteps(SharedDriver driver) {
		this.webDriver = driver;
	}
	

	
	@Given("^I want to test cucumber on the web$")
	public void I_want_to_test_cucumber_on_the_web() throws Throwable {
		webDriver.get("http://localhost:8080");
	}

	@When("^I write a hello world web app$")
	public void I_write_a_hello_world_web_app() throws Throwable {
	    System.out.println("when web");
	}

	@Then("^I should see \"([^\"]*)\" on the browser$")
	public void I_should_see_on_the_browser(String arg1) throws Throwable {
	    System.out.println("then");
	}
}
