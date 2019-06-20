package com.class02;

import org.testng.annotations.Test;

public class EnableAndDisable {
	@Test(enabled=false)// if we dont specifiy, it is automatically take index (0).
	// if we have mulitple zero index priorities, the test will be executed bases on alphabatic order
	public void first() {
		System.out.println("first test annotation");
	}
	@Test(enabled=true,priority=1)
	public void second() {
		System.out.println("Second test annotation");
	}
	@Test(enabled=false)// this ideally we disabling the test annotation 
	public void third() {
		System.out.println("third test annotation");
	}
	@Test(enabled=true,priority=2)
	public void fourth() {
		System.out.println("fourth test annotation");
	}
}
