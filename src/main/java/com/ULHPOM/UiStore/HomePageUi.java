package com.ULHPOM.UiStore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ULHPOM.ResuableComponents.Base;

public class HomePageUi {
	


	@FindBy(id="search")
	public WebElement searchBox;
	@FindBy(id="search_button")
	public WebElement searchButton;
	
	
	@FindBy(css="a[data-gaaction=\"popup.auth.close\"]")
	public WebElement closePopup;
	
	//public By firstChairCheck=By.cssSelector("img[title=\"Galen Study Chair (Black, Nylon Chair Base)\"]");
	@FindBy(css="img[title=\"Galen Study Chair (Black, Nylon Chair Base)\"]")
	public WebElement firstChairCheck;
	
	//public By firstTv=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/a/div[2]/span");
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/a/div[2]/span")
	public WebElement firstTv1;
	//public By TvUnits=By.cssSelector("a[href=\"/tv-units?src=explore_categories\"]");
	@FindBy(css="a[href=\"/tv-units?src=explore_categories\"]")
	public WebElement TvUnits;
	//public By tvname=By.cssSelector("a[	title=\"Zephyr Large TV Unit (Teak Finish)\"]");
	@FindBy(css="a[	title=\"Zephyr Large TV Unit (Teak Finish)\"]")
	public WebElement tvname;
	
	//public By gift=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
	@FindBy(css="a[href=\"../../gift-cards?src=header\"]")
	public WebElement gift;
	//public By dc=By.xpath("//h5[normalize-space()='Digital Cards']");
	@FindBy(xpath="//h5[normalize-space()='Digital Cards']")
	public WebElement dc;
	
	//public By twitter=By.className("icofont-social-twitter");
	@FindBy(className="icofont-social-twitter")
	public WebElement twitter;
	//public By Followers=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[2]/a/span[1]/span");
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[2]/a/span[1]/span")
	public WebElement Followers;
	
	//public By Item=By.cssSelector("a[data-id=\"94869\"]");
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img")
	public WebElement Item;
	//public By addcart=By.id("add-to-cart-button");
	@FindBy(id="add-to-cart-button")
	public WebElement addcart;
	//public By quantity=By.id("select_0_quantity");
	@FindBy(id="select_0_quantity")
	public WebElement quantity;
	//public By price=By.className("final-price");
	@FindBy(className="final-price")
	public WebElement price;
	
	//public By chat=By.id("fc_widget");
	@FindBy(id="fc_widget")
	public WebElement chat;
	//public By cchat=By.className("icon-ic_chat_icon");
	@FindBy(className="icon-ic_chat_icon")
	public WebElement cchat;
	//public By chatwithus=By.className("channel-name");
	@FindBy(className="channel-name")
	public WebElement chatwithus;
	//public By chattext=By.id("app-conversation-editor");
	@FindBy(id="app-conversation-editor")
	public WebElement chattext;
	

	
	//public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	@FindBy(css="[href=\"/orders\"]")
	public WebElement trackOrder;
	//public By orderid=By.name("orderNumber");
	@FindBy(name="orderNumber")
	public WebElement orderid;
	//public By phno=By.name("phoneNumber");
	@FindBy(name="phoneNumber")
	public WebElement phno;
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/form[1]/button/span[1]")
	public WebElement submit;
	
	//public By more=By.cssSelector("[href=\"/locations?src=footer\"]");
	@FindBy(css="[href=\"/locations?src=footer\"]")
	public WebElement more;
	//public By cities=By.cssSelector(".col-lg-3.col-sm-6.location__taxon__state");
	@FindBy(css=".col-lg-3.col-sm-6.location__taxon__state")
	public List<WebElement> states;
	
	 //By stores=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[1]/a")
	public WebElement stores;
	
	
	
	
	//public By rec1=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]");
	@FindBy(xpath="//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]")
	public WebElement rec1;
	//public By rec2=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]");
	@FindBy(xpath="//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]")
	public WebElement rec2;

	
}
