package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

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
        
        WebElement htAndCool=driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));
		a.moveToElement(htAndCool).perform();
        Thread.sleep(3000);
        
        WebElement airCond=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(airCond).perform();
        Thread.sleep(3000);
        
        WebElement portAit=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
        a.moveToElement(portAit).perform();
        portAit.click();
    		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
