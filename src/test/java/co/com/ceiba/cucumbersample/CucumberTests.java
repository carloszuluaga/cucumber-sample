package co.com.ceiba.cucumbersample;

import org.junit.runner.RunWith;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;

import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:build/cukes"})
@GwtModule("co.com.ceiba.cucumbersample.gwt.Sample")
public class CucumberTests extends GwtTest{

}
