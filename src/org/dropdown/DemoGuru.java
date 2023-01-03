package org.dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement dropdwn = driver.findElement(By.name("country"));
		Select s = new Select(dropdwn);
		
		System.out.println("\nOptions of Country : \n");
		
		List<WebElement> opt = s.getOptions();
		
		for (int i = 0; i < opt.size(); i++) {
			
			WebElement optElements = opt.get(i);	
			String text = optElements.getText();
			System.out.println(text);
			
		}
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	
	}
}
