package com.valsatech.bdd.unit.runner;

import cucumber.api.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.valsatech.bdd.libraries.UIDriver;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 1,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@passed" },
outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"  },
		features={"features"},
		glue={"classpath:com.valsatech.bdd.unit.stepdefs","classpath:com.valsatech.bdd.unit.hooks"}
		
		)

public class Runner {
	
	
}
