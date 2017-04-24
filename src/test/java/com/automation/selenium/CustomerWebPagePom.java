package com.automation.selenium;

import java.sql.Driver;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerWebPagePom {
	
	WebDriver driver;
	
	// The xpaths of all the Webelements displayed on Customer web page are stored here
	
	By LiveChat=By.xpath("//div/img[@src='chat/img/logo_new.png']");
	
	By labelName=By.xpath("//div/label[text()='Name ']");
	By labelEmail=By.xpath("//div/label[text()='Email ']");
	By labelPhoneNumber=By.xpath("//div/label[text()='Phone Number']");
	By labelYourQuestion=By.xpath("//div/label[text()='Your Question']");
	
	By Name=By.xpath("//input[@name='full_name']");
	By Email=By.xpath("//input[@name='email_address']");
	By PhoneNumber=By.xpath("//input[@name='phone_number']");
	By YourQuestion=By.xpath("//textarea[@name='subject']");
	By StartChatButton=By.xpath("//input[@value='Start Chat']");
	
	By BrandName=By.xpath("//div/span[@class='brand']");	
	By CloseChatButton=By.xpath("//div/a[@class='closechat']");
	
	By NameError=By.xpath("//div[@error-input-name='full_name']");
	By EmailError=By.xpath("//div[@error-input-name='email_address']");			
	By SubjectError=By.xpath("//div[@error-input-name='subject']");	
	
	public CustomerWebPagePom(WebDriver driver){
		this.driver=driver;
		}
	
	// This function will launch the chat web form
	
	public void fn_LaunchChatURL(String chaturl)
	{
	    driver.get(chaturl);
	  // Assert.assertTrue(driver.findElement(FullName).isDisplayed());
	   //System.out.println("pass");
	
	}
	
	// This function will fill the chat form and start a new chat activity
	
	public void fn_StartChat(String name, String Mail, String Phone, String Sub)
		{
		    driver.findElement(Name).sendKeys(name);
			driver.findElement(Email).sendKeys(Mail);
			driver.findElement(PhoneNumber).sendKeys(Phone);
			driver.findElement(YourQuestion).sendKeys(Sub);
			driver.findElement(StartChatButton).click();
		}
		
	// This function will get the title of customer web page
	
		public void fn_ChatWindowTtitle()
		{
			String ChatTitle  = driver.getTitle();
			Assert.assertEquals("Chat by eGain", ChatTitle);
		}
		
		/* This function will get the attributes of all the web elements visible on customer web page, 
		here getting the attributes for Name field */
		
		public void fn_GetAttibutes()
		{
		    String val=driver.findElement(Name).getCssValue("color");
			System.out.println("The value is"   + val);
			String fsiz=driver.findElement(Name).getCssValue("font-size");
			System.out.println("The value is"    + fsiz);	
			String ffamily=driver.findElement(Name).getCssValue("font-family");
			System.out.println("The value is"   + ffamily);
			String bcloor=driver.findElement(Name).getCssValue("border-color");
			System.out.println("The value is"   + bcloor);
			String backcol=driver.findElement(Name).getCssValue("background-color");
			System.out.println("The value is"   + backcol);
			String width=driver.findElement(Name).getCssValue("width");
			System.out.println("The value is"   + width);
			String dis=driver.findElement(Name).getCssValue("display");
			System.out.println("The value is"   + dis);
			String bstyle=driver.findElement(Name).getCssValue("border-style");
			System.out.println("The value is"   + bstyle);
		}
		
		// This function will get the text of Start chat button
		public void fn_SubmitButtontext()
		{ 
			String submitbuttonvalue=driver.findElement(StartChatButton).getAttribute("value");
			System.out.println("The submit button value is" + submitbuttonvalue);
			Assert.assertEquals("Start Chat", submitbuttonvalue);
		}
		
		// This function will check that Live Chat icon is visible on the web form 
		public void fn_LogoVisible()
		{
			String logovalue=driver.findElement(LiveChat).getAttribute("value");
			System.out.println("The submit button value is" + logovalue);
			//Assert.assertEquals("Start Chat", logovalue);	 
		}
		
		// This function will check that all the fields are visible on the web form 
		public void fn_CheckVisibleFields()
		{
			 boolean closebuttonPresence=driver.findElement(CloseChatButton).isDisplayed();
			 System.out.println(closebuttonPresence);
			 System.out.println("Close button is present on web form");
			 boolean FullNameField=driver.findElement(Name).isDisplayed();
			 System.out.println(Name);
			 System.out.println("Name filed is present on web form");
			 boolean MailAddresField=driver.findElement(Email).isDisplayed();
			 System.out.println(Email);
			 System.out.println("Email filed is present on web form");
			 boolean PhoneNumberField=driver.findElement(PhoneNumber).isDisplayed();
			 System.out.println(PhoneNumber);
			 System.out.println("Phone Number filed is present on web form");
			 boolean SubjectField=driver.findElement(YourQuestion).isDisplayed();
			 System.out.println(YourQuestion);
			 System.out.println("Your Qusetoion field is present on web form");
			 boolean SubmitButtonField=driver.findElement(StartChatButton).isDisplayed();
			 System.out.println(StartChatButton);
			 System.out.println("Start chat button is present on web form");
		}	
}