package com.class04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class taskTwo extends CommonMethods{
	@Parameters({"browser","url"})
    @BeforeMethod(alwaysRun=true)
    public void setUp(String browser,String url) {
        setUpDriver(browser,url);
    }
    @Parameters({"userName","password"})
    @Test(groups="Smoke")
    public void UsernameOne(String userName,String password) {
        //sendText(By.cssSelector("input#user-name"),userName);
    	driver.findElement(By.cssSelector("input#user-name")).sendKeys(userName);
    	driver.findElement(By.cssSelector("input#password")).sendKeys(password);
    	driver.findElement(By.cssSelector("\"input.btn_action\"")).click();
      //  sendText(findByCSS("input#password"),password);
       // click(findByCSS("input.btn_action"));
        
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='product_label']")).getText(), "Products");
    }
    @Parameters({"userName2","password2"})
    @Test(groups="Regression")
    public void UsernameTwo(String userName,String password) {
       // sendText(findByCSS("input#user-name"),userName);
        //sendText(findByCSS("input#password"),password);
       // click(findByCSS("input.btn_action"));
    	driver.findElement(By.cssSelector("input#user-name")).sendKeys(userName);
    	driver.findElement(By.cssSelector("input#password")).sendKeys(password);
    	driver.findElement(By.cssSelector("\"input.btn_action\"")).click();
        
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='product_label']")).getText(), "Products");
    }
    
    
    
    @AfterMethod (alwaysRun=true)
    public void tearDown() {
        driver.close();
    }
}
