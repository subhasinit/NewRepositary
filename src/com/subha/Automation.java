package com.subha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Automation {
	public static void main(String[] args) {

		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement txtUserName = driver.findElement(By.id("	//to click thre new creare button\r\n" + 
				"email"));
		//boolean b = txtUserName.isDisplayed();
		//System.out.println(b);
		//boolean c = txtUserName.isEnabled();
		//System.out.println(c);
		
		
	WebElement  txtUser= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	
	txtUser.sendKeys("greens@email");
	 String userame =txtUser.getAttribute("value");
	System.out.println(userame);
	WebElement txtPwd = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPwd.sendKeys("hello@123");
	String pwd =txtPwd.getAttribute("value");
	System.out.println(pwd);
	
	//to click thre new creare button

	//WebElement btnCreateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
	//btnCreateNewAccount.click();


//	WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
	//btnLogin.click();
	
	//radio button
	//WebElement btnRadioMale = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	//btnRadioMale.click();
	

	
	
	//System.out.println( "before click:"+btnRadioMale.isSelected());
   // btnRadioMale.click();
	//System.out.println( "after click:"+btnRadioMale.isSelected());
	
	// to read the enire textusing xpath gettext()
	//WebElement facebook = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
	//String text =facebook.getText();
	//System.out.println(text);

	 
	}
}
