package com.ULHPOM.PageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ULHPOM.ResuableComponents.ReusableMethods;
import com.ULHPOM.UiStore.HomePageUi;



public class HomePageObjects extends HomePageUi{

	WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Closingpop() {
		closePopup.click();
	}
	
	public void SearchItem(String s) throws InterruptedException, IOException
	{
		
		searchBox.sendKeys(s);
		searchButton.sendKeys(Keys.ENTER);
	}
	
	public boolean CheckFirstChair()
	{
		return firstChairCheck.isDisplayed();
	}
	
	
	public void RecommendPrice() {
		Actions action = new Actions(driver);
		  action.moveToElement(rec1).perform();
		  action.moveToElement(rec2).click().perform();
	}
	
	//
	public void TvDetails()
	{
		TvUnits.click();
		System.out.println(tvname.getAttribute("title"));
		System.out.println(firstTv1.getText());
	}
	
	public void Giftcards()
	{
		gift.click();
	}
	public boolean Checkcards()
	{
		return dc.isDisplayed();
	}
	
	//
	public void ClickOnTwitter()
	{
		twitter.click();
	}
	public void GetFollowers()
	{
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            System.out.println(" "+driver.getTitle());
            System.out.println("Twitter Followers Count : "+Followers.getText());
            }
        }
	}
	
	
	//
	
	public void MoreCities()
	{
		more.click();
	}
	public void GetStatesList()
	{
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
          int ss=states.size();
            System.out.println("No of delivering  states : "+ss);
            List<WebElement> allLinks=states;
            for(WebElement link:allLinks) {
            	System.out.print(link.getText()+",");
            }
            }
        }
	
	}
	
	//
	
	public void SelectCheckOutItem()
	{
		Item.click();
	}
	
	public void ClickCheckOut() throws InterruptedException
	{
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            addcart.click();
            }
        }
	}
	public void SetQuantity(int n)
	{
		int qa=n;
			quantity.click();
		for(int i=1;i<qa;i++) {
			quantity.sendKeys(Keys.ARROW_DOWN);
			}
			quantity.sendKeys(Keys.ENTER);
	}
	
	public void GetCheckoutItemPrice()
	{
		System.out.println("Final price of checkout item :"+price.getText() );
	}
	
	
	//chat
	
	public void ClickChatIcon() throws InterruptedException
	{
		driver.switchTo().frame(chat);
		cchat.click();
		WebDriverWait d= new WebDriverWait(driver,15);
		d.until(ExpectedConditions.elementToBeClickable(chatwithus));
		chatwithus.click();
	}
	
	public void SendChatQs(String ss)
	{
		chattext.sendKeys(ss);
		chattext.sendKeys(Keys.ENTER);
	}
	
	
	//stores link
	public void ClickonStores()
	{
		stores.click();
	}
	public int GetStoresImagesLinksCount()
	{
		int noLinks=driver.findElements(By.tagName("img")).size();
		System.out.println(noLinks);
		return noLinks;
	}
	
	
	//Track order
	public void ClickOntrackOrder()
	{
		trackOrder.click();
	}
	public void EnterOrderDetails(String o,String p)
	{
		WebDriverWait d= new WebDriverWait(driver,15);
		d.until(ExpectedConditions.elementToBeClickable(orderid));
		orderid.sendKeys(o);
		phno.sendKeys(p);
		submit.click();
	}
}

