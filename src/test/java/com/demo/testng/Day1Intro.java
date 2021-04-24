package com.demo.testng;

import org.testng.annotations.*;

public class Day1Intro {

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeSuite
	private void beforeSuite1() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	private void afterSuite() {
		System.out.println("AfterSuite");
	}

	@BeforeTest
	private void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	private void afterTest() {
		System.out.println("AfterTest");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
	}

	@BeforeGroups
	private void beforeGroup() {
		System.out.println("BeforeGroup");
	}

	@AfterGroups
	private void afterGroup() {
		System.out.println("AfterGroup");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod");
	}

	@Test
	private void test1() {
		System.out.println("Test1");
	}

	@Test
	private void test2() {
		System.out.println("Test2");
	}

}
