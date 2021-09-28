package com.ULHPOM.Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ULHPOM.ResuableComponents.Base;



public class listeners implements ITestListener {
	Base b=new Base();


	public void onTestFailure(ITestResult result) {
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	

