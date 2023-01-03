package org.winHand;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement searchBox=driver.findElement(By.name("keyword"));
		searchBox.sendKeys("hand sanitizer");
        
        WebElement searchBtn=driver.findElement(By.xpath("//span[text()='Search']"));
		searchBtn.click();
        Thread.sleep(3000);
		
		WebElement handSanitizer=driver.findElement(By.xpath("//img[@title='ZERMERO - Antibacterial Hand Sanitizer 2000 mL (Pack of 1)']"));
		handSanitizer.click();
		
		String parentWindId = driver.getWindowHandle();
		Set<String> subWindId = driver.getWindowHandles();
		
		for (String winId : subWindId) {
			
			if (winId!=parentWindId) {
				
				driver.switchTo().window(winId);
			}
		}
		
		WebElement addToCart=driver.findElement(By.xpath("//span[text()='add to cart']"));
		addToCart.click();
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
