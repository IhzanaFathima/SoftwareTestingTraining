package org.dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement email=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','ChachnaManuu')", email);
		
		WebElement psswrd=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','123456')", psswrd);
		
		WebElement logBtn=driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", logBtn);
		Thread.sleep(3000);

		WebElement dropdwn = driver.findElement(By.id("location"));
		Select s = new Select(dropdwn);
		
		System.out.println("\nOptions in Location : \n");
		
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
