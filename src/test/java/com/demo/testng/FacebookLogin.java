package com.demo.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja ram Aruchamy\\eclipse-workspace\\FirstMaven\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("Rajaram");
		
		WebElement txtpass=  driver.findElement(By.id("pass"));
		txtpass.sendKeys("12345");
		
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
		
	}

}
