package com.class03;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class Task1 extends CommonMethods {
@BeforeMethod
public void setUp() {
	setUpDriver("chrome", "https://www.saucedemo.com/");
	
}
@Test (groups="Smoke")
public void userOne() throws InterruptedException {
	sendText(driver.findElement(By.xpath("//input[@type='text']")), "standard_user");
	sendText(driver.findElement(By.xpath("//input[@type='password']")), "secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
}
@Test (groups="Regression1")
public void userTwo() {
	sendText(driver.findElement(By.xpath("//input[@type='text']")), "problem_user");
	sendText(driver.findElement(By.xpath("//input[@type='password']")), "secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
@Test (groups="Regression2")
public void userThree() {
	sendText(driver.findElement(By.xpath("//input[@type='text']")), "performance_glitch_user");
	sendText(driver.findElement(By.xpath("//input[@type='password']")), "secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
@AfterMethod
public void tearDown() {
	driver.close();
}


}
