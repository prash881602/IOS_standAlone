package com.mobpoc;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeBrowserScript {
public static void main(String [] args) throws InterruptedException{
	 WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
           }
}