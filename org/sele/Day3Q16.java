package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q16 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.swiggy.com/");
	
	WebElement sign = d.findElement(By.xpath("//a[@class='r2iyh']"));
	sign.click();
	
	Thread.sleep(12000);
	
	WebElement phone = d.findElement(By.xpath("//input[@id='mobile']"));
	phone.sendKeys("9790898986");
	
	WebElement name = d.findElement(By.xpath("//input[@id='name']"));
	name.sendKeys("Kirshika");
	
	WebElement email = d.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
	email.sendKeys("pbdivyalakshmi@gmail.com");
	
	WebElement passWord = d.findElement(By.xpath("//input[@id='password']"));
	passWord.sendKeys("Kavi@123");
	
	WebElement but = d.findElement(By.className("a-ayg"));
	but.click();
}
}
