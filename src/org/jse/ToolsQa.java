package org.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.xpath("//div[@class='row find-us-row text-white justify-content-center align-items-center']"));
        js.executeScript("arguments[0].scrollIntoView(false)", txt);
        
        WebElement txt2=driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
        js.executeScript("arguments[0].scrollIntoView(true)", txt2);
             
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
