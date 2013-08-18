package co.com.ceiba.cucumbersample;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:build/cukes"})
public class CucumberTests {

}
