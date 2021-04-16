package com.arpit.seleniumPrograms;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.ConnectionType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateInternetConnection {
	WebDriver driver;
	DevTools devtools;
	
	@BeforeMethod
	public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			devtools= ((ChromiumDriver) driver).getDevTools();
	}
	
	@Test
	public void enableSlowNetwork() {
		devtools.createSession();
		devtools.send(Network.enable(
				Optional.empty(), 
				Optional.empty(),
				Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(
				false, 
				150,
				2500, 
				2000, 
				Optional.of(ConnectionType.CELLULAR3G)));
		driver.navigate().to("http://www.linked.com");
		System.out.println("Slow" + driver.getTitle());
		
	}
	
	@Test
	public void accessLinkedIn() {
		driver.navigate().to("http://www.linked.com");
		System.out.println("Fast" + driver.getTitle());
	}
	
	@AfterClass
	public void closeBrowsers() {
		driver.quit();
	}
	
}
