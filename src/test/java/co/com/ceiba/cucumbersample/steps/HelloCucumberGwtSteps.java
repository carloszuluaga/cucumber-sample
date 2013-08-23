package co.com.ceiba.cucumbersample.steps;

import static com.googlecode.gwt.test.assertions.GwtAssertions.assertThat;

import org.junit.Test;

import co.com.ceiba.cucumbersample.gwt.client.SampleView;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HelloCucumberGwtSteps{
	SampleView view;
		
	@Given("^I want to test cucumber with gwt$")
	public void I_want_to_test_cucumber_with_gwt() throws Throwable {
		view = new SampleView();
	}

	@When("^I write a hello world gwt app$")
	public void I_write_a_hello_world_gwt_app() throws Throwable {
		System.out.println("when");
	}

	@Then("^I should see \"([^\"]*)\" on gwt$")
	public void I_should_see_on_gwt(String arg1) throws Throwable {
		assertThat(view.button).isVisible();
	}
}
