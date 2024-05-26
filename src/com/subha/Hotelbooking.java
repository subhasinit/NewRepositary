package com.subha;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotelbooking {
	


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omrbranch.com/");
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("subhashinit1978@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			password.sendKeys("Subha#12345");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement buttonlogin = driver.findElement(By.xpath("((//button[@type='submit']) [1])"));
			buttonlogin.click();
			WebElement welcomename = driver.findElement(By.xpath("//a[@data-testid='username']"));
			String text7 = welcomename.getText();
			System.out.println(text7);
			// typing nuts in the search box
			WebElement textsearch = driver.findElement(By.xpath("( //input[@type='text'])[1]"));
			textsearch.sendKeys("nuts", Keys.ENTER);

			WebElement text = driver.findElement(By.xpath("//h5 [@class='sectionTitle font35 font-weight-bold color11']"));
			String text2 = text.getText();
			System.out.println(text2);
			WebElement clickadd1 = driver.findElement(
					By.xpath("hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-18"));
			clickadd1.click();
			WebElement clickadd2 = driver.findElement(By.xpath("(//button[@id='cart-21']"));
			clickadd2.click();
			Thread.sleep(3000);
			WebElement selectcart = driver.findElement(By.xpath("//a[@class='hover1']"));
			selectcart.click();
			WebElement textmycart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
			String text3 = textmycart.getText();
			System.out.println(text3);
			WebElement deliveryaddress = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
			deliveryaddress.click();
			// WebElement printdeliveryaddress =
			// driver.findElement(By.xpath("//div[@class='font18 fontSemiBold color20
			// mb-4']"));
			// String text4 = printdeliveryaddress.getText();
			// System.out.println(text4);
			WebElement printdeliveryaddress = driver.findElement(By.xpath("//div[@class='diffAddres mb-md-0 mb-2']"));
			String text4 = printdeliveryaddress.getText();
			System.out.println(text4);

			WebElement selectaddress = driver.findElement(By.xpath("//select[@id='address_type']"));
			Select select = new Select(selectaddress);
			select.selectByIndex(1);
			WebElement firstname = driver.findElement(By.xpath("(//input[@id='search']"));
			firstname.sendKeys("subha");
			WebElement lastname = driver.findElement(By.xpath("((//input[@name='last_name'])[1]"));
			lastname.sendKeys("greens");
			WebElement mobnumber = driver
					.findElement(By.xpath("//input[@class='search form-control ui-autocomplete-input']"));
			mobnumber.sendKeys("9940916679");
			WebElement houseno = driver.findElement(By.xpath("//input[@name='apartment']"));
			houseno.sendKeys("35");
			WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
			address.sendKeys("erode");
			WebElement state = driver.findElement(By.xpath("//select[@name=\"country\"]"));
			Select Select = new Select(state);
			Select.selectByVisibleText("Tamil Nadu");
			WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
			Select Select1 = new Select(city);
			Select1.selectByVisibleText("Erode");
			WebElement zipcode = driver.findElement(By.xpath("//input[@name='zipcode']"));
			zipcode.sendKeys("638152");
			WebElement btnsave = driver.findElement(By.xpath("//button[@class='btn font16 bgTheme colorWhite radius50']"));
			btnsave.click();
			Thread.sleep(3000);
			WebElement down = driver.findElement(By.xpath("//div[@class='font20 fontSemiBold colorTheme mt-4  mb-2']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", down);
			WebElement printpayment = driver.findElement(By.xpath("//select[@class='form-control valid']"));
			String text5 = printpayment.getText();
			System.out.println(text5);
			Thread.sleep(3000);
			WebElement payment = driver.findElement(By.xpath("//select[@class='form-control']"));
			Select Select2 = new Select(payment);
			Select2.selectByVisibleText(" Debit Card ");
			WebElement visa = driver.findElement(By.xpath("  (//label[@class='custom-control-label font14 color20'])[2]"));
			visa.click();
			WebElement carddetails = driver.findElement(By.xpath("  //input[@type='text'][3]"));
			carddetails.sendKeys("5555555555552222");
			WebElement month = driver.findElement(By.xpath("  //select[@name='month'][1]"));
			Select Select3 = new Select(month);
			Select3.selectByVisibleText("July");
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select Select4 = new Select(year);
			Select4.selectByVisibleText("2026");
			WebElement cvv = driver.findElement(By.xpath("(//select[@name='year'])[1]"));
			cvv.sendKeys("345");
			WebElement placeorder = driver.findElement(By.xpath(
					"//button[@class='font22 colorWhite fontSemiBold radius50 bgTheme px-5 py-2 borderNone hover1 text-center']"));
			placeorder.click();
			// WebElement orderid = driver.findElement(By.xpath("//span[@class='font16
			// fontNormal color36']"));
			// String text6 = orderid.getText();
			// System.out.println(text6);}
		}
	

}