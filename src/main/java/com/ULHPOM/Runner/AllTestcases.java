package com.ULHPOM.Runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ULHPOM.PageObjects.HomePageObjects;
import com.ULHPOM.ResuableComponents.Base;
import com.ULHPOM.ResuableComponents.ReusableMethods;
import com.ULHPOM.Utilities.ExcelReader;
import com.ULHPOM.Utilities.PropertyFileReader;

public class AllTestcases extends Base{

	@BeforeMethod
	public void in() throws IOException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.Closingpop();
	}
	@Test(priority=8)
	public void SearchForItem() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.SearchItem("chair");
		if(hpo.CheckFirstChair()) {
		logger.info("Chair Present  "+hpo.CheckFirstChair());
		}
		else
		{
			System.out.println("Chair not present");
			logger.warn("Chair not present");
		}

	}
	
	@Test(priority=1)
	public void GetCities() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.MoreCities();
		hpo.GetStatesList();
		logger.info("States list printed");
       
	}
	
	@Test(priority=2)
	public void TvPrice() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.TvDetails();
	
	}
	
	@Test(priority=3)
	public void VerifyGiftCard() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.Giftcards();
		
		if(hpo.Checkcards())
		{
			System.out.println("Digital cards is present");
			logger.info("Digital cards is present");
		}
		else
		{
			System.out.println("Digital cards is not present");
			logger.error("Digital cards is not present");
		}
		
	}
	

@Test(priority=4)
	public void GetTwitterFollowers() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClickOnTwitter();
		hpo.GetFollowers();
		logger.info("Got Twitter followers");
	}
	
	@Test(priority=5)
	public void CheckoutItem() throws IOException, InterruptedException
	{
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.SearchItem("bed");
		hpo.SelectCheckOutItem();
		hpo.ClickCheckOut();
		hpo.SetQuantity(2);
		hpo.GetCheckoutItemPrice();
		logger.info("Final Price For quantity printed");
		
	}
	
	@Test(priority=6)
	public void ChatSupportCkeck() throws IOException, InterruptedException
	{
	
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClickChatIcon();
		hpo.SendChatQs("Hello");
		logger.info("Chat Messge Sent");
		
	}
	
	@Test(priority=7)
	public void NoOfLinksinStoresPage() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClickonStores();
		hpo.GetStoresImagesLinksCount();
		logger.info("No of image links in stores page : "+hpo.GetStoresImagesLinksCount());
	}
	
	@Test(dataProvider="getData",priority=0)
	public void TrackOrder(String ordi,String Phno) throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClickOntrackOrder();
		hpo.EnterOrderDetails(ordi, Phno);
		logger.info("details entered for track Order");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		prop=PropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetName");
		Object[][] data=ExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	@Test(priority=9)
	public void SelectRecommendations() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.SearchItem("chair");
		hpo.RecommendPrice();
		logger.info("Low to High");
		

	}
	@AfterMethod
	public void closeDriverM()
	{
		logger.info("driver closed");
		driver.quit();
		
	}
}
