package org.winHand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Robot r=new Robot();
		Actions a= new Actions(driver);
		
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement searchBox=driver.findElement(By.id("headerSearch"));
		js.executeScript("arguments[0].setAttribute('value','ceiling fan')", searchBox);
    
		WebElement searchBtn=driver.findElement(By.id("headerSearchButton"));
		js.executeScript("arguments[0].click()", searchBtn);
		Thread.sleep(3000);
		
		WebElement ceilingFan=driver.findElement(By.xpath("//img[@alt='Hugger 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit']"));
		js.executeScript("arguments[0].scrollIntoView(true)", ceilingFan);
        a.contextClick(ceilingFan).perform();
		
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
		
		WebElement ceilingFanRemoote=driver.findElement(By.xpath("//img[@alt='Ashby Park 52 in. White Color Changing Integrated LED Brushed Nickel Ceiling Fan with Light Kit and Remote Control']"));
		js.executeScript("arguments[0].scrollIntoView(true)", ceilingFanRemoote);
		js.executeScript("arguments[0].click()", ceilingFanRemoote);
      
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
