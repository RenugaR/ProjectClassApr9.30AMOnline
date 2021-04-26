package com.demo.testng;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	 WebDriver driver;

	@BeforeClass
	private  void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\MavenSample\\Driver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(6000);
	}

	@AfterClass
	private void afterclass() {
		driver.close();
	}

	@BeforeMethod
	private void before() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void after() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	private void test1() {
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	}
	@Test
	private void test2() {
		driver.findElement(By.id("ap_email")).sendKeys("47584949");
		
	}

	@Test
	private void test3() {
		driver.findElement(By.id("continue")).click();
	}
}


