package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/");
		int a=driver.findElements(By.tagName("a")).size();
		System.out.println(a);
		WebElement footerLink=driver.findElement(By.cssSelector("div[class='footer-upper']"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());
		int numeroflink=driver.findElements(By.xpath("//div[@class='footer-upper']//div//div[1]//ul//li/a")).size();
		for(int i=0;i<numeroflink;i++) {
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
					driver.findElements(By.xpath("//div[@class='footer-upper']//div//div[1]//ul//li/a")).get(i).sendKeys(clickonlink);	
					Thread.sleep(5000);			
		}
		Set<String>  abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());			
		}

	}

}
