package org.dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement crtNewAccntBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		crtNewAccntBtn.click();
		Thread.sleep(3000);
		
		WebElement dropdwn = driver.findElement(By.id("year"));
		Select s = new Select(dropdwn);
		
		System.out.println("\nOptions in Year : \n");
		
		List<WebElement> opt = s.getOptions();
		
		for (int i = 0; i < opt.size(); i++) {
			
			WebElement optElements = opt.get(i);	
			Object txt = js.executeScript("return arguments[0].getAttribute('value')", optElements);
			System.out.println(txt);
			
		}
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
          