package com.demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductClick {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium1\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement BtnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		BtnClose.click();
		
		Thread.sleep(5000);
		WebElement search= driver.findElement(By.name("q"));
	    search.sendKeys("samsung mobiles");
	    
	    Thread.sleep(5000);
	    WebElement Btnsearch= driver.findElement(By.className("_34RNph"));
	    Btnsearch.click();
	    
	    Thread.sleep(10000);
	    WebElement Product= driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	    Product.click();
}
}
