package com.fb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory- OR:-- Object Repository

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "pass")
	WebElement pass;

	@FindBy(xpath = "//button[@name='login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[@id='u_0_2_I+']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
	WebElement fbLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this); // this- defining the current class object i.e.,- LoginPage.class
	}

	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateFbImage() {
		return fbLogo.isDisplayed();
	}

	public HomePage login(String mail, String pwd) {
		email.sendKeys(mail);
		pass.sendKeys(pwd);
		loginBtn.click();
		
	return new HomePage();
	}

}
