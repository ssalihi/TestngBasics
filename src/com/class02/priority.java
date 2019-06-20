package com.class02;

import org.testng.annotations.Test;

import Utils.CommonMethods;

public class priority {
@Test()// if we dont specifiy, it is automatically take index (0).
// if we have mulitple zero index priorities, the test will be executed bases on alphabatic order
public void first() {
	System.out.println("first test annotation");
}
@Test(priority=1)
public void second() {
	System.out.println("Second test annotation");
}
@Test(priority=3)
public void third() {
	System.out.println("third test annotation");
}
@Test(priority=4)
public void fourth() {
	System.out.println("fourth test annotation");
}
}
