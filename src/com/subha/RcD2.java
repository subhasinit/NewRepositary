package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RcD2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement rcclick = driver.findElement(By.xpath("//button [contains(text()='Right ')] "));
		Actions action =new Actions(driver);
		action.contextClick(rcclick).perform();
		rcclick.sendKeys("21.3.2024");
		}
}
