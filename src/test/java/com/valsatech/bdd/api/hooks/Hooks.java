package com.valsatech.bdd.api.hooks;


import java.io.FileInputStream;

import org.openqa.selenium.firefox.FirefoxDriver;
import com.valsatech.bdd.libraries.UIDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
public class Hooks {
	
	
	@Before
	public void launchBrowser(Scenario s)
	{
		UIDriver.mystep = s;
		try 
		{
			UIDriver.configprop.load(new FileInputStream("config/config.properties"));
			
			if(UIDriver.configprop.getProperty("Browser").equalsIgnoreCase("firefox"))
			{
				UIDriver.driver = new FirefoxDriver();		
			}
		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}		
		
		
	}
	
	
	
	@After
	public void killBrowser(Scenario scenario)
	{
		if(UIDriver.configprop.getProperty("Screenshot").equals("On Failure"))
		{
			if (scenario.isFailed()) {  
				scenario.embed(UIDriver.captureScreenshot(), "image/png"); 
	        }
		}
		else
		{
			scenario.embed(UIDriver.captureScreenshot(), "image/png"); 
		}
		UIDriver.driver.quit();
	}
	
}
