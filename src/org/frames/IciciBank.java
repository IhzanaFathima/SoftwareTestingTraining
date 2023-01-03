package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement usrId=driver.findElement(By.id("DUMMY1"));
		usrId.click();
		
		WebElement userId=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		userId.sendKeys("ihzanafathimaks");
		
		WebElement psswrd=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		psswrd.sendKeys("123456");
		
		WebElement logBtn=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		logBtn.click();
		
		Thread.sleep(3000);
		driver.close();
        driver.quit();
	}
}
