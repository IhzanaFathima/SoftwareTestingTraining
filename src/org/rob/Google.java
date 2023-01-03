package org.rob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Inmakes_Infotech");
				
		a.doubleClick(search).perform();
		a.doubleClick(search).perform();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
