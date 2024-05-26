package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RcDC1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement dbclick = driver.findElement(By.xpath("//button [contains(text()='Double ')] "));
		Actions action =new Actions(driver);
		action.doubleClick(dbclick).perform();
	}
}
