package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOverdd {
	public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.get("https://omrbranch.com/javatraininginchennaiomr");
                driver.manage().window().maximize();
				WebElement lnkcourse = driver.findElement(By.xpath("//a[text()='Courses ']"));
				Actions action = new Actions(driver);
				action.moveToElement(lnkcourse).perform();
				WebElement lnkbigdata = driver.findElement(By.xpath("//a[text()='Bigdata Training']"));
                 lnkbigdata.click();				
				
	 

}
}