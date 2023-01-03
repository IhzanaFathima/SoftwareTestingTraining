package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();

		WebElement from=driver.findElement(By.id("from_station"));
		from.sendKeys("Ernakulam");
		Thread.sleep(5000);
		
		WebElement to=driver.findElement(By.id("to_station"));
		to.sendKeys("Palakkad");
		Thread.sleep(5000);
		
		WebElement searchTrainBtn=driver.findElement(By.id("trainFormButton"));
		searchTrainBtn.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
