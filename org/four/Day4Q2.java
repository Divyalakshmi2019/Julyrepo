package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/index.html");
	
//	WebElement paraThree = d.findElement(By.xpath("//p[contains(text(),'Our')] "));
//	String t = paraThree.getText();
//	System.out.println(t);
	
	// For testing
	
//	WebElement testimonials = d.findElement(By.xpath("//h2[contains(text(),'fees')]"));
//	String q = testimonials.getText();
//	System.out.println(q);
	
//	WebElement a = d.findElement(By.xpath("(//span[@class='testimonial-content'][1])"));
//	String u = a.getText();
//	System.out.println(u);
	
	WebElement s = d.findElement(By.xpath("(//div[@class='trainer-info'][2])"));
	String z = s.getText();
	System.out.println(z);
}
}
