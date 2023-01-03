package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement fName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fName.sendKeys("ihzana");
		
		WebElement LName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LName.sendKeys("fathima");
		
		//LName.sendKeys(Keys.ENTER);

		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ihzanafathima@gmail.com");
		
		//email.sendKeys(Keys.ENTER);
		
		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("1234567890");
		
		//phone.sendKeys(Keys.ENTER);
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='FeMale']"));
		radiobtn.click();
		
		//radiobtn.sendKeys(Keys.ENTER);
		
		WebElement country=driver.findElement(By.id("countries"));
		country.click();
		
		WebElement countryDdwn=driver.findElement(By.xpath("//option[text()='Select Country']"));
		countryDdwn.click();
		
		/*WebElement country=driver.findElement(By.id("select2-country-container"));
		country.click();
		
		WebElement countryDdwn=driver.findElement(By.xpath("//li[text()='India']"));
		countryDdwn.click();*/
		
		//radiobtn.sendKeys(Keys.ENTER);
			
		WebElement subBtn=driver.findElement(By.id("submitbtn"));
		subBtn.click();
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	
	}
}
