package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12scrollpgm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement sign = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	
	WebElement create = driver.findElement(By.xpath("//span[text()='Create an account']"));
	
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	
	jk.executeScript("arguments[0].scrollIntoView(true)", sign);
	
	Thread.sleep(2000);
	
	jk.executeScript("arguments[0].scrollIntoView(false)", create);

	
}
}
