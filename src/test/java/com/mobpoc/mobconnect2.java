package com.mobpoc;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class mobconnect2

{
	private IOSDriver<MobileElement> iosDriver;
    private static AppiumDriverLocalService service;
    private static AppiumServiceBuilder builder;
	public static void main(String[] args) throws MalformedURLException 
	
	{
	builder = new AppiumServiceBuilder();
	builder.withIPAddress("127.0.0.1");
	builder.usingPort(4723);
	//builder.withCapabilities(cap);
	builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
	builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
		
		service = AppiumDriverLocalService.buildService(builder);
		service.start();	        
				        
        
        //capabilities.setCapability("app", "/Users/user/Downloads/IOS_POC.app");    
        //capabilities.setCapability("device", "iPhone");        
    //capabilities.setCapability("udid","7e44a5dff43dff2a6aef009034d9eecd42bcf959");       
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capabilities.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
        //driver.mana
//IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://0.0.0.0:4745/wd/hub"), capabilities);
         
     // List<MobileElement> ele=driver.findElementsByAccessibilityId("username");
      //System.out.print(ele.size());
      //ele.get(0).clear();
      //ele.get(0).sendKeys("cognizant");
      
      //List<MobileElement> ele1=driver.findElementsByAccessibilityId("password");
      //System.out.print(ele.size());
      //ele1.get(0).clear();
      //ele1.get(0).sendKeys("password");
      
      //MobileElement logbutton=driver.findElementByAccessibilityId("Login");
      //logbutton.click();
      
        //driver.get("https://opensource-demo.orangehrmlive.com/");
		 //capabilities.setCapability("bundleId","qwert.IOS-POC");
        //File appDir=new File("//Users//Amex//Downloads");
        //File app=new File(appDir,"IOS_MOB_APP_POC.app");
        //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Iphone 5");
        //capabilities.setCapability(MobileCapabilityType.UDID, "98467e6bcabae482ea526f42559126dc6b812009");
        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3.4");
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2.2");
        
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "DEQA");
       //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        //capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        //capabilities.setCapability(MobileCapabilityType.APP,"/Users/Amex/Downloads/IOS_MOB_APP_POC.app");
        //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        
       
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	//}
				//return driver;
				}
		
		
		
        
        		
	}


