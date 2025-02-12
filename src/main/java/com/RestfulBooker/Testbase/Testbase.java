package com.RestfulBooker.Testbase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testbase {
	
	public static Logger logger;
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		logger = Logger.getLogger("Restfulbooker");
		PropertyConfigurator.configure("Log4jproperties.file");
		logger.info("Restfullbooker framework started");
	}
    @AfterTest
	public void Tear() {
		logger.info("framework closed");
	}
	@BeforeMethod
	public void Start() {
		String br = "chrome";
	
		if(br.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edgedriver")) {
			driver = new EdgeDriver();
		}
		else {
			logger.info("provide correct browser");
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@AfterMethod
	public void Close () {
		//driver.close();
		
	}
	
	
	
	
}
