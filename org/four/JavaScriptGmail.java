package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptGmail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	WebElement email = d.findElement(By.xpath("//input[@id='identifierId']"));
	
	JavascriptExecutor jk=(JavascriptExecutor)d;
	
	jk.executeScript("arguments[0].setAttribute('value','pbdivyalakshmi@gmail.com')", email);
	
	Thread.sleep(2000);
	
	WebElement btn1 = d.findElement(By.xpath("//span[text()='Next']"));
	
	jk.executeScript("arguments[0].click()", btn1);
	
	Thread.sleep(2000);
	
	WebElement q = d.findElement(By.xpath("//input[@name='password']"));
	
	
	jk.executeScript("arguments[0].setAttribute('value','Divya@2428')", q);
	
	WebElement btn2 = d.findElement(By.xpath("//div[@id='passwordNext']"));
	
	jk.executeScript("arguments[0].click()", btn2);
}
}
