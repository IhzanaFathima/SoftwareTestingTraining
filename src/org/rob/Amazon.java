package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r= new Robot();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		a.moveToElement(signIn).perform();
		
		WebElement signInBtn=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		signInBtn.click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
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
		driver.close();
		driver.quit();
	}
}
