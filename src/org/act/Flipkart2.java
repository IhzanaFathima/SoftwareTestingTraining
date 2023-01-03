package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement crossBtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		crossBtn.click();
		Thread.sleep(3000);
		
		WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		a.moveToElement(more ).perform();
        Thread.sleep(3000);
        
        WebElement notePref=driver.findElement(By.xpath("//div[text()='Notification Preferences']"));
		a.moveToElement(notePref ).perform();
		notePref.click();
        Thread.sleep(3000);
		
		WebElement women=driver.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(women).perform();
		Thread.sleep(3000);
			
		WebElement flats=driver.findElement(By.xpath("//a[text()='Flats']"));
		flats.click();
			
        Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
