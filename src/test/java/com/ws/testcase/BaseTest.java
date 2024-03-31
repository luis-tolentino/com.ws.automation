package com.ws.testcase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ws.base.DriverScript;
import com.ws.pages.HomePage;
import com.ws.pages.LoginPage;
import com.ws.utils.Helper;

public class BaseTest extends DriverScript {
//	create the pages variables
	HomePage homepage;
	LoginPage loginpage;
	
//	import the ExtentTest as logger and ExtentReports as reports
	protected static ExtentTest logger;
	protected static ExtentReports report;
	
//	create the setUpReport Method and implement using the ExtentSparkReporter Class
	
	@BeforeSuite
	public void setUpReport() {
		 ExtentSparkReporter extent = new ExtentSparkReporter("./testreport/automationreport.html");
		 report = new ExtentReports();
		 report.attachReporter(extent);
	}
	
//	initialize the application and setup the pages before the Methods
	
	@BeforeMethod
	public void setUp() {
		initApplication();
		
		homepage = new HomePage();
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException {
		if(result.getStatus()== ITestResult.FAILURE) {
			try {
				logger.fail("Test failed",
				MediaEntityBuilder.createScreenCaptureFromPath(Helper.screenCapture(driver)).build());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		report.flush();
		Thread.sleep(3000);
		quitDriver();
	}
}
