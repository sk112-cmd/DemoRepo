package com.fb.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.base.TestBase;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook - लॉग इन या साइन अप करें");
	}

	@Test(priority = 2)
	public void fbLogoTest() {	
		boolean flag = loginPage.validateFbImage();
//		Assert.assertEquals(loginImage, true); // either this way or
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void login() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
