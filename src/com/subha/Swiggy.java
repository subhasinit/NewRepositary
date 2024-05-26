package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		// using xpath here to click the button
		WebElement btn = driver.findElement(By.xpath("//span [@class='_3odgy']"));
		btn.click();
		//entering the location
		WebElement txtloc = driver.findElement(By.xpath("//input[@ class='_381fS _1oTLG _1H_62'] "));
		txtloc.sendKeys("cumbum");

}}
