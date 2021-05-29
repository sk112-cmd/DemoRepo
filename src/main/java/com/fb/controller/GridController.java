package com.fb.controller;

import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridController {

public static void main(String []args) {
	
	System.getProperty("webdriver.chrome.driver","chromedriver.exe");
	System.getProperty("webdriver.gecko.driver","geckodriver.exe");
	
DesiredCapabilities obj= new DesiredCapabilities();
	obj.setBrowserName("chrome");
	obj.setPlatform(Platform.WIN10);
	
	String sURL= "http://192.168.1.100:4444/wd/hub";
	Driver driver= new RemoteWebDriver(new URL(sURL,obj));

}
}
