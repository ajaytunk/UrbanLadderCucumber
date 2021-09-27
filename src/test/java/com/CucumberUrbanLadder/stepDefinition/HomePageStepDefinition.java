package com.CucumberUrbanLadder.stepDefinition;



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CucumberUrbanLadder.pageObjects.HomePageObjects;
import com.CucumberUrbanLadder.reusableComponents.Base;
import com.CucumberUrbanLadder.reusableComponents.ReusableMethods;
import com.CucumberUrbanLadder.uiStore.HomePageUi;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition extends Base{
	
	
	 @Given("^open browser$")
	    public void open_browser() throws Throwable {
			driver=initializedriver();
			ReusableMethods.Implicitwait(driver);
			logger.info("Browser initiallized Sucessfully");
	      
	    }

	    @And("^navigate to given url$")
	    public void navigate_to_given_url() throws Throwable {
	    	OpenUrl();
			HomePageObjects hp= new HomePageObjects(driver);
			hp.ClosingPopUp().click();
			logger.info("Navigated to Given URL");
	      
	    }
	    
	 
	    @When("^enter name of item \"([^\"]*)\" and click search$")
	    public void enter_name_of_item_and_click_search(String arg1) throws Throwable {
	    	HomePageObjects hp= new HomePageObjects(driver);
			
			Thread.sleep(5000);
			hp.Search().sendKeys(arg1);
			hp.SearchButtonClick().click();
			logger.info("Item got searched");
	    }

	    @Then("^Display the name dining table$")
	    public void display_the_name_dining_table() throws Throwable {
	    	HomePageObjects hp= new HomePageObjects(driver);
	    	Thread.sleep(5000);
			System.out.println(hp.ItemName().getAttribute("title"));
			logger.info("Title printed sucessfully");
	       
	    }
	    
	    
	    
	    @When("^click on youtube$")
	    public void click_on_youtube() throws Throwable {
			HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpo.ClickYt().click();
			logger.info("youtube opened in new tab");
	    }

	    @Then("^go to About and display the created date on console$")
	    public void go_to_about_and_display_the_created_date_on_console() throws Throwable {
	    	
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        for(String handle: allWindowHandles)
	        {
	            if(!handle.equals(mainWindowHandle)) 
	            {
	            	
	            driver.switchTo().window(handle);
	            hpo.ClkAbout().click();
	            System.out.println(driver.getTitle());
	            Thread.sleep(5000);
	            System.out.println("Youtube created date: "+hpo.YtcDate().getText());
	            logger.info("Youteb created date printed");
	            }
	        }
	      
	    }
	
	    
	    
	    @When("^Open chatbox frame$")
	    public void open_chatbox_frame() throws Throwable {
			HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			driver.switchTo().frame(hpo.Chat());
			Thread.sleep(5000);
	     
	    }

	    @Then("^Send message \"([^\"]*)\" to Customer care$")
	    public void send_message_something_to_customer_care(String msg) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	hpo.ChatFrame().click();
			Thread.sleep(5000);
			hpo.ChatBot().click();
			hpo.ChattBox().sendKeys(msg);
			hpo.ChattBox().sendKeys(Keys.ENTER);
			driver.switchTo().defaultContent();
			logger.info("Started chat with the customer care Executive");
	        
	    }
	    
	    

	    @When("^name of the item \"([^\"]*)\" to entered into search box$")
	    public void name_of_the_item_something_to_entered_into_search_box(String name) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpo.Search().sendKeys(name);
			hpo.SearchButtonClick().click();
			hpo.SearchItem().click();
	    }
	    
	    
	    
	    
	    @Then("^Add to cart and slect (\\d+) and proceed to check out$")
	    public void add_to_cart_and_slect_and_proceed_to_check_out(int quantity) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        for(String handle: allWindowHandles)
	        {
	            if(!handle.equals(mainWindowHandle)) 
	            {
	             driver.switchTo().window(handle);
	             Thread.sleep(6000);
	             hpo.Addtocart().click();
	         	Thread.sleep(6000);
	         	int n=quantity;
	         	for(int i=1;i<n;i++) {
		     		hpo.SelectQuantity().sendKeys(Keys.ARROW_DOWN);
		     		}
		    		hpo.SelectQuantity().sendKeys(Keys.ENTER);
		    		System.out.println("Final Price For"+n+" +chairs+ :"+hpo.FinalPrice().getText());
		    	    hpo.CheckOutProduct().click();
		    	    logger.info("Product added to cart annd ready for checkout");
		       
		            }
		            
		        }
	    }
	    
	    
	   
	    
	    @When("^the item we want to search is \"([^\"]*)\"$")
	    public void the_item_we_want_to_search_is_something(String ItemName) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpo.Search().sendKeys(ItemName);
			hpo.SearchButtonClick().click();
			Thread.sleep(5000);
	    }

	 

	    @Then("^see weather the checkbox is checked or not$")
	    public void see_weather_the_checkbox_is_checked_or_not() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	      
	    	Actions action = new Actions(driver);
			  
			action.moveToElement(hpo.HoverPrice()).click().perform();
			 action.moveToElement(hpo.SelectPriceRange()).click().perform();
			 Thread.sleep(5000);
				if(hpo.SelectPriceRange().isSelected())
				{
					
				System.out.println("Checkbox Got selected");
				logger.info("Checbox got checked");
				}
		}
	    

	    @When("^click on all furnitures$")
	    public void click_on_all_furnitures() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	hpo.AllFurnitures().click();
	    }

	    @Then("^Display Number of links present in that page$")
	    public void display_number_of_links_present_in_that_page() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	        int Count=driver.findElements(By.tagName("a")).size();
	        System.out.println("The no.of links present are : "+Count);
	        logger.info("Number of links printed on console");
	      
	    }
	    
	    

	    @When("^Enter (.+) in side the subscribe box$")
	    public void enter_in_side_the_subscribe_box(String email) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	hpo.EnterSubMail().sendKeys(email);
	    	
	    }

	    @Then("^click on subscribe$")
	    public void click_on_subscribe() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	hpo.EnterSubMail().sendKeys(Keys.TAB);
	    	hpo.EnterSubMail().sendKeys(Keys.ENTER);
	    	Thread.sleep(5000);
	    	logger.info("Got subscribe to page");
	    	
	    }
	
	    @When("^click more in footer section$")
	    public void click_more_in_footer_section() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpo.ClickMore().click();
	       
	    }
	    
	    
	    @Then("^After navigation to next page print all cities$")
	    public void after_navigation_to_next_page_print_all_cities() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        for(String handle: allWindowHandles)
	        {
	            if(!handle.equals(mainWindowHandle)) 
	            {
	            driver.switchTo().window(handle);
	            System.out.println(" "+driver.getTitle());
	            Thread.sleep(5000);
	          int NoOfCities=hpo.AllCities().size();
	            System.out.println("No of delivering  cities : "+NoOfCities);
	            List<WebElement> allLinks=hpo.AllCities();
	            for(WebElement link:allLinks) {
	            	System.out.print(link.getText()+",");
	            }
	            }
		}
	        logger.info("All deliverable cities are printed on console");
	    }
	    
	    

	    @When("^Enter (.+) and (.+)$")
	    public void enter_and(String orderid, String phonenum) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
			hpo.ClosingPopUp().click();
			Thread.sleep(5000);
			hpo.TrackOrder().click();
			hpo.Orderid().sendKeys(orderid);
			hpo.PhoneNumber().sendKeys(phonenum);
			logger.info("Checking wheather the given order id and phone number matches data base");
	    }

	   

	    @When("^Enter item name \"([^\"]*)\"$")
	    public void enter_item_name_something(String item) throws Throwable {
	    	HomePageObjects hp= new HomePageObjects(driver);
			hp.ClosingPopUp().click();
			Thread.sleep(5000);
			hp.Search().sendKeys(item);
			hp.Search().sendKeys(Keys.ENTER);
			//hp.SearchButtonClick().click();
	    }

	    @Then("^get Instock count and Outofstock count$")
	    public void get_instock_count_and_outofstock_count() throws Throwable {
	    	HomePageObjects hp= new HomePageObjects(driver);
	    	String totalcount=hp.GetProductsCount().getText();
			System.out.println("Total items count : "+totalcount);
			hp.GetCheckBox().click();
			Thread.sleep(5000);
			if(hp.GetCheckBox().isSelected())
			{
				System.out.println("Check box selected");
				String InstockCount=hp.GetProductsCount().getText();
				System.out.println("Items Instock Count : "+InstockCount);
				logger.info("To print the instock and outof stock count");
			}
	        
	    }

	
	
	
	 
	    
		
	   
}



