package com.demo.testng;

	import java.util.Date;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class LocationSearch {
		WebDriver driver;
		@BeforeClass
		private void beforeClass() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\anbu sony\\Pictures\\Land Details\\Selenium Courses\\FeatureBranch\\ProjectClassApr9.30AMOnline\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cleartrip.com/trains");
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
		@Test
		private void test1() {
			WebElement txtFrom = driver.findElement(By.xpath("//*[@id=\"from_station\"]"));
			txtFrom.sendKeys("Madurai");
			System.out.println("Test 1 Passed");
		}
		
		@Test
		private void test2() {
			WebElement txtTo =driver.findElement(By.id("to_station"));
			txtTo.sendKeys("Chennai");
			System.out.println("Test 2 Passed");
		}
		@Test
		private void test3() {
			WebElement btnSubmit =driver.findElement(By.id("trainFormButton"));
			btnSubmit.click();
			System.out.println("Test 3 Clicked");
		}

}

