package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Q9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	
	//driver.switchTo().frame("iframetop");
	
	WebElement userId = driver.findElement(By.xpath("//input[@title='User Id']"));
	userId.sendKeys("73197888");
	
	WebElement passWord = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
    passWord.sendKeys("Divya@123");	
}
}
