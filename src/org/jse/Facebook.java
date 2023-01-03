package org.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement email=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','ihzanafathimaks@gmail.com')", email);
		
		WebElement psswrd=driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456')", psswrd);
		
		WebElement logBtn=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", logBtn);
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
