package com.ws.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


// this Helper class is used to capture and store the screeshots
public class Helper {

	public static String screenCapture(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenPath = "C:/Users.netta.OneDrive.Desktop.WORKSPACE.Framework/com.ws.automation/testreport/screenshots/screen.png";
		try {
			FileHandler.copy(src, new File(screenPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenPath;
	}
}
