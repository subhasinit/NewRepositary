package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DdUsemouse {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//GET() IS USED TO GET THE WEBPAGE USING ITS URL
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		//THIS BELOW COMMAND IS USED TTO MAXIMIZE THE WEB PAGE
		driver.manage().window().maximize();
		//ACTIONS IS CLASS USED TO PERFORM MOUSE OVER  ACTIONS IN A WEBPAGE
		//ACC IS A REFERENCE NAME
		Actions acc= new Actions(driver);
		//THIS COMMAND IS USED FOR FINDING THE ELEMENT TO BE DRAGGED
		WebElement dragEle =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		//THIS COMMAND IS USED TO FIND THE WEBELEMENT TO BE DROPPED
		WebElement dropEle =driver.findElement(By.id("bank"));
		//THIS COMMAND IS USED DRAG AND DROP ELEMENT USING DRAGANDDROP AND PERFORM METHOD
		acc.dragAndDrop(dragEle, dropEle).perform();
		
		WebElement dragEle1 =driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dropEle1 =driver.findElement(By.id("amt7"));
		acc.dragAndDrop(dragEle1, dropEle1).perform();	
		
		WebElement dragEle2 =driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dropEle2 =driver.findElement(By.id("loan"));
		acc.dragAndDrop(dragEle2, dropEle2).perform();
		//place in a webpage from where the webelement to be dragged
		WebElement dragEle3 =driver.findElement(By.xpath( "//a[text()=' 5000']"));
		//place in a webpage to where the element to b dropped
		WebElement dropEle3 =driver.findElement(By.id("amt8"));
		//refernce name dot draganddrop comd(src,destination).perform -m
		acc.dragAndDrop(dragEle3, dropEle3).perform();
		
        WebElement perfect =driver.findElement(By.xpath("//a[text()='Perfect!']"));
        //THIS COMMAND IS USED TO GET THE TEXT IN WEBELEMENT USING GETTEXT() METHOD
        		String txt= perfect.getText();
        		//USED PRINT THE TEXT
        System.out.println(txt);
   // ACTIONS IS PREDEFINED CLASS
   //     USED FOR MOUSE OVER ACTIONS IN A WEBPAGE
        //  IT HAS SIX METHODS
       // ======================
        //1. doubleClick()------------> for doubleclick using mouse
        //2. contextClick()------------> for rightclick using mouse
        //3.keyup()--------------->for key release
        //4.keydown()---------------> for key press
        //5.moveToElement()--------->for mouseover actions
        //6.draganddrop() is to move a webelement from one place to another place
        
    //taken by soundarya mam    
        
        
        
        
        
        
        
        
        
        
        
        
        
        

}}
