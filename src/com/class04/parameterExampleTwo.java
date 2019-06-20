package com.class04;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class parameterExampleTwo extends CommonMethods{
	@Parameters ({"browser", "url"})
	@Test
	public void testGoogle(String browser, String url) {
		setUpDriver(browser, url);
		
	}

}
