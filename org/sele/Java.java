package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		userName.sendKeys("73197888");
		
		WebElement passWord = driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
		passWord.sendKeys("Divya@123");
		
	
	}
}
