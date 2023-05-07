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
Feature: update customer
Description: you can update customer if the admin login


Scenario: update missing customer done
Given admin is logge in 
And   customer id is "12028255",the name is "ali",the address is "nables",the phone is "0594348312"
When click update the informations 
Then customer update to the id  "12028255",the name is "ali",the price is "nables",the amount is "0594348312"   


Scenario: update missing customer and admin is not logged in
Given the admin is not log in
When click update to the customer
Then error message and printed "can not update missing becouse  the admin is not login "

Scenario: update up customer done
Given  admin  logged in 
And  the Customer id is "12028255",the name is "ali"
When click Update of the customer
Then  Customer are update to the id is "12028255",the name is "ali"   


