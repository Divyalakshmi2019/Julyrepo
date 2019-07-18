package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement userName=d.findElement(By.xpath("(//input[@class='inputtext'])[1]"));
		userName.sendKeys("9790898986");
		Thread.sleep(2000);
		WebElement passWord=d.findElement(By.xpath("//input[@name='pass']"));
		passWord.sendKeys("Divya@123");
		
		WebElement b = d.findElement(By.xpath("//label[@id='loginbutton']"));
		b.click();
		
	}

}
