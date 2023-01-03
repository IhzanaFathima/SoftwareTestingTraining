package org.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
 
		System.out.println("\nFlipkart User Credentials :\n--------------------------------");
		
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','ihzanafathimaks@gmail.com')", email);
		//Thread.sleep(3000);
		
		WebElement psswrd=driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','123456')", psswrd);
		Thread.sleep(3000);
		
		Object emailValue = js.executeScript("return arguments[0].getAttribute('value')",email);
		System.out.println("Email : "+emailValue);
		Object psswrdValue = js.executeScript("return arguments[0].getAttribute('value')",psswrd);
		System.out.println("Password : "+psswrdValue);
		
		WebElement logBtn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].click()", logBtn);
			
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
