package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com/oracle-training.html");
	
//    String greens=d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']")).getText();
//	System.out.println(greens);
	
//	WebElement txt = d.findElement(By.xpath("//h2[contains(text(),'Overall')]"));
//	String t = txt.getText();
//	System.out.println(t);
	
    WebElement w = d.findElement(By.xpath("//p[contains(text(),'Awarded')]"));
    String q = w.getText();
    System.out.println(q);
	
    WebElement a=d.findElement(By.xpath("//p[contains(text(),'Rated')]"));
	String g = a.getText();
	System.out.println(g);
}
}
