package com.subha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboKeys {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/api/documentation");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		// press shift
		robot.keyPress(KeyEvent.VK_SHIFT);
		// press g
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		// press r
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		// release shift
		robot.keyRelease(KeyEvent.VK_SHIFT);
		// tab
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		// press shift
		robot.keyPress(KeyEvent.VK_SHIFT);

		// c
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		// press B
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		// RELEASE SHIFT
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		// press B
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		// RELEASE
		robot.keyRelease(KeyEvent.VK_SHIFT);
		// TAB
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		// ENTER
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
