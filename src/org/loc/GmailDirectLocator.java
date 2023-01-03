package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDirectLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();

		WebElement email=driver.findElement(By.name("identifier"));
		email.sendKeys("ihzanafathimaks@gmail.com");
		
		WebElement nxtBtn=driver.findElement(By.xpath("//span[text()='Next']"));
		nxtBtn.click();
		
		WebElement psswrd=driver.findElement(By.name("Passwd"));
		psswrd.sendKeys("123456");																																																																																																																																										
		
		WebElement nxtBtn2=driver.findElement(By.xpath("//span[text()='Next']"));
		nxtBtn2.click();
	}
}
