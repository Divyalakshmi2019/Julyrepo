package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q1 { 
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://demo.guru99.com/test/drag_drop.html");
	
	WebElement a1 = d.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	
	WebElement a2 = d.findElement(By.id("amt7"));
	
	Actions deb=new Actions(d);
	deb.dragAndDrop(a1, a2).perform();
	
	WebElement d1 = d.findElement(By.id("credit2"));
	
	WebElement d2 = d.findElement(By.id("bank"));
	deb.dragAndDrop(d1, d2).perform();
	
	WebElement c1 = d.findElement(By.id("credit1"));
	
	WebElement c2 = d.findElement(By.id("loan"));
	deb.dragAndDrop(c1, c2).perform();
	
	WebElement ac=d.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	
	WebElement ac1 = d.findElement(By.id("amt8"));
	deb.dragAndDrop(ac, ac1).perform();
	
	WebElement p = d.findElement(By.xpath("//a[text()='Perfect!']"));
	String t = p.getText();
	System.out.println(t);
	}
}
