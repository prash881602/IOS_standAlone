package com.mobpoc;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOS_POC{
static //static AppiumDriver<MobileElement> driver;
	 DesiredCapabilities capabilities;// =  new DesiredCapabilities();
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	
	{
		  //capabilities =  new DesiredCapabilities();
		//device("IOS","iPhone X","11.1");
		//interactWeb();
		//interactApp();
		//runnning in web safari browser
		deviceWeb("IOS","iPhone X","11.1");
		interactWeb();
		//device("IOS","iPhone 6","11.1");
		//interactApp();
		
	}	
       public static void device(String PLATFORM_NAME,String DEVICE_NAME,String PLATFORM_VERSION) {
	   //.iphone();
    	   capabilities =  new DesiredCapabilities();//.iphone();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
       // capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        capabilities.setCapability("bundleId","qwert.IOS-MOB-APP-POC"); 
       
	}
       public static void deviceWeb(String PLATFORM_NAME,String DEVICE_NAME,String PLATFORM_VERSION) {
    	   //.iphone();
        	   capabilities =  new DesiredCapabilities().iphone();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
            //capabilities.setCapability("bundleId","qwert.IOS-MOB-APP-POC"); 
           
    	}
	public static void interactApp() throws MalformedURLException { 
		 
		      
        URL url=new URL("http://0.0.0.0:4723/wd/hub");
		 IOSDriver<MobileElement> driver = null;
	        //IOSDriver driver = AppiumUtils.getIOSDriver();
	        try{
	        	driver = new IOSDriver<>(url,capabilities);
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
        MobileElement emailid;
        MobileElement pwd;
        MobileElement login;
        //MobileElement back;
        MobileElement smiley1;
        try {
        emailid=driver.findElementByAccessibilityId("emailTextField");
        emailid.sendKeys("qwert@gmail.com");
        }catch(Exception e) {
        	e.printStackTrace();
        }
        try {
        pwd=driver.findElementByAccessibilityId("passwordTextField");
        pwd.sendKeys("passworrt");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        try {
        login=driver.findElementByAccessibilityId("loginButton");
        login.click();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        smiley1=driver.findElementByAccessibilityId("smileyImage");               
        System.out.print(smiley1.getAttribute("wdVisible"));
        
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	public static void interactWeb() throws MalformedURLException, InterruptedException { 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		 IOSDriver<MobileElement> driver = null;
	        //IOSDriver driver = AppiumUtils.getIOSDriver();
	        try{
	        	driver = new IOSDriver<>(url,capabilities);
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
		driver.get("https://amazon.com");
				//"redbus.com");
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		 //Thread.sleep(30000);
     String title = driver.getTitle();
     System.out.println(title);
     Thread.sleep(40000);
     driver.findElementByClassName("nav-input").sendKeys("mobiles");
     driver.findElementByXPath("//*[@value='Go']").click();
     Thread.sleep(5000);
     MobileElement results=driver.findElementByXPath("(//*[@title='product-image'])[1]");
   
     if(results.isDisplayed()) {
    	 System.out.println("Results are displayed");
    	  results.click();
    	  Thread.sleep(3000);
    	  System.out.println("selected the first result");
     }
     else {
    	 System.out.println("No results found please refine ur search criteria");
     }
	}
}
        
        
	


