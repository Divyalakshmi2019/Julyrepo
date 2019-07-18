package org.four;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Q8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.switchTo().frame("login_page");
	
	WebElement userId=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	userId.sendKeys("71430658");
	
	WebElement cont = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	cont.click();
	
	WebElement passWord = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	passWord.sendKeys("Divya@2428");
	
	driver.switchTo().defaultContent();
	
	//to get the particular frames like frame1,frame2
	
	List<WebElement> fra = driver.findElements(By.tagName("frameset"));
	System.out.println(fra.size());
	//driver.switchTo().frame(1);
}
}
