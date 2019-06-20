package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class TestCase1 extends CommonMethods {
/*TC 1: OrangeHRM Title Validation

TC 2: OrangeHRM Successful Login 
https://opensource-demo.orangehrmlive.com/
Please make sure to use the following:
 annotations:
	@BeforeMethod
	@AfterMethod
	@Test

What would you do if you do not want to execute any specific test case?
What would you do if you want to execute any specific test case first?
 * 
 */
	@BeforeMethod
	public void valid() {
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
	}
		@Test
		public void validation(){
			
		
		boolean validationTitle=driver.findElement(By.xpath("https://opensource-demo.orangehrmlive.com/")).isDisplayed();
		if (validationTitle=true) {
			System.out.println("The title is correct");
		}else {
			System.out.println("the title is not correct");
		}
		}
	
	@Test
	public void login() {
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
	}
	@AfterMethod
	public void closePage() {
		
	}
}
