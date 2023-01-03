package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(prime).perform();
		Thread.sleep(3000);

		WebElement clickBtn = driver.findElement(By.id("multiasins-img-link"));
		clickBtn.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
