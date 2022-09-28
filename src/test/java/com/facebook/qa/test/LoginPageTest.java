package com.facebook.qa.test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.LoginPage;
import com.facebook.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
    TestUtil testUtil;

	String sheetName = "loginPage";
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test (priority=1)
	public void LoginPageTitle() {
		String title = loginPage.validatLoginPageTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test (priority=2)
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
