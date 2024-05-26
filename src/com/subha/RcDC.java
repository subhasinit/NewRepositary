package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public interface RcDC {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement butclick = driver.findElement(By.xpath("//button [contains(text()='Click to see current date']) "));
		butclick.click();
	}

}
