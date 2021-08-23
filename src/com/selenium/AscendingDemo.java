package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AscendingDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");

	driver =new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	System.out.println(driver.getTitle());

	driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();

	Thread.sleep(1000);

	System.out.println("Top Deals Size:"+driver.findElements(By.xpath("//tr//td")).size());
	 
	List<WebElement> list=driver.findElements(By.xpath("//tr//td"));
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		
		
	}

	}
}
