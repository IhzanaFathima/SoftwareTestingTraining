package org.zample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChromeDiver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ihzanafathimaks");
		
		WebElement pswrd = driver.findElement(By.id("pass"));
		pswrd.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
           