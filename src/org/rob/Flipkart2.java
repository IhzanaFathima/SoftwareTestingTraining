package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);
		Robot r= new Robot();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement crossBtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		crossBtn.click();
		Thread.sleep(3000);
		
		WebElement mobile=driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[3]"));
		a.contextClick(mobile).perform();
		Thread.sleep(3000);
		
		for (int j = 0; j < 5; j++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
