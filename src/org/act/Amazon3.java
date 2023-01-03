package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);

		WebElement urSelAccnt = driver.findElement(By.xpath("//span[text()='Your Seller Account']"));
		a.moveToElement(urSelAccnt).perform();
		urSelAccnt.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
