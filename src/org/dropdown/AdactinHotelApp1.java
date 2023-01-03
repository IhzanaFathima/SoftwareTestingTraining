package org.dropdown;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement email=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','ChachnaManuu')", email);
		
		WebElement psswrd=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','123456')", psswrd);
		
		WebElement logBtn=driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", logBtn);
		Thread.sleep(3000);
		
		WebElement location = driver.findElement(By.id("location"));
		Select l = new Select(location);
		l.selectByVisibleText("London");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);
		h.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select rt = new Select(roomType);
		rt.selectByVisibleText("Standard");
		
		WebElement no_ofRooms = driver.findElement(By.id("room_nos"));
		Select nr = new Select(no_ofRooms);
		nr.selectByVisibleText("1 - One");
		
		WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
		Select ar = new Select(adultPerRoom);
		ar.selectByVisibleText("1 - One");
		
		WebElement childPerRoom = driver.findElement(By.id("child_room"));
		Select cr = new Select(childPerRoom);
		cr.selectByVisibleText("1 - One");
		
		WebElement srchBtn=driver.findElement(By.id("Submit"));
		js.executeScript("arguments[0].click()", srchBtn);
		Thread.sleep(3000);
		
		WebElement radioBtn=driver.findElement(By.id("radiobutton_0"));
		js.executeScript("arguments[0].click()", radioBtn);
		
		WebElement cntnBtn=driver.findElement(By.id("continue"));
		js.executeScript("arguments[0].click()", cntnBtn);
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File img=ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\SYSTEMS\\eclipse-workspace\\SeleniumProject\\Screenshots\\AdactinHotelApp.png");
		
		FileUtils.copyFile(img, f);
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
