package com.fb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.base.TestBase;

public class HomePage  extends TestBase{

	
	@FindBy(xpath="//span[text()= 'Sahil']")
	WebElement profileName;
	
	@FindBy(xpath="//a[@aria-label='Sahil']")
	WebElement profile;

// Initialization of Page Objects:

	public HomePage() {
		PageFactory.initElements(new FirefoxDriver(), this);
	}

public String getCurrentURL() {
	return driver.getCurrentUrl();
	}

public boolean profileName() {
	return profileName.isDisplayed();
}

public ProfilePage profileView() {
	profile.click();
	
	return new ProfilePage();  
}
}
