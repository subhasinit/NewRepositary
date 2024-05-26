package com.subha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationClass1 {
	public static void main(String args[]) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   Navigation  nav  = driver.navigate();
	   //to load url of webpage (To()----m)
	   nav.to("https://www.facebook.com/");
	   nav.to("https://www.amazon.in/");
	   nav.to("https://www.snapdeal.com/");

	   //to return back to previous page
	   nav.back();
	   Thread.sleep(2000);

	   //to move forward
	   nav.forward();
	   Thread.sleep(2000);
    //to refresh webpage
	   nav.refresh();
	}
}
