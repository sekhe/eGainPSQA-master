package com.egain.agent.loginpage.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class LaunchAgentConsole{

	public static WebDriver driver = null;
	ConfigReader reader;

	@BeforeMethod
	public WebDriver init()
	{
		reader = new ConfigReader();
		System.setProperty("webdriver.chrome.driver",reader.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void fn_AppLaunch(){
		System.out.println("in the fn app launch");
		System.out.println("==Setup is ready==");
		driver.get(reader.getAgentConsoleURL());
		String pagetitle=driver.getTitle();
		System.out.println("==The page tittle is==" +pagetitle);
		Assert.assertEquals(pagetitle,"Agent");
		
		TimeUnit  tu = TimeUnit.MILLISECONDS;
		driver.manage().timeouts().implicitlyWait(40000, tu);
		System.out.println("==Agent console launhced==");
	}
	
	/*@AfterMethod
	public void closetest()
	{
		driver.quit();
	}
	*/
}
