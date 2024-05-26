package com.subha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationClass {
	
		public static void main(String args[])  {
			WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   Navigation  nav  = driver.navigate();
		   //to load url of webpage (To()----m)
		   nav.to("https://www.facebook.com/");
		   nav.to("https://www.amazon.in/");
		   nav.to("https://www.snapdeal.com/");

		   //to return back to previous page
		   nav.back();
		}}  
	
			
			
			
			
				
