package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	//WebDriver d=new ChromeDriver();
	//d.get("http://greenstech.in/selenium-course-content.html");
	
	//WebElement cts = d.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
	//cts.click();
	
	WebDriver r=new ChromeDriver();
	r.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement core =r.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
	core.click();
}
}
