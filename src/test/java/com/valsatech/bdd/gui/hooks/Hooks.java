package com.valsatech.bdd.gui.hooks;


import java.io.FileInputStream;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
			else if(UIDriver.configprop.getProperty("Browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				ChromeOptions o = new ChromeOptions();
				o.addArguments("disable-extensions");
				o.addArguments("--start-maximized");
				
				UIDriver.driver = new ChromeDriver(o);		
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
