package org.repo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		
		
		WebElement q = d.findElement(By.xpath("//input[@id='autocomplete']"));
		q.sendKeys("fast track women watch");
		
		WebElement searchIcon = d.findElement(By.xpath("//a[text()='Search']"));
		searchIcon.click();
		
		WebElement fastrack = d.findElement(By.xpath("//h2[text()='Fastrack Quartz Black Oval Women Watch 6015SM02']"));
		fastrack.click();
		
		String parWindow = d.getWindowHandle();
		
		Set<String> all = d.getWindowHandles();
		
		//System.out.println("\n"+all);
		
		for(String x:all) {
			if(!x.equals(parWindow)) {
				d.switchTo().window(x);
			}
		}
		
		WebElement z = d.findElement(By.xpath("//button[text()='Add To Cart']"));
		z.click();	
	}
	}

