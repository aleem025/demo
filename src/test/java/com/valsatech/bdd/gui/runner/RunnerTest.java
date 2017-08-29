package com.valsatech.bdd.gui.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"  },
		features={"features"},
		glue={"classpath:com.valsatech.bdd.gui.stepdefs","classpath:com.valsatech.bdd.gui.hooks"}
		
		)

public class RunnerTest {
	
	
}
