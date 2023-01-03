package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesEduAboutUs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://inmakesedu.com/about_us");
		driver.manage().window().maximize();
		 
		WebElement para1=driver.findElement(By.xpath("//h2[text()='Inmakes learning hub']"));
		System.out.println("Para is : \n"+para1.getText()+"\n-------------------------");
		WebElement para2=driver.findElement(By.xpath("//p[contains(text(),'Inmakes learning hub')]"));
		System.out.println(para2.getText());
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
