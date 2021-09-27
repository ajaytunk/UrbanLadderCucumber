package com.CucumberUrbanLadder.uiStore;

import org.openqa.selenium.By;

public class HomePageUi {
	public By popupclose=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	public By search=By.id("search");
	public By searchbuttonclk=By.id("search_button");
	public By item=By.cssSelector("img[title=\"Arabia XL Storage Dining Table (Mahogany Finish)\"]");
	
	public By youtube=By.className("icofont-social-youtube");
	public By about=By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[6]/div");
	public By date=By.xpath("//*[@id=\"right-column\"]/yt-formatted-string[2]/span[2]");
	
	
	public By chatbox=By.id("fc_widget");
	public By botchat=By.className("icon-ic_chat_icon");
	public By chatwith=By.className("channel-name");
	public By chatText=By.id("app-conversation-editor");
	
	public By Item=By.cssSelector("a[title*=\"Rhodes Folding Book Shelf\"]");
	public By addcart=By.id("add-to-cart-button");
	public By quantity=By.id("select_0_quantity");
	public By price=By.className("final-price");
	public By checkout=By.id("checkout-link");
	
	
	public By PriceHover=By.cssSelector("[data-group=\"price\"]");
	public By pricerng=By.id("price_limit_56244-80495");
	
	
	public By furniture=By.id("Layer_1");
	
	
	public By submail=By.id("email_id");
	
	public By moreOpt=By.cssSelector("[href=\"/locations?src=footer\"]");
	public By allcities=By.cssSelector("div[class*='location__taxon__city']");
	
	public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	public By orderid=By.name("orderNumber");
	public By phno=By.name("phoneNumber");
	
	public By Checkbox=By.cssSelector("[id=\"filters_availability_In_Stock_Only\"]");
	public By productCount=By.cssSelector("[class=\"results-count\"]");
	
	
}
