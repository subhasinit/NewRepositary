package com.subha;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException{
	WebDriver driver =new ChromeDriver();
	//driver.manage().windows().maximize();
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File ss =ts.getScreenshotAs(OutputType.FILE);
	File f =new File("C:\\Users\\Subha\\eclipse-workspace\\selenyumjavaproject\\Screenshotas\\amazon.png");
			FileUtils.copyFile(ss,f);
}
}
//right click and create a folder and name it as Screenshots
//give last as file name in the path
//get screenshot as is a method in a Take screenshot