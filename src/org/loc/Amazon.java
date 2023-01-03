package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		
		WebElement sbmtBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		sbmtBtn.click();
        
		driver.close();
		driver.quit();
	}
}
