package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesEduDubaiAdrs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		 
		WebElement para1=driver.findElement(By.xpath("//a[contains(text(),'Dubai')]"));
		System.out.println("\nDubai Address : \n--------------------\nLocation :\n"+para1.getText());
		WebElement para2=driver.findElement(By.xpath("//a[contains(text(),'00971')]"));
		System.out.println("Phone :\n"+para2.getText());
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
