package com.class03;

import org.testng.annotations.Test;

import Utils.CommonMethods;

public class DependsOnMethod extends CommonMethods{
	@Test
public void One() {
	
}
	@Test (dependsOnMethods="One")
public void Two() {
	
}
	@Test (dependsOnMethods="Two")
public void Three() {
	
}
}
