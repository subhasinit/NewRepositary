package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	//mouse right click actions
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Actions acc= new Actions(driver);
		WebElement gmail =driver.findElement(By.xpath("//a[text()='Gmail']"));
		acc.contextClick(gmail).perform();
	}

}
