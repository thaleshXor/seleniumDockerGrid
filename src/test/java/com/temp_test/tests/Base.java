package com.temp_test.tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
    protected WebDriver driver;
	String browserName=System.getProperty("BROWSER");
    
	
    //-------------------------------------------RUN ON  SERVER------------------------------------------
	//@Parameters({"browserName"})
    @BeforeMethod
	public void initialSetUp1() throws MalformedURLException {
    	
		System.out.println("performing initial setup of WebDriver");
        //String browserName=name;
        if(browserName.equalsIgnoreCase("CHROME")) {
        	String completeUrl="http://localhost:4444/wd/hub";
        	DesiredCapabilities dc=new DesiredCapabilities();
	        dc.setBrowserName("chrome");

	        ChromeOptions options=new ChromeOptions();
	        options.merge(dc);
	        
	        driver=new RemoteWebDriver(new URL(completeUrl), options);
        }
        else if(browserName.equalsIgnoreCase("FIREFOX")) {
        	String completeUrl="http://localhost:4545/wd/hub";
        	DesiredCapabilities dc=new DesiredCapabilities();
	        dc.setBrowserName("firefox");

	        FirefoxOptions options=new FirefoxOptions();
	        options.merge(dc);  
	        
	        driver=new RemoteWebDriver(new URL(completeUrl), options);
        	
        }
        
        this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		System.out.println("Executing : tearDown()");
		this.driver.quit();
		String name=result.getMethod().getMethodName();
		System.out.println("---------Test : " + name + " ends-----------");
		System.out.print("\n");
		
		
	}

}
