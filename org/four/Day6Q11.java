package org.four;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Day6Q11 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.swiggy.com/chennai/login-besant-nagar-adyar");
	
	WebElement signIn = d.findElement(By.xpath("//span[text()='Sign In']"));
	signIn.click();
	
	WebElement mob = d.findElement(By.xpath("//a[text()='create an account']"));
	mob.click();
	
	WebElement m = d.findElement(By.id("mobile"));
	m.sendKeys("9790898986");
	
	Actions acc=new Actions(d);
	acc.doubleClick(m).perform();
	
	//WebElement log = d.findElement(By.xpath("//a[@class='a-ayg']"));
	//log.click();
	
	Thread.sleep(2000);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);
	//r.keyPress(KeyEvent.VK_ENTER);
	//r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	WebElement t = d.findElement(By.xpath("//input[@id='password']"));
	t.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	

}
}
