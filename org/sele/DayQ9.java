package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayQ9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	
	WebElement flip = d.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
	flip.click();
	
	WebElement email = d.findElement(By.xpath("(//input[@type='text'])[2]"));
	email.sendKeys("abc@gmail.com");
	
	WebElement pw = d.findElement(By.xpath("//input[@type='password']"));
	pw.sendKeys("Divya@123");
}
}
