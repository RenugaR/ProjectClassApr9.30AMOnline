package com.demo.testng;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Fb {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\SeleniumOne\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}

	@AfterClass
	public static void afterclass() {
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
		driver.findElement(By.xpath("//*[@id='email']"));
		driver.findElement(By.id("pass")).sendKeys("1234");
	}

	@Test
	public void test2() {
		driver.findElement(By.name("login")).click();
	}
}
