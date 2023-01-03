package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InmakesEdu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);

		driver.get("https://lh.inmakesedu.com/home");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement course=driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(course).perform();
		Thread.sleep(3000);
		
		WebElement SofttestTamil=driver.findElement(By.xpath("//p[text()='Software Testing Tamil']"));
		a.moveToElement(SofttestTamil).perform();
		Thread.sleep(3000);
		
		WebElement MasterCls=driver.findElement(By.xpath("//a[text()='ST Master Class']"));
		MasterCls.click();

		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
