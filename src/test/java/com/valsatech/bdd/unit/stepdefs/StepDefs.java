package com.valsatech.bdd.unit.stepdefs;



import com.valsatech.bdd.gui.runner.Sample;

import cucumber.api.java.en.Given;

public class StepDefs {
	
	@Given("^I am on SugarCRM login page$")
	public void i_am_on_SugarCRM_login_page() throws Throwable {
	    Sample sample=new Sample();
	    sample.login();
	}
}
