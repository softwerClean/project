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


Feature: Delete Product
Description: you can Delete product if the admin login

Scenario: Delete product success
Given the admin is logged in 
And the name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When the product is deleted from the menue 
Then the product with name is "rug",the Category is "Cotton",the price is "100",the amount is "3" is deleted from menue         

Scenario: Delete product and the admin is not login
Given the admin is not login 
And the name is "rug",the Category is "Cotton",the price is "100",the amount is "3"
When the product is not Deleted from the menue
Then print "can not Delete becouse the admin is not login"


