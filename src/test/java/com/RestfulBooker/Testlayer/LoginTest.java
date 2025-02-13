package com.RestfulBooker.Testlayer;

import org.testng.annotations.Test;

import com.RestfulBooker.Testbase.Testbase;
import com.RestfullBooker.Pagelayer.Loginpage;

public class LoginTest extends Testbase{

	@Test
	public void logintest() throws InterruptedException {
		
		Loginpage loginpage = new Loginpage(driver);
		Thread.sleep(5000);
		loginpage.enterusername("Admin");
		Thread.sleep(5000);
		loginpage.enterpassword("admin123");
		loginpage.clickonloginbutton();
	}
}
