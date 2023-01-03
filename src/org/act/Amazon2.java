package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);

		WebElement clickBtn = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		a.moveToElement(clickBtn).perform();
		clickBtn.click();
		
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("IhzanaFathima");

		WebElement phNo=driver.findElement(By.id("ap_phone_number"));
		phNo.sendKeys("123456890");
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("ihzana@gmail.com");
		
		WebElement pswrd=driver.findElement(By.id("ap_password"));
		pswrd.sendKeys("123456");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
