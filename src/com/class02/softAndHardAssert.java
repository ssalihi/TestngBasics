package com.class02;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class softAndHardAssert {
	@Test 
	public void soft() {
		SoftAssert soft=new SoftAssert();
		System.out.println("Bofore soft assert");
		soft.assertTrue(false);
		System.out.println("After soft assert");
		soft.assertAll();
	}
	@Test
	public void hard() {
		System.out.println("Before hard assert");
		Assert.assertTrue(false);
		System.out.println("After hard assert");
	}

}
