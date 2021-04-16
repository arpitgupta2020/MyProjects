package com.arpit.seleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {	

	public static void main(String[] args) throws IOException {
		
		//Practice script to run the program in node machine
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//Open Web browser as per Selenium4.0
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");
		
		//If want to run the test in local machine
		WebDriver driver= new ChromeDriver(options);
		
		//If want to run the test in Node machine(Office lappy)
		
		
		//WebDriver driver= new RemoteWebDriver(new URL("http://localhost:1111/wd/hub"), dc);
		
		//Maximize Web browser
		driver.manage().window().maximize();
		
		//Open a URL
		driver.get("http://www.jetairways.com");
		
		//Identify all Anchor tags
		List<WebElement> allPageLinks=driver.findElements(By.tagName("a"));
		
		//Add all img links in same list if img are links
		allPageLinks.addAll(driver.findElements(By.tagName("img")));
		
		//Get all valid links which has href attributes
		List<WebElement> validLinks=new ArrayList<>();
		for(int i=0; i<allPageLinks.size(); i++) {
			if(allPageLinks.get(i).getAttribute("href") != null && !(allPageLinks.get(i).getAttribute("href").contains("javascript"))){
				validLinks.add(allPageLinks.get(i));
			}					
		}
		
		//Print total number of links in Web page
		System.out.println("Total # of links in Current page are-"+allPageLinks.size());
		
		//Print total number of links in Web page
		System.out.println("Total # of valid links in Current page are-"+validLinks.size());
		
		for(WebElement elementLink: validLinks) {
			int responseCode;
			String hyperlinkText= elementLink.getAttribute("href");
			//URL class
			URL linkUrl= new URL(hyperlinkText);
			//Open HTTP connection
			HttpURLConnection httpUrlConnection= (HttpURLConnection)linkUrl.openConnection();
			//Can we set request method also?
			httpUrlConnection.setRequestMethod("HEAD");
			//Connect to HTTP URL
			httpUrlConnection.connect();
			//Get a response code using Response code method
			responseCode= httpUrlConnection.getResponseCode();
			//Validate URL response code with actual code
			if(responseCode>400) {
				System.out.println(responseCode+" - "+hyperlinkText+" - is Broken Link");
			}else {
				System.out.println(responseCode+" - "+hyperlinkText+" - is Valid Link");
			}
			
		}
		
	}

}
