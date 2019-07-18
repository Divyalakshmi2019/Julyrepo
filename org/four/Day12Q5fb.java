package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Q5fb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	Thread.sleep(2000);
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	
	WebElement t1 = d.findElement(By.id("email"));
	
	WebElement t2 = d.findElement(By.id("pass"));
	
	WebElement b1 = d.findElement(By.xpath("//input[@value='Log In']"));
	
	JavascriptExecutor jk=(JavascriptExecutor)d;
	
	jk.executeScript("arguments[1].setAttribute('value','Divya@123')",t1,t2);
	
	jk.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", t1);
	
//	Object obj=jk.executeScript("return arguments[0].getAttribute('value')", t1);
//	
//	String txt=(String)obj;
//	
//	System.out.println(txt);
	
	jk.executeScript("arguments[0].click()", b1);
		
}
}
