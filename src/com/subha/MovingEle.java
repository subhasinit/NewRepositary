package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingEle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement courselnk = driver.findElement(By.xpath("//a[text()='Courses '] "));
	Actions actions =new Actions(driver);
	actions.moveToElement(courselnk).perform();
		WebElement oraclelnk= driver.findElement(By.xpath("//a[text()='Oracle Training']"));
		actions.moveToElement(oraclelnk).perform();

		WebElement sqllnk = driver.findElement(By.xpath("//a[text() = 'SQL Certification']"));
		sqllnk.click();
							//Thread.sleep(3000);
	   // WebElement str3 = driver.findElement(By.xpath(" / "));
		//WebElement str4 = driver.findElement(By.xpath("//ol[@id='java-interface'] "));
							   // Thread.sleep(3000);
	}
}
