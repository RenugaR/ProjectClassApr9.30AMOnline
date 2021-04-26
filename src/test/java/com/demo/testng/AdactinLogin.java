package com.demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
			WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("aashikmd");
			String val = user.getAttribute("value");
			System.out.println(val);
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("1234567");
			String val2 = pass.getAttribute("value");
			System.out.println(val2);
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("1234567");
			String val2 = pass.getAttribute("value");
			System.out.println(val2);
	}

}
