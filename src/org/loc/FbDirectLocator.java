package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDirectLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ihzanafathimaks@gmail.com");
		
		WebElement psswrd=driver.findElement(By.name("pass"));
		psswrd.sendKeys("123456");
		
		WebElement logBtn=driver.findElement(By.name("login"));
		logBtn.click();
	
	}
}
