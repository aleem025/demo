package com.valsatech.bdd.gui.stepdefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.valsatech.bdd.libraries.UIDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class Common extends UIDriver{
	String menulink="//div[@id='moduleList']//a[text()='LINK']";
	By createAccount = By.xpath("//span[text()='Create Account']");
	By Name = By.id("name");
	
	@Given("^there are following Menu Items:$")
	public void there_are_following_Menu_Items(List<String> arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    for(String s:arg1)
	    {
	    	assertTrue("Verify the link "+s+" exists in main menu",findElement(By.xpath(menulink.replace("LINK", s)))!=null);
	    
	    }
	}

	@When("^I hover over the Menu Items$")
	public void i_hover_over_the_Menu_Items() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I should see the following Sub Menus:$")
	public void i_should_see_the_following_Sub_Menus(Map<String,String> arg1)  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)	  
		
			
		for(String s1:arg1.keySet())
	    {
	    	click(By.xpath(menulink.replace("LINK", s1)));
	    	String[] sublinks = arg1.get(s1).split(",");
	    	for(String sublink:sublinks)
	    	{
	    		assertTrue("Verify that the sub link "+sublink+" is present",findElement(By.linkText(sublink))!=null);
	    	}
	    }
	}

	
	@Given("^I am in \"([^\"]*)\" module$")
	public void i_am_in_module(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(By.linkText(arg1));
	}
	
	@Given("^I am on Create Account page$")
	public void i_am_on_Create_Account_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(By.linkText("Accounts"));
	    waitforElementPresent(createAccount,5);
	    click(createAccount);
	    assertTrue("Verify that the create account page is loaded",waitforElementPresent(Name, 5));
	}

}
