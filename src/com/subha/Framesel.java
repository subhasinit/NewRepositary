package com.subha;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Framesel {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		//counting the number of frames
		//==============================
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		//finding and clicking the  frame
		//===================================
	WebElement img1=driver.findElement(By.id("java-content"));
	img1.click();
 //  List<WebElement>findElements=driver.findElements(By.tagName("div"));
	//switching from one frame to another frame
	//=========================================
	driver.switchTo().frame("java-content");
	//WebElement img=driver.findElements(By.xpath("//div[@class='why-learnROw']"));

	}
}
