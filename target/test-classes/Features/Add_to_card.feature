Feature: Add to Cart feature


Scenario: Add to Cart
Given User navigates to "<website>"
And User enter the Username "<username>" 
And User enter the Password "<password>" 
Then click login button
Then Add to Cart the Product 
Then Click on the Shopping Cart
Then Click on the Check Out Button
Then Enter First Name "<FirstName>" 
Then Enter Last Name "<LastName>" 
Then Enter ZIPCODE "<ZipCode>" 
Then Click on the Continue
Then Click on the menu button
And Logout the profile
Examples:
      | website                                     | username              |password 		|error_message| FirstName | LastName	  |ZipCode     |
      | https://www.saucedemo.com/                  | problem_user          |secret_sauce |							| Eddy			|	q			      |B4562		  |