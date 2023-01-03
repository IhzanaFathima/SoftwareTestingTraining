package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement signInBtn=driver.findElement(By.id("signin-block"));
		Thread.sleep(5000);
		signInBtn.click();
		
		WebElement signIn=driver.findElement(By.id("signInLink"));
		Thread.sleep(5000);
		signIn.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
