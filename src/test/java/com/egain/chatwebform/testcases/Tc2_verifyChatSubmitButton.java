package com.egain.chatwebform.testcases;

import org.testng.annotations.Test;

import com.automation.selenium.CustomerWebPagePom;


public class Tc2_verifyChatSubmitButton extends Tc1_verifyChatLaunch{
	
	@ Test
	public void vefifysubmitbutton()
	{
		verifyChatLaunch();
		CustomerWebPagePom wwpage = new CustomerWebPagePom(driver);
		wwpage.fn_verfiysubmitbuttontext();

	}
}
