package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement btn=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn.click();
		
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println("Alert Message : "+text);
		a.accept();
		
		Thread.sleep(3000);
		driver.close();
        driver.quit();
	}
}
