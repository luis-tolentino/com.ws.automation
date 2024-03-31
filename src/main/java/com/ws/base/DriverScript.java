package com.ws.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	public static WebDriver driver;
	static Properties prop;
	
//	 create a DriverScript Contructor to import the config.properties File/FileInputStream and load it into prop
	public DriverScript() {
		
		File file = new File("./src/test/resources/config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
//	create the application initialization method
	public void initApplication() {
		String browser = prop.getProperty("browser");
		if((browser.trim().equalsIgnoreCase("chrome"))) {
			driver = new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if((browser.trim().equalsIgnoreCase("edge"))) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please check the config.properties file for supported drivers");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getAppUrl();
	}
	
//	create a Method to get the url
	public void getAppUrl() {
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
//	 create a Method to quit the driver.
	public void quitDriver() {
		driver.quit();
	}
}
