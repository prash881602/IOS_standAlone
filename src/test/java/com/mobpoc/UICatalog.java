package com.mobpoc;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class UICatalog{
//static AppiumDriver<MobileElement> driver;



	public static void main(String[] args) throws MalformedURLException 
	
	{
       
	    DesiredCapabilities capabilities =  new DesiredCapabilities();//.iphone();
        
        //capabilities.setCapability("app", "/Users/user/Downloads/IOS_POC.app");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        //capabilities.setCapability("device", "iPhone");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
    //capabilities.setCapability("udid","7e44a5dff43dff2a6aef009034d9eecd42bcf959");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capabilities.setCapability("bundleId","qwert.IOS-POC");
        capabilities.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
        URL url=new URL("http://0.0.0.0:4780/wd/hub");
        //driver.mana
//IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://0.0.0.0:4745/wd/hub"), capabilities);
        IOSDriver<MobileElement> driver = new IOSDriver<MobileElement>(url,capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
      
      
      MobileElement logbutton=driver.findElement(By.xpath(".//[@label='Alert Views']"));
      logbutton.click();
      //logbutton.click();
      
        //driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
