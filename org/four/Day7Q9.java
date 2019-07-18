package org.four;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7Q9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		
//		WebElement search = d.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("iphone");
//		
//		WebElement a = d.findElement(By.className("_2AkmmA _29YdH8"));
//		a.clear();
//		Alert al=d.switchTo().alert();
//		al.dismiss();
//		
//		WebElement btn = d.findElement(By.xpath("//button[@type='submit']"));
//		btn.click();
		
//		WebElement s1 = d.findElement(By.xpath("(//*[text()='Electronics'][1])"));
//		Actions acc=new Actions(d);
//		acc.moveToElement(s1).perform();
//		Thread.sleep(2000);
		
		
//		
//	    WebElement s2 = d.findElement(By.xpath("(//*[text()='Mobiles & Accessories'][1])"));
//	    s2.click();
	    
	    //WebElement cat = d.findElement(By.xpath("//span[text()='Category']"));
	    //cat.click();
	    
	   java.util.List<WebElement> ca1 = d.findElements(By.xpath("//span[text()='Category']"));
	    
        Actions acc=new Actions(d);
		acc.moveToElement(ca1).perform();
		
		d.fi
		
		
		d.findElement("//span[text()='Mobiles, Computers']");
		
		//acc.moveToElement(target)
		Thread.sleep(2000);
		
		//d.findElement(By.xpath))
		
	    
	}

}
