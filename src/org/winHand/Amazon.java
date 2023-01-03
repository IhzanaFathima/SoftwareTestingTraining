package org.winHand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r= new Robot();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone x");
		
		WebElement searchBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
		Thread.sleep(3000);
		
		WebElement iphoneX=driver.findElement(By.xpath("//img[@alt='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
		a.contextClick(iphoneX).perform();
		
		for (int i = 0; i < 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		String parentWindId = driver.getWindowHandle();
		Set<String> subWindId = driver.getWindowHandles();
		
		for (String winId : subWindId) {
			
			if (winId!=parentWindId) {
				
				driver.switchTo().window(winId);
			}
		}
		
		WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
		
		WebElement iphonePrice=driver.findElement(By.xpath("(//span[text()='299'])[1]"));
        System.out.println("\nIphoneX Price : "+iphonePrice.getText());
        
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
