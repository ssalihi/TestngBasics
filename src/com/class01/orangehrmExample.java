package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class orangehrmExample extends CommonMethods {
@BeforeMethod
public void setUp() {
	setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
}
@Test
public void login() throws InterruptedException {
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#btnLogin")).click();
}
@AfterMethod
public void closeMethod() {
	driver.close();
	
}
}
