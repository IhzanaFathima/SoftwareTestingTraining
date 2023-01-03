package org.dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement crtNewAccntBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		crtNewAccntBtn.click();
		Thread.sleep(6000);
		
		WebElement dropdwnDay = driver.findElement(By.id("day"));
		Select s = new Select(dropdwnDay);
		
		
		System.out.println("\n Even Dates for January 2022 \n");
		
		List<WebElement> opt = s.getOptions();
		
		for (int i = 0; i < opt.size(); i++) {
			
			if(i%2!=0) {
				
			System.out.println(" "+opt.get(i).getText()+".Jan.2022");
			
			}
		}
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
          