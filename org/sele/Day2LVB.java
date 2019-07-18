package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2LVB {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	
	Thread.sleep(3000);
	WebElement userName = d.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("73197888");
	
	WebElement passWord=d.findElement(By.xpath("(//input[@type='password'])[2]"));
	passWord.sendKeys("Divya@123");
}
}
