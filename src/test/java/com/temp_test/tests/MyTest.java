package com.temp_test.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyTest extends Base{
	
	private String url1;
	private String url2;
	private String url3;
	private String url4;
	private String url5;
	
	//private ExtentTest test;
	//private ExtentReports report;
	
	SoftAssert softAssert=new SoftAssert();
	
	
	@BeforeMethod
	@Parameters({"url1","url2","url3","url4","url5"})
	public void setUp(String url1, String url2, String url3, String url4, String url5) {
		
		System.out.println("Executing : setUp()");
		
		this.url1=url1;
		this.url2=url2;
		this.url3=url3;
		this.url4=url4;
		this.url5=url5;
		
		
	}

 
   @Test
    public void navigateToUrl1() {

	   
	   System.out.println("Executing : navigateToUrl1()");
	   String[] arr=url1.split(";");
	   String expectedTitle=arr[0].replace("title:=", "").toUpperCase();
	   String url=arr[1].replace("url:=", "");
	   System.out.println("--------------Navigating to URL :" + url);
		   
	   try {
		   driver.get(url);
		   String actualTitle=driver.getTitle().toUpperCase();
	 	   System.out.println("Expected Title : " + expectedTitle);
	 	   System.out.println("Actual Title : " + actualTitle);
	 	   System.out.println("URL : " + url);
		   softAssert.assertTrue(actualTitle.contains(expectedTitle));
		   System.out.println("Expected Title : " + expectedTitle);
		   System.out.println("Actual Title : " + actualTitle);
		   System.out.println("--------------------------------------");
	   }
	   catch(Exception e){
		   
		   System.out.println("XXXXXXXXXXXXXX Error while Navigating to URL :\n" + url);
	   }
    }

    @Test
    public void navigateToUrl2(){
    	
 	   
 	   System.out.println("Executing : navigateToUrl2()");
 	   String[] arr=url2.split(";");
 	   String expectedTitle=arr[0].replace("title:=", "").toUpperCase();
 	   String url=arr[1].replace("url:=", "");
 	  System.out.println("--------------Navigating to URL :" + url);
	   try {
	 	   driver.get(url);
	 	   String actualTitle=driver.getTitle().toUpperCase();
	 	   System.out.println("Expected Title : " + expectedTitle);
	 	   System.out.println("Actual Title : " + actualTitle);
	 	   System.out.println("URL : " + url);
	 	   softAssert.assertTrue(actualTitle.contains(expectedTitle));
		   System.out.println("Expected Title : " + expectedTitle);
		   System.out.println("Actual Title : " + actualTitle);
		   System.out.println("--------------------------------------");
	   }
	   catch(Exception e){
		   
		   System.out.println("XXXXXXXXXXXXXX Error while Navigating to URL :\n" + url);
	   } 	   
 	  }

    @Test
    public void navigateToUrl3(){
    	
 	   
 	   System.out.println("Executing : navigateToUrl3()");
 	   String[] arr=url3.split(";");
 	   String expectedTitle=arr[0].replace("title:=", "").toUpperCase();
 	   String url=arr[1].replace("url:=", "");
 	  System.out.println("--------------Navigating to URL :" + url);
	   try {
	 	   driver.get(url);
	 	   String actualTitle=driver.getTitle().toUpperCase();
	 	   System.out.println("Expected Title : " + expectedTitle);
	 	   System.out.println("Actual Title : " + actualTitle);
	 	   System.out.println("URL : " + url);
	 	   softAssert.assertTrue(actualTitle.contains(expectedTitle));
		   System.out.println("Expected Title : " + expectedTitle);
		   System.out.println("Actual Title : " + actualTitle);
		   System.out.println("--------------------------------------");
 
	   }
	   catch(Exception e){
		   
		   System.out.println("XXXXXXXXXXXXXX Error while Navigating to URL :\n" + url);
	   }
    }

    @Test
    public void navigateToUrl4(){
    	
 	   
 	   System.out.println("Executing : navigateToUrl4()");
 	   String[] arr=url4.split(";");
 	   String expectedTitle=arr[0].replace("title:=", "").toUpperCase();
 	   String url=arr[1].replace("url:=", "");
 	  System.out.println("--------------Navigating to URL :" + url);
	   try {
	 	   driver.get(url);
	 	   String actualTitle=driver.getTitle().toUpperCase();
	 	   System.out.println("Expected Title : " + expectedTitle);
	 	   System.out.println("Actual Title : " + actualTitle);
	 	   System.out.println("URL : " + url);
	 	   softAssert.assertTrue(actualTitle.contains(expectedTitle));
		   System.out.println("Expected Title : " + expectedTitle);
		   System.out.println("Actual Title : " + actualTitle);
		   System.out.println("--------------------------------------");

	   }
	   catch(Exception e){
		   
		   System.out.println("XXXXXXXXXXXXXX Error while Navigating to URL :\n" + url);
	   }
    }

    @Test
    public void navigateToUrl5(){
    	
 	   
 	   System.out.println("Executing : navigateToUrl5()");
 	   String[] arr=url5.split(";");
 	   String expectedTitle=arr[0].replace("title:=", "").toUpperCase();
 	   String url=arr[1].replace("url:=", "");
 	  System.out.println("--------------Navigating to URL :" + url);
	   try {
	 	   driver.get(url);
	 	   String actualTitle=driver.getTitle().toUpperCase();
	 	   System.out.println("Expected Title : " + expectedTitle);
	 	   System.out.println("Actual Title : " + actualTitle);
	 	   System.out.println("URL : " + url);
	 	   softAssert.assertTrue(actualTitle.contains(expectedTitle));
		   System.out.println("Expected Title : " + expectedTitle);
		   System.out.println("Actual Title : " + actualTitle);
		   System.out.println("--------------------------------------");

	   }
	   catch(Exception e){
		   
		   System.out.println("XXXXXXXXXXXXXX Error while Navigating to URL :\n" + url);
	   }
    }

}
