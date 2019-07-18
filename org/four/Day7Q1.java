package org.four;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Q1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File s=tk.getScreenshotAs(OutputType.FILE);
	File d=new File("E:/greens.png");
	FileUtils.copyFile(s,d);
	

	
	
	
}
}
