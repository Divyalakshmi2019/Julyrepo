package org.four;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement space = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	space.sendKeys("Earphone");
	
	WebElement searchIcon = driver.findElement(By.xpath("//span[text()='Search']"));
	searchIcon.click();
	
	WebElement earPhone = driver.findElement(By.xpath("//p[text()='boAt Bassheads 100 In Ear Wired Earphones With Mic (Black) Handsfree']"));
    earPhone.click();
    
    String par = driver.getWindowHandle();
    
    Set<String> all = driver.getWindowHandles();
    
    System.out.println(par+"\n"+all);
    
    for(String x:all) {
    	if(!x.equals(par)) {
    		driver.switchTo().window(x);
    	}
    }

WebElement addCart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
addCart.click();
}
}