package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class EmailLogin {
	public static void main (Strings[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
			
				
			WebElement txtUser =driver.findElement(By.xpath("//input[@id='email']"));
			txtUser.sendKeys("greens@org");
			WebElement pwd =driver.findElement(By.xpath("//input[@name='pass']"));
			pwd.sendKeys("helo@123");
			//WebElement btn =driver.findElement(By.xpath(""));
			
			//btn.click();
			
	}
			
			
}
