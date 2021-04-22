package com.demo.testng;

import org.testng.annotations.Test;

public class Sample {

	@Test(dataProvider = "Res", dataProviderClass = Day3DataProvide.class)
	private void login(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
}
