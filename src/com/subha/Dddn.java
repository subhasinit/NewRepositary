package com.subha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dddn {
	public static void main(String[] args) throws InterruptedException {
  		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
        driver.manage().window().maximize();
		WebElement ddCountry = driver.findElement(By.id("country-list "));
		Select select = new Select(ddCountry);
		select.selectByIndex(0);
		//  GET OPTIONS();IT RETURNS LIST OF WEBELEMENTS RETURNS MORE THAN ONE WEB ELEMENTEE
		//List<WebElement>  options =select.getOptions();
		
		//WebElement element = options.get(10);
		//String text = element.getText();
		//System.out.println(text);
		//int size = options.size();
		//System.out.println(size);
		//to print all the options text
		//get all the options
		//for(int i=0;i<options.size();i++)
		//{
			//get each option
			//WebElement element1 = options.get(i);
			//String text1 = element1.getText();
			//System.out.println(text1);
		}
	}
	


