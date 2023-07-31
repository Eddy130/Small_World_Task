Feature: Login page feature

Scenario: Login with Incorrect Password
Given User navigates to "<website>"
And User enter the Username "<username>" 
And User enter the Password "<password>" 
Then click login button
And verify error msg "<error_message>"

Scenario: Login with Correct Password
Given User navigates to "<website>"
And User enter the Username "<username>" 
And User enter the Password "<password>" 
Then click login button



Examples:
      | website                                     | username              |password 		|error_message     																																|
      | https://www.saucedemo.com/                  | test1                 |ds       		|Epic sadface: Username and password do not match any user in this service        |
      | https://www.saucedemo.com/                  | problem_user          |secret_sauce |																																									|