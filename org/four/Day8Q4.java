package org.four;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Q4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse\\\\Divyalakshmi\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp#");
	
	
	
	WebElement p = d.findElement(By.id("fldPassword"));
	p.sendKeys("12345678");
	
	WebElement signIn = d.findElement(By.xpath("//input[@type='submit']"));
	signIn.click();
	
	Alert k = d.switchTo().alert();
	Thread.sleep(2000);
	//String a = k.getText();
	System.out.println(k.getText());
	k.accept();
}
}
