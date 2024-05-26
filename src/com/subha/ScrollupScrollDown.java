package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.beust.jcommander.Strings;

public class ScrollupScrollDown {
	public static void main (Strings[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement down=driver.findElement(By.xpath("//li[text()='English(uk)']"));
		js.executeScript("argument[0].ScrollIntoView(true)", down);
		Thread.sleep(3000);
		WebElement up=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].ScrollIntoView(false)",up);
	}

}
