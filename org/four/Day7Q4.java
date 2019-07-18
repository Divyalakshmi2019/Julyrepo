package org.four;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Q4 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse\\\\Divyalakshmi\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	
	WebElement scrollDown = d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	
	Thread.sleep(2000);
	
	JavascriptExecutor jk=(JavascriptExecutor)d;
	
	jk.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	
	TakesScreenshot tk=(TakesScreenshot)d;
	
	File s=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("E:\\Overall.png");
	FileUtils.copyFile(s, des);
	
	
}
}
