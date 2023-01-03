package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
 
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ihzanafathimaks@gmail.com");
		
		WebElement psswrd=driver.findElement(By.xpath("//input[@type='password']"));
		psswrd.sendKeys("123456");
		
		WebElement logBtn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		logBtn.click();
			
        Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
