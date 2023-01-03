package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement select=driver.findElement(By.name("url"));
		select.click();
		Thread.sleep(2000);
		
		WebElement DropDown=driver.findElement(By.xpath("//option[text()='Watches']"));
		DropDown.click();
		
		WebElement searchBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
        
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
