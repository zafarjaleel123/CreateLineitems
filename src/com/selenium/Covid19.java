package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Covid19 {

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		ChromeOptions c=new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium required\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.covid19india.org/");
		driver.findElement(By.cssSelector(".table.fadeInUp .sticky.state-heading")).click();
		driver.findElement(By.cssSelector(".table.fadeInUp .sticky.state-heading")).click();
		Thread.sleep(1000);
		List<WebElement> statelist=driver.findElements(By.cssSelector(".table.fadeInUp .state .table__title-wrapper "));
		System.out.println(statelist.size());
		int count=0;
		ArrayList<Integer> countlist=new ArrayList<>();
		List<WebElement> confirmlist=driver.findElements(By.cssSelector(".table.fadeInUp .state td:nth-child(2) .table__count-text"));
		for(int i=0;i<confirmlist.size()-1;i++) {
			String value=confirmlist.get(i).getText();
			System.out.println(value);
			int intergerValue=Integer.parseInt(value);
			countlist.add(intergerValue);
			//System.out.println(intergerValue);
			count=count+intergerValue;
		}
		Collections.sort(countlist);
		System.out.println(countlist);
		//System.out.println(driver.findElement(By.cssSelector(".state.is-total td:nth-child(2) .table__count-text")).getText());
		System.out.println(count);
		ArrayList<String> orignalState=new ArrayList<String>();
		for(int i=0;i<statelist.size()-1;i++) {
			
			orignalState.add(statelist.get(i).getText());
		}
		System.out.println(orignalState);
		ArrayList<String> tempState=new ArrayList<String>(orignalState);
		Collections.sort(tempState);
		
		System.out.println(tempState);
		

	}

}
