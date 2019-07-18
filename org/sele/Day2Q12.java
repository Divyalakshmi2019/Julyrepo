package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Q12 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://www.adactin.com/HotelApp/");
	
	WebElement userName = d.findElement(By.xpath("//input[@id='username']"));
	userName.sendKeys("73197888");
	
	WebElement passWord = d.findElement(By.xpath("//input[@id='password']"));
	passWord.sendKeys("Divya@123");
}
}
