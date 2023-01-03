package org.winHand;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement crossBtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		crossBtn.click();
		Thread.sleep(3000);
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Mask");
        
        WebElement searchBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		searchBtn.click();
        Thread.sleep(3000);
		
		WebElement mask=driver.findElement(By.xpath("//img[@alt='Nea 3 Ply 3 Layered BIS Certified Mask Surgical Mask Pharmaceutical Mask Face Mask SURGICAL-200 mask 009 Water Resistant Surgical Mask With Melt Blown Fabric Layer']"));
		mask.click();
		
		String parentWindId = driver.getWindowHandle();
		Set<String> subWindId = driver.getWindowHandles();
		
		for (String winId : subWindId) {
			
			if (winId!=parentWindId) {
				
				driver.switchTo().window(winId);
			}
		}
		
		WebElement pincodeBox=driver.findElement(By.id("pincodeInputId"));
		pincodeBox.sendKeys("683520");
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
