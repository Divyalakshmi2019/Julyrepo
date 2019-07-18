package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Snapdeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	WebElement w1 = d.findElement(By.xpath("//span[text()='Sign In']"));
	w1.click();
	WebElement w2 = d.findElement(By.xpath("(//span[text()='Register'])[1]"));
	w2.click();
	
	Thread.sleep(2000);
	
	WebElement b=d.findElement(By.xpath("//div[@id='close-pop']"));
    b.click();
	//WebElement w3 = d.findElement(By.name("username"));
	//w3.sendKeys("12345678");
	
}
}
