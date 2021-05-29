package com.fb.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.base.TestBase;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
	homePage= loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyCurrentURLTest() {
		System.out.println(homePage.getCurrentURL());
	}
	
	@Test
	public void verifyProfileNameTest() {
		boolean flag = homePage.profileName();		
		Assert.assertTrue(flag);
	}
	
	@Test
	public void verifyProfileViewTest() {
	homePage.profileView();
	System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
