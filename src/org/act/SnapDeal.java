package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        Actions a=new Actions(driver);

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement mobAndAcc=driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(mobAndAcc).perform();
        Thread.sleep(3000);

        WebElement topSelWear=driver.findElement(By.xpath("//span[text()='Top Selling Wearables']"));
        topSelWear.click();
        			
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
