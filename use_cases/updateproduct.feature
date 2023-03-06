#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: update product
Description: you can update product if the admin login


Scenario: update missing product done
Given admin is login 
And  the product name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When the product is Update missing from the menu
Then the product update to the name  "rug",the Category is "Cotton",the price is "100",the amount is "3"   


Scenario: update missing product and admin is not logged in
Given the admin is not login 
And  the product name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When  the product is Update missing from the menu
Then error message was printed "can not update missing becouse  the admin is not login "

Scenario: update up product done
Given  admin is login 
And  the product name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When the product is Update missing from the menu
Then  the product update to the name  "rug",the Category is "Cotton",the price is "100",the amount is "3"   


Scenario: update up product and admin is not logged in
Given the admin is not login 
And  the product name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When  the product is Update up from the menu
Then error message was printed "can not update up becouse  the admin is not login "








