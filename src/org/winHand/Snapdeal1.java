package org.winHand;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement searchBox=driver.findElement(By.name("keyword"));
		searchBox.sendKeys("iphone 7");
        
        WebElement searchBtn=driver.findElement(By.xpath("//span[text()='Search']"));
		searchBtn.click();
        Thread.sleep(3000);
		
		WebElement iphone=driver.findElement(By.xpath("//img[@title='Apple Iphone 7 Plus Hybrid Covers KOVADO - Assorted Smoke Translucent trendy']"));
		iphone.click();
		
		String parentWindId = driver.getWindowHandle();
		Set<String> subWindId = driver.getWindowHandles();
		
		for (String winId : subWindId) {
			
			if (winId!=parentWindId) {
				
				driver.switchTo().window(winId);
			}
		}
		
		WebElement addToCart=driver.findElement(By.xpath("//span[text()='add to cart']"));
		addToCart.click();
		
		WebElement iphone7Price=driver.findElement(By.xpath("//span[text()='Rs. 219']"));
		System.out.println("iphone 7 Price : " +iphone7Price.getText());
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
