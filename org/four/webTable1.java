package org.four;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://toolsqa.com/automation-practice-table/");
	List<WebElement> table = d.findElements(By.tagName("tr"));
	for(WebElement X:table)
	{
		String a = X.getText();
		System.out.println(a);
	}
	List<WebElement> t = d.findElements(By.tagName("table"));
	for(WebElement y:t)
	{
		String b = y.getText();
		System.out.println(b);
	}
	List<WebElement> data = d.findElements(By.tagName("td"));
	for(WebElement z:data)
	{
		String c = z.getText();
		System.out.println(c);
	}
	List<WebElement> parti2 = d.findElements(By.xpath("(//tr[@class='odd'][1])"));
	for(WebElement o:parti2)
	{
		System.out.println(o.getText());
	}
	List<WebElement> rankChina = d.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr[4]/td[5]"));
	for(WebElement i:rankChina)
	{
		System.out.println(i.getText());
	}
}
}
