package com.CucumberUrbanLadder.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CucumberUrbanLadder.uiStore.HomePageUi;

public class HomePageObjects {
	WebDriver driver;
	HomePageUi hpu=new HomePageUi();
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ClosingPopUp()
	{
		return driver.findElement(hpu.popupclose);
	}
	public WebElement Search()
	{
		return driver.findElement(hpu.search);
	}
	public WebElement SearchButtonClick()
	{
		return driver.findElement(hpu.searchbuttonclk);
	}
	public WebElement ItemName()
	{
		return driver.findElement(hpu.item);
	}
	
	
	
	public WebElement ClickYt()
	{
		return driver.findElement(hpu.youtube);
	}
	
	public WebElement ClkAbout()
	{
		return driver.findElement(hpu.about);
	}
	public WebElement YtcDate()
	{
		return driver.findElement(hpu.date);
	}
	
	
	
	public WebElement Chat()
	{
		return driver.findElement(hpu.chatbox);
	}
	public WebElement ChatFrame()
	{
		return driver.findElement(hpu.botchat);
	}
	public WebElement ChatBot()
	{
		return driver.findElement(hpu.chatwith);
	}
	public WebElement ChattBox()
	{
		return driver.findElement(hpu.chatText);
	}
	
	
	
	public WebElement SearchItem()
	{
		return driver.findElement(hpu.Item);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(hpu.addcart);
	}
	public WebElement SelectQuantity()
	{
		return driver.findElement(hpu.quantity);
	}
	public WebElement FinalPrice()
	{
		return driver.findElement(hpu.price);
	}
	public WebElement CheckOutProduct()
	{
		return driver.findElement(hpu.checkout);
	}
	
	
	public WebElement HoverPrice()
	{
		return driver.findElement(hpu.PriceHover);
     }
	public WebElement SelectPriceRange()
	{
		return driver.findElement(hpu.pricerng);
     }
	
	public WebElement AllFurnitures()
	{
		return driver.findElement(hpu.furniture);
     }
	
	
	public WebElement EnterSubMail()
	{
		return driver.findElement(hpu.submail);
     }
	
	public WebElement ClickMore()
	{
		return driver.findElement(hpu.moreOpt);
     }
	
	public List<WebElement> AllCities()
	{
		return driver.findElements(hpu.allcities);
     }
	
	public WebElement TrackOrder()
	{
		return driver.findElement(hpu.track);
	}
		
	
	public WebElement Orderid()
	{
		return driver.findElement(hpu.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(hpu.phno);
	}
	
	
	public WebElement GetCheckBox()
	{
		return driver.findElement(hpu.Checkbox);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(hpu.productCount);
	}
	

	
}
