package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NopCommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[contains(text(),'Electronics')]"))).build().perform();
		//driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[contains(text(),'Electronics')]")).click();
		
	}

}
