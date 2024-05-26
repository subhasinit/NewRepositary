package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.google.com/\r\n");
		driver.manage().window().maximize();
		WebElement txtarea=driver.findElement(By.id("APjFqb"));
		txtarea.sendKeys("GREENSTECHNOLOGY");

	}

}
