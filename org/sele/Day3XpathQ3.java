package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3XpathQ3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.cleartrip.com/trains");
		
		WebElement c = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	    c.sendKeys("Chennai Beach(MSB)");
	    
	    WebElement t = d.findElement(By.xpath("//input[@name='to_station']"));
	    t.sendKeys("Bangalore Cant(BNC)");
	    
	    WebElement s = d.findElement(By.xpath("//select[@name='train[class]']"));
	    s.sendKeys("Sleeper");
	    
	    WebElement date = d.findElement(By.xpath("(//input[@type='text'])[3]"));
	    date.sendKeys("5/8/2019");
	    
	    WebElement adult = d.findElement(By.xpath("//select[@name='adults']"));
	    adult.sendKeys("3");
	    
	    WebElement children = d.findElement(By.xpath("//select[@id='train_children']"));
	    children.sendKeys("2");
	    
	    WebElement seniormen = d.findElement(By.xpath("(//select[@class='span span24'])[3]"));
	    seniormen.sendKeys("1");
	    
	    WebElement seniorwomen = d.findElement(By.xpath("//select[@id='train_female_seniors']"));
	    seniorwomen.sendKeys("5");
	    
	    WebElement sub = d.findElement(By.xpath("//button[@type='submit']"));
	    sub.click();
	}

}
