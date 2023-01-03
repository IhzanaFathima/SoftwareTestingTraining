package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetbankingHdfc2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame("login_page");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		userName.sendKeys("1234567890");
		
		WebElement cntnBtn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		cntnBtn.click();
		Thread.sleep(3000);
		
		WebElement pswrd = driver.findElement(By.id("fldPasswordDispId"));
		pswrd.sendKeys("1234567890");
		
		
		Thread.sleep(3000);
		driver.close();
        driver.quit();
	}
}
