package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	
	WebElement button=d.findElement(By.xpath("//a[@href='contact.php']"));
	button.click();
			
	WebElement name = d.findElement(By.xpath("//input[@name='name']"));
	name.sendKeys("Kirshika");
	
	WebElement email=d.findElement(By.xpath("(//input[@type='email'])[1]"));
	email.sendKeys("pbdivyalakshmi@gmail.com");
	
	WebElement mobileno=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	mobileno.sendKeys("8870733557");
	
	WebElement course=d.findElement(By.xpath("(//select[@name='courses'])[1]"));
	course.sendKeys("Selenium");	
	
	WebElement branch=d.findElement(By.xpath("(//select[@name='branch'])[1]"));
	branch.sendKeys("OMR");
	
	WebElement training=d.findElement(By.xpath("(//select[@class='form-control'])[3]"));
	training.sendKeys("Immediately");
	
	WebElement message=d.findElement(By.xpath("//textarea[@name='comments']"));
	message.sendKeys("Willing to join");
	

}
}

