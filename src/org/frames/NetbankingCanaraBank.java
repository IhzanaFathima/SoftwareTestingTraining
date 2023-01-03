package org.frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NetbankingCanaraBank {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement signInBtn = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		act.moveToElement(signInBtn);
		signInBtn.click();
		Thread.sleep(3000);
		
	    Alert a=driver.switchTo().alert();
	    String text = a.getText();
		System.out.println("Alert Message : "+text);
		a.accept();
		
		Thread.sleep(3000);
		driver.close();
        driver.quit();
	}
}
