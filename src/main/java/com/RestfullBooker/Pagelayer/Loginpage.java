package com.RestfullBooker.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RestfulBooker.Testbase.Testbase;

public class Loginpage extends Testbase {

	public Loginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement username_textbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement password_textbox;
	
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	private WebElement login_button;
	
	public void enterusername(String username) {
		username_textbox.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
	}
	public void clickonloginbutton() {
		login_button.click();
	}
}
