package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);

		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement spots=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(spots).perform();
		
		Thread.sleep(3000);
		WebElement WghtGain=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		WghtGain.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
