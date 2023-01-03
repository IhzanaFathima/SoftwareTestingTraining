package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQaAutomation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement selTraiBtn=driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		action.moveToElement(selTraiBtn);
		selTraiBtn.click();
		
		WebElement GotoReg=driver.findElement(By.xpath("//a[text()='Go To Registration ']"));
		action.moveToElement(GotoReg);
		GotoReg.click();

		WebElement fName=driver.findElement(By.id("first-name"));
		fName.sendKeys("ihzana");
		
		WebElement LName=driver.findElement(By.id("last-name"));
		LName.sendKeys("fathima");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ihzanafathima@gmail.com");
		
		WebElement phone=driver.findElement(By.id("mobile"));
		phone.sendKeys("1234567890");
		
		WebElement country=driver.findElement(By.name("country"));
		action.moveToElement(country);
		country.click();
		
		WebElement countryDdwn=driver.findElement(By.xpath("//option[text()='India']"));
		action.moveToElement(countryDdwn);
		countryDdwn.click();
		
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("Palakkad");
		
		WebElement msg=driver.findElement(By.id("message"));
		msg.sendKeys("Completed");
		
		WebElement captcha=driver.findElement(By.id("code"));
		action.moveToElement(captcha);
		captcha.click();
		
		Thread.sleep(12000);
		System.out.println("Type Captcha here");
					
		WebElement sendBtn=driver.findElement(By.xpath("//button[text()='Send']"));
		action.moveToElement(sendBtn);
		sendBtn.click();
		
        Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
}
