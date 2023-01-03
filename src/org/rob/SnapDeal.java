package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r= new Robot();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement womFash=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(womFash).perform();
		a.contextClick(womFash).perform();
		
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
