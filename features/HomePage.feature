Feature: Urban Ladder website

Scenario: Search for item
Given open browser 
And navigate to given url
When enter name of item "dining table" and click search
Then Display the name dining table

Scenario: To get youtube join date
Given open browser 
And navigate to given url
When click on youtube
Then go to About and display the created date on console

Scenario: Chat with customer care
Given open browser 
And navigate to given url
When Open chatbox frame
Then Send message "Hii" to Customer care

Scenario: CheckOut
Given open browser 
And navigate to given url
When name of the item "bookshelf" to entered into search box
Then Add to cart and slect 2 and proceed to check out





Scenario: CheckBox
Given open browser 
And navigate to given url
When the item we want to search is "wooden sofas"
Then see weather the checkbox is checked or not

Scenario: Count all links in allfurnitures page
Given open browser 
And navigate to given url
When click on all furnitures
Then Display Number of links present in that page

Scenario Outline: Count all links in allfurnitures page
Given open browser 
And navigate to given url
When Enter <email> in side the subscribe box
Then click on subscribe

Examples:
|email|
|aja|
|abcd@gmail.com|

Scenario: Delivering cities all in state
Given open browser 
And navigate to given url
When click more in footer section
Then After navigation to next page print all cities 

Scenario Outline: Delivering cities all in state
Given open browser 
And navigate to given url
When Enter <orderid> and <phonenum>


Examples:
|orderid|phonenum|
|878548|78944525|
|7478548|785459525|

Scenario: To check How many items out of stock
Given open browser 
And navigate to given url
When Enter item name "chairs "
Then get Instock count and Outofstock count





