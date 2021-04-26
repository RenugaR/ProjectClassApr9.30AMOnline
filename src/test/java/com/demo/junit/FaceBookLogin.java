package com.demo.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ProjectClass9.30AM\\ProjectClassApr9.30AMOnline\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("abcd");
		String attribute = txtEmail.getAttribute("id");
		System.out.println(attribute);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
