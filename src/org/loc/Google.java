package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 
		WebElement text=driver.findElement(By.name("q"));
		text.sendKeys("Inmakes learning hub");
		//text.sendKeys(Keys.ENTER);
		
		WebElement search=driver.findElement(By.xpath("(//span[@role='text'])[1]"));
		search.click();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
