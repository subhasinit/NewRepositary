package com.subha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesExample {
		   @SuppressWarnings("deprecation")
		public static void main(String[] args) {
		     
		      WebDriver driver = new ChromeDriver();
		      driver.get("https://the-internet.herokuapp.com/frames");
		      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		      // identify element and click
		      driver.findElement(By.partialLinkText("Nested")).click();
		      // switching to frame with frame name
		      driver.switchTo().frame("frame-bottom");
		      WebElement m = (WebElement) driver.findElement(By.xpath("//body"));
		      System.out.println("Element identified with xpath: " +((org.openqa.selenium.WebElement) m).getText());
		      driver.close();
		   }
		


		      }
	

	
	
	
	

