package org.sele;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q8 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.sprint.com/");
	
	WebElement b=d.findElement(By.className("close"));
	b.click();
	
	//Thread.sleep(3000);
	
	//WebElement c1 = d.findElement(By.xpath("//a[text()='COURSES']"));
	
	//Actions co=new Actions(d);
	//co.moveToElement(c1).perform();
	
	//WebElement or = d.findElement(By.xpath("//span[text()='Oracle Training']"));
	//co.moveToElement(or).perform();
	
	//WebElement s = d.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
	//s.click();
	
	
	
	//WebElement or = d.findElement(By.xpath("//span[text()='Data Warehousing Training']"));
	//co.moveToElement(or).perform();
	
	//WebElement s = d.findElement(By.xpath("//span[text()='Microstrategy Training']"));
	//s.click();
	
	WebElement s = d.findElement(By.xpath("//span[text()='My Sprint']"));
	Actions acc=new Actions(d);
	acc.moveToElement(s).perform();
	
	WebElement q = d.findElement(By.xpath("//a[text()='_self']"));
	q.click();
}
}
