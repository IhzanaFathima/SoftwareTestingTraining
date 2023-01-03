package org.dropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OutputJsbinFruits2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement dropdwn = driver.findElement(By.id("fruits"));
		Select s = new Select(dropdwn);
		
		List<WebElement> opt = s.getOptions();
		
		for (int i = 0; i < opt.size(); i++) {
			
			s.selectByIndex(i);
		}
		
		Thread.sleep(3000);
		
        TakesScreenshot ts=(TakesScreenshot)driver;
		
		File img=ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\SYSTEMS\\eclipse-workspace\\SeleniumProject\\Screenshots\\Fruits.png");
		
		FileUtils.copyFile(img, f);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String txt = firstSelectedOption.getText();
		System.out.println("First Selected option is : "+txt);
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	
	}
}
 