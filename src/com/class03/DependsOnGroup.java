package com.class03;

import org.testng.annotations.Test;

import Utils.CommonMethods;

public class DependsOnGroup extends CommonMethods{
	@Test (groups="Smoke1")
public void One() {
	System.out.println("test one");
}
	@Test (groups="Smoke2", dependsOnGroups="Smoke1")
public void Two() {
		System.out.println("test one");
	
}
	@Test (groups="Smoke3", dependsOnGroups="Smoke2")
public void Three() {
		System.out.println("test one");
	
}
}
