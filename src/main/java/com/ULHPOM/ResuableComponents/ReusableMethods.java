package com.ULHPOM.ResuableComponents;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	
	public static void Implicitwait(WebDriver driver) throws IOException
	{
	
		int wait=Integer.parseInt(Base.prop.getProperty("waits"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}

	
	
	
}
