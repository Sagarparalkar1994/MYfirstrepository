package org.selenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","Resorces\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		/*
		Navigation test=driver.navigate();
		test.to("https://www.myntra.com/login");*/
		
		driver.navigate().to("https://www.myntra.com/login");
		
		
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
		
	}
		
		
		
		
	}


