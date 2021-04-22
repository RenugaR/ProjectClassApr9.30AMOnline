package com.demo.testng;

import org.testng.annotations.DataProvider;

public class Day3DataProvide {

	@DataProvider(name="Res")
	public Object[][] data() {
		return new Object[][] 
				{{"Raja","234567"},{"Karthick","456789"},{"Siva","789008"}};
		
	}
	
}
