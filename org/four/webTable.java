package org.four;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse\\\\Divyalakshmi\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-table");
		List<WebElement> head = d.findElements(By.tagName("tr"));
		for(WebElement x:head) {
			String s=x.getText();
				//System.out.println(x.getText());
		
		
		System.out.println(s);
			if(s.equals("Mecca"))
					{
				System.out.println("s");
					}
			
		}
		System.out.println(head.size());
		
		List<WebElement> row = d.findElements(By.xpath("(//tr[@class='odd'][1])"));
		for(WebElement y:row) {
			System.out.println(y.getText());
			
		}
		
		
		
				
			
		
		
		
		
	}

}
