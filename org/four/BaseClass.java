package org.four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
public static WebDriver launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	driver=new ChromeDriver;
	
	
}
}
