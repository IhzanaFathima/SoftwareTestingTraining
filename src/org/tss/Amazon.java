package org.tss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File img=ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\Manaf\\eclipse-worksheet\\SeleniumFirstProject\\Screenshots\\Amazon.png");
		
		FileUtils.copyFile(img, f);
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
