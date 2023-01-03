package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);
		Robot r= new Robot();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		//login.click();
		
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ihzanafathimaks");
		
		a.doubleClick(email).perform();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		Thread.sleep(3000);
		
		WebElement psswrd=driver.findElement(By.xpath("//input[@type='password']"));
		a.doubleClick(psswrd).perform();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
