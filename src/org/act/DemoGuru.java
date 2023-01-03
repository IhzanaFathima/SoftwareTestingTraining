package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Bank=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement DebitAccnt=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(Bank, DebitAccnt).perform();
		Thread.sleep(3000);
			
		
		WebElement Sales=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement CreditAccnt=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(Sales, CreditAccnt).perform();
		Thread.sleep(3000);
		
		WebElement DebitRate=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement DebitAmnt=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(DebitRate, DebitAmnt).perform();
		Thread.sleep(3000);	
			
		WebElement CreditRate=driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement CreditAmnt=driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(CreditRate, CreditAmnt).perform();
			
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
