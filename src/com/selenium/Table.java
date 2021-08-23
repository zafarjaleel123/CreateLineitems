package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int a=driver.findElements(By.cssSelector("table[id='product'] tr")).size();
		System.out.println(a);
		int b=driver.findElements(By.cssSelector("table[id='product'] th")).size();
		System.out.println(b);
		List<WebElement> name=driver.findElements(By.xpath("//tr[3]/td"));
		for(WebElement rowdata:name) {
			System.out.println(rowdata.getText());
		}
		

	}

}
