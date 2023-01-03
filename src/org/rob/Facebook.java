package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);
		Robot r= new Robot();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ihzanafathima");
				
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		
		for (int j = 0; j < 2; j++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		WebElement psswrd=driver.findElement(By.name("pass"));
		a.contextClick(psswrd).perform();
		
        for (int i = 0; i < 4; i++) {
			
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
