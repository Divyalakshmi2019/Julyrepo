package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Myntra {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	
	WebElement u = d.findElement(By.xpath("//input[@type='email']"));
	u.sendKeys("pbdivyalakshmi@gmail.com");
	
	WebElement pass = d.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("Divya@123");
	
	WebElement mobile = d.findElement(By.xpath("//input[@name='mobile']"));
	mobile.sendKeys("9790898986");
	
	WebElement f = d.findElement(By.xpath("//input[@id='female']"));
	f.click();
	
	WebElement reg = d.findElement(By.xpath("//button[@class='register-register-button']"));
	reg.click();
}
}
