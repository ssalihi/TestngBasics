package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAndAfterMethod {

@BeforeMethod
public void beforeMethod() {
	System.out.println("boforeMethod");
}
	
@ Test
public void testMethodOne() {
	System.out.println("testMethodOne---1");
}
@Test
public void testMethodTwo() {
	System.out.println("tesMethodTwo--2");
}
@AfterMethod
public void afterMethod() {
	System.out.println("afterMethod");
}
}
