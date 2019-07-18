package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Twitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://twitter.com/login");
		
		WebElement u = d.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']"));
		u.sendKeys("8870733557");
		
		WebElement p = d.findElement(By.xpath("//input[@class='js-password-field']"));
		p.sendKeys("fxhjll");
	}

}
