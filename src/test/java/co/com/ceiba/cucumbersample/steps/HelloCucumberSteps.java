package co.com.ceiba.cucumbersample.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloCucumberSteps {
	@Given("^I want to test cucumber$")
	public void I_want_to_test_cucumber() throws Throwable {
	    System.out.println("Given");
	}

	@When("^I write a hello world app$")
	public void I_write_a_hello_world_app() throws Throwable {
		System.out.println("When");
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String arg1) throws Throwable {
		System.out.println("Then");
	}
}
