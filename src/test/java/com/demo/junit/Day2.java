package com.demo.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		boolean b = currentUrl.contains("facebook");
		Assert.assertTrue("Current url not matched", b);
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
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Heloo");
		Assert.assertEquals("Username value is not matched", "Heloo", txtUserName.getAttribute("value"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("3456789");
		Assert.assertEquals("password value is not matched", "3456789", txtPass.getAttribute("value"));
	}

	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		Assert.assertTrue("Current url not matched", driver.getCurrentUrl().contains("login"));
	}
}
