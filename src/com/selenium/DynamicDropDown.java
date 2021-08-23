package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptop ");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.DOWN);
		String name=driver.findElement(By.cssSelector("#twotabsearchtextbox")).getAttribute("value");
		System.out.println(name);
		//laptop table for bed foldable
		while(!name.equalsIgnoreCase("laptop table for bed foldable")) {
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.DOWN);
			name=driver.findElement(By.cssSelector("#twotabsearchtextbox")).getAttribute("value");
		}
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
	}

}
