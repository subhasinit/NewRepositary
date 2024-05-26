package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RcDc2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestngtraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement butclick = driver.findElement(By.xpath(""));
		butclick.click();


}
}