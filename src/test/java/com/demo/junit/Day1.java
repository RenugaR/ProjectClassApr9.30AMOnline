package com.demo.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void test1() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Heloo");
		driver.findElement(By.id("pass")).sendKeys("3456789");
	}

	@Test
	public void test2() {
		driver.findElement(By.name("login")).click();
	}
}
