package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);

		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
        Thread.sleep(3000);
		
		WebElement allDept=driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(allDept).perform();
        Thread.sleep(3000);
        
        WebElement paint=driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
        Thread.sleep(3000);
        
        WebElement intPaint=driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(intPaint).perform();
        Thread.sleep(3000);
        
        WebElement ceilPaint=driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
        a.moveToElement(ceilPaint).perform();
        ceilPaint.click();
    		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
