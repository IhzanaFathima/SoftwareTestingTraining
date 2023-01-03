package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPrint {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
 
		System.out.println("Login Details : ");
		
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ihzanafathimaks@gmail.com");
		System.out.println("Email : ihzanafathimaks@gmail.com");
		
		WebElement psswrd=driver.findElement(By.xpath("//input[@type='password']"));
		psswrd.sendKeys("123456");
		System.out.println("Password : 123456");
		
		WebElement logBtn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		logBtn.click();
			
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
