package com.demo.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Day2 {

	WebDriver driver;

	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}

	@BeforeClass
	private void beforeClass1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}

	@AfterClass
	private void afterClass() {
		driver.close();
	}

	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority = -2)
	private void test3() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Heloo");
		SoftAssert s = new SoftAssert();
		s.assertEquals(txtUserName.getAttribute("value"), "Hello");
		System.out.println("Assert failed");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("3456789");
		s.assertEquals(txtPass.getAttribute("value"), "3456789");
		s.assertAll();
	}

	@Test(priority = 2)
	private void test2() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("login"), "User not navigated to failure page");
	}

}
