package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();

		WebElement select=driver.findElement(By.id("autocomplete"));
		select.click();
		Thread.sleep(2000);
		
		WebElement DropDown=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		DropDown.click();
		
		WebElement searchBtn=driver.findElement(By.xpath("//a[text()='Search']"));
		searchBtn.click();
		
		Thread.sleep(2000);
		WebElement product=driver.findElement(By.xpath("//img[@title='ZEBRONICS Zeb-MA5211 USB Charger Adapter with 1 Metre Micro USB Cable, Fast Charge, for Mobile Phone/Tablets (White)']"));
		product.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
