package org.four;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4Q7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.shopclues.com/wholesale.html");
	
//	WebElement a = d.findElement(By.id("email"));
//	a.sendKeys("pbdivyalakshmi@gmail.com");
//	
//	String x = a.getAttribute("value");
//	System.out.println(x);
//	
//	String x1 = a.getAttribute("type");
//	System.out.println(x1);
	
	WebElement q = d.findElement(By.xpath("//input[@id='autocomplete']"));
	q.sendKeys("fast track women watch");
	
	WebElement searchIcon = d.findElement(By.xpath("//a[text()='Search']"));
	searchIcon.click();
	
	WebElement fastrack = d.findElement(By.xpath("//h2[text()='Fastrack Quartz Black Oval Women Watch 6015SM02']"));
	fastrack.click();
	
	//String parWindow = d.getWindowHandle();
	
	Set<String> all = d.getWindowHandles();
	
	System.out.println("\n"+all);
	
	for(String x:all) {
		if(!x.equals(all)) {
			d.switchTo().window(x);
		}
	}
	
	WebElement z = d.findElement(By.xpath("//button[text()='Add To Cart']"));
	z.click();
	
	
	

	
}
}
