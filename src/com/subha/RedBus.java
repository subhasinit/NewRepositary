package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("cumbum");
		 		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("banglore");
	
	
	}

}
