package org.four;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Q3 {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Divyalakshmi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		
		Thread.sleep(2000);

		
		WebElement down = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		
		WebElement up = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		jk.executeScript("arguments[0].scrollTntoView(true)", down);
		
		
		jk.executeScript("arguments[0].scrollTntoView(false)", up);
		

	}
}
