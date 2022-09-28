package com.facebook.qa.test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.LoginPage;
import com.facebook.qa.pages.SignUpPage;
import com.facebook.qa.util.TestUtil;
public class SignUpPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
    TestUtil testUtil;
	SignUpPage signUpPage;
	
	String sheetName = "signupPage";

	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		signUpPage = new SignUpPage();
		homePage = new HomePage();
		//testUtil.switchToFrame();
		
		
	}
	
	@Test(priority=1)
	public void createNewAccountTest() {
		signUpPage.createNewAccount().signup(prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("email"),
				prop.getProperty("confirmation_email"), prop.getProperty("password"), 
				prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"),
				prop.getProperty("gender"));
	}
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

}
