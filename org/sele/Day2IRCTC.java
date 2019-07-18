package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2IRCTC {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.irctc.co.in/");
	
	WebElement f = d.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
    f.sendKeys("Madurai EAST-MES");
    
    WebElement t = d.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
    t.sendKeys("CHENNAI EGMORE-MS");
    
    WebElement date = d.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input"));
    date.sendKeys("05-08-2019");
    
    
}
}
