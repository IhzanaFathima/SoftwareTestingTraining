package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a=new Actions(driver);

		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mob).perform();
		
		Thread.sleep(3000);
		WebElement apple=driver.findElement(By.xpath("//a[text()='Apple']"));
		apple.click();
		
		Thread.sleep(3000);
		String text = apple.getText();
		System.out.println("Mobile Name is : "+text);
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
