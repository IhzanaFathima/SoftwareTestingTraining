package org.winHand;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

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
		searchBox.sendKeys("Redmi");
        
        WebElement searchBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		searchBtn.click();
        Thread.sleep(3000);
		
		WebElement redmi=driver.findElement(By.xpath("//img[@alt='REDMI 10 (Pacific Blue, 64 GB)']"));
		redmi.click();
		
		String parentWindId = driver.getWindowHandle();
		Set<String> subWindId = driver.getWindowHandles();
		
		for (String winId : subWindId) {
			
			if (winId!=parentWindId) {
				
				driver.switchTo().window(winId);
			}
		}
		
		WebElement redmiPrice=driver.findElement(By.xpath("(//div[text()='₹9,999'])[1]"));
		System.out.println("Redmi Price : " +redmiPrice.getText());
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
