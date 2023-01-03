package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesEdu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();

		WebElement para=driver.findElement(By.xpath("//h1[contains(text(),'Learning Today For A Better Tomorrow')]"));
		String text = para.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
