package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	WebElement sign = d.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']"));
	sign.click();
	
	WebElement mobile = d.findElement(By.xpath("//input[@type='email']"));
	mobile.sendKeys("pbdivyalakshmi@gmail.com");
	
	WebElement ac = d.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	ac.click();
	
	WebElement name = d.findElement(By.xpath("//input[@name='customerName']"));
	name.sendKeys("Divya");
	
	WebElement mo = d.findElement(By.xpath("//input[@type='tel']"));
	mo.sendKeys("9790898986");
	
	//WebElement email = d.findElement(By.xpath("//input[@id='ap_email']"));
	//email.sendKeys("abc@gmail.com");
	
	WebElement pw = d.findElement(By.xpath("//input[@name='password']"));
	pw.sendKeys("Divya@2428");
	
	WebElement cont = d.findElement(By.xpath("//input[@class='a-button-input']"));
	cont.click();
	
	WebElement otp = d.findElement(By.xpath("//input[@name='code']"));
	otp.sendKeys("235038");
	
	WebElement a = d.findElement(By.xpath("//input[@id='auth-verify-button']"));
	a.click();
}
}
