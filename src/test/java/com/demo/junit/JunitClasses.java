package com.demo.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitClasses {

	@Test
	public void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Ignore
	@Test
	public void test4() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
}
