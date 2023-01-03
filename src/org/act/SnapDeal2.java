package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        Actions a=new Actions(driver);

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement womFash=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(womFash).perform();
        Thread.sleep(3000);

        WebElement heels=driver.findElement(By.xpath("//span[text()='Heels']"));
        heels.click();
        			
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
