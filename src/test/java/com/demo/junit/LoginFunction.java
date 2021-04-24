package com.demo.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\New java files\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.name("username"));
		findElement.sendKeys("hai");
		WebElement findElements = driver.findElement(By.id("password"));
		findElements.sendKeys("Hello");
}
}