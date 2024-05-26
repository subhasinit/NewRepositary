package com.subha;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHand {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendkeys("iphone",keys.ENTER);
		WebElement lnkIphones= driver.findElement(By.xpath("//span[text()='Apple iPhone 15'"));
		lnkIphones.click();	
		String parWindowId=driver.getWindowHandle();
		System.out.println(parWindowId);
		Set<String>allWindowId  = driver.getWindowHandles();
		System.out.println(allWindowId);
		for(String eachWindowId : allWindowId)
		{
			if(!eachWindowId.equals(parWindowId))
			{
				driver.switchTo().window(eachWindowId);
			}
		}
		WebElement btnAddCart=driver.findElement(By.id((""));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executescript("argument[0].click",btnAddCart);
driver.close();
	}}
