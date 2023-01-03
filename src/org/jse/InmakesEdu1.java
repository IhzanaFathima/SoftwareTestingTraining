package org.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesEdu1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txt=driver.findElement(By.xpath("(//p[@style='text-align:justify;'])[7]"));
        js.executeScript("arguments[0].scrollIntoView(false)", txt);
        Thread.sleep(3000);
        
        //Object obj= js.executeScript("return arguments[0].getAttribute('value')", txt);
		String obj = txt.getText();
        System.out.println("\nInmakes Learning Hub\n---------------------- \n"+obj);
        
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
