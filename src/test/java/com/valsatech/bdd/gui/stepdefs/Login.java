package com.valsatech.bdd.gui.stepdefs;

import java.net.Inet4Address;

import org.openqa.selenium.By;

import com.valsatech.bdd.libraries.AccessibilityDriver;
import com.valsatech.bdd.libraries.UIDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class Login extends UIDriver{
	
	/**
	 * 
	 * Object References
	 */
	By Login = By.id("login_button");
	By Username = By.id("user_name");
	By Password = By.id("user_password");
	By Logoff = By.id("logout_link");
	By Error = By.xpath("//span[@class='error']");
	String result;
	
	@Given("^I am on SugarCRM login page$")
	public void i_am_on_SugarCRM_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String ip =Inet4Address.getAllByName(Inet4Address.getLocalHost().getCanonicalHostName())[1].getHostAddress();
	    UIDriver.driver.get(UIDriver.configprop.getProperty("URL").replace("localhost", "localhost"));
	    UIDriver.driver.manage().window().maximize();
	    //UIDriver.driver.switchTo().frame("demobody");
	    
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(arg1.startsWith("{") && arg1.endsWith("}"))
		{
			arg1 = UIDriver.configprop.getProperty(arg1.replace("}", "").replace("{", ""));
		}
		if(arg2.startsWith("{") && arg2.endsWith("}"))
		{
			arg2 = UIDriver.configprop.getProperty(arg2.replace("}", "").replace("{", ""));
		}
		enter_text(Username, arg1);
		enter_text(Password, arg2);
	    //UIDriver.mystep.write(result);
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		click(Login);
		
		
	}

	@Then("^I should be able to login or see error based on if the credentials are \"(.*?)\" or not$")
	public void i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(arg1.equalsIgnoreCase("true"))
		{
			if(waitforElementPresent(Error,2))
			{
				assertFalse("Error is displayed when logging in.Error:"+getElementText(Error),true);
			}
			else
			{
				assertTrue("Verify login is successful",waitforElementPresent(Logoff,10));
			}
			result = AccessibilityDriver.run508OnPage(UIDriver.driver.getPageSource(),"Error Login Page");
		    UIDriver.mystep.write(result);
		}
		else
		{
			if(waitforElementPresent(Error,2))
			{
				assertTrue("Error is displayed when logging in.Error:"+getElementText(Error),true);
			}
			else
			{
				assertTrue("Verify login is successful",waitforElementPresent(Logoff,10));
			}
			result = AccessibilityDriver.run508OnPage(UIDriver.driver.getPageSource(),"Success Login Page");
		    UIDriver.mystep.write(result);
		}
	}

}
