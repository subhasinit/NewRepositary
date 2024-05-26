package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tasksilt {
	
		public static void main(String[] args) throws InterruptedException {
					WebDriver driver = new ChromeDriver();
					driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
	                driver.manage().window().maximize();
					WebElement str1 = driver.findElement(By.xpath("//a[text()=' String ']"));
					WebElement str2 = driver.findElement(By.xpath("//ol[@id='java-class']"));
					Actions action = new Actions(driver);
					action.dragAndDrop(str1,str2).perform();
										Thread.sleep(3000);
				    WebElement str3 = driver.findElement(By.xpath(" //a[text()=' List '] "));
					WebElement str4 = driver.findElement(By.xpath("//ol[@id='java-interface'] "));
										    Thread.sleep(3000);
					action.dragAndDrop(str3,str4).perform();
					WebElement str5 = driver.findElement(By.xpath(" //a[text()=' Actions ']"));
					WebElement str6 = driver.findElement(By.xpath("//ol[@id='selenium-class'] "));
					action.dragAndDrop(str5,str6).perform();
					WebElement str7 = driver.findElement(By.xpath(" //a[text()=' Webdriver '] "));
					WebElement str8 = driver.findElement(By.xpath("//ol[@id='selenium-interface'] "));
					Thread.sleep(3000);
				    action.dragAndDrop(str7,str8).perform();

					
	             				
					
		}
	}



