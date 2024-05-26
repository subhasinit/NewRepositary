package com.subha;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileOperation {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://Facebook.com/");
		driver.manage().window().maximize();
//type casting
		TakesScreenshot Screenshot=(TakesScreenshot) driver;
		File file =Screenshot.getScreenshotAs(OutputType.FILE );
		//FROM TEMP LOCATION TO PREFERRED LOCATION
		File desffile = new File("C:\\Users\\Subha\\eclipse-workspace\\selenyumjavaproject\\src\\facbooklogin.png");
		FileUtils.copyFile(file, desffile);
	}
}



