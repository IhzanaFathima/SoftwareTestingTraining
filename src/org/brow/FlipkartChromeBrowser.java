package org.brow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page Url  : " + pageUrl);

		driver.close();
		driver.quit();
	}
}
