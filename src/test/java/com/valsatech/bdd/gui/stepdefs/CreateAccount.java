package com.valsatech.bdd.gui.stepdefs;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import com.valsatech.bdd.libraries.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class CreateAccount extends UIDriver{
	By Name = By.id("name");
	By Save = By.xpath("//input[@title='Save']");
	By Edit = By.id("edit_button");
	String result;
	@When("^I enter the details to add an account and Save:$")
	public void i_enter_the_details_to_add_an_account(Map<String,String> arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Map<String,By> uiele = new HashMap<String,By>();
	    uiele.put("Name", Name);
	    for(String key:arg1.keySet())
	    {
	    	enter_text(uiele.get(key), arg1.get(key));
	    }
	    click(Save);
	    result = AccessibilityDriver.run508OnPage(UIDriver.driver.getPageSource(),"Add Account Page");
	    UIDriver.mystep.write(result);
	}

	@Then("^the account should be added successfully$")
	public void the_account_should_be_added_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue("Verify that the account is saved",waitforElementPresent(Edit,10));
	    UIDriver.mystep.write("This is a custom message -- Account saved successfully");
	    result = AccessibilityDriver.run508OnPage(UIDriver.driver.getPageSource(),"Successful Account Page");
	    UIDriver.mystep.write(result);
	}

	@Then("^I should have an entry for the added record in database:$")
	public void i_should_have_an_entry_for_the_added_record_in_database(Map<String,String> arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String sqlQuery = "Select * from Accounts where name='NAME'";
		String[] dbColumns = {"id","name"};
		Map<String,String> data = new HashMap<String,String>();
		
		for(String s:arg1.keySet())
		{
			data = DBDriver.readDBData(sqlQuery.replace("NAME", arg1.get(s)),dbColumns);
		}
		
		assertTrue("Verify that data is returned for the query",data.size()>0);
		UIDriver.mystep.write("The name as saved in DB is : "+ data.get("name"));
		UIDriver.mystep.write("The id as saved in DB is : "+ data.get("id"));
	}

}
