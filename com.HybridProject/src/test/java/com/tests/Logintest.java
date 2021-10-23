package com.tests;

import org.testng.annotations.Test;

import com.pages.BaseClass;

public class Logintest extends BaseClass {
	@Test
	public void test() {
		pu.readProperty("browser");
	}
	
	@Test
	public void test2() {
		pu.readProperty("browser");
	}
}
