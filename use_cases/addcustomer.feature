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
Feature: Add Customer
Description: you can add customer if the admin login

Scenario: add customer done
Given Admin with name "ali" and password "123456@ali" is logged in 
And  i will to add the customer  
When Admin click button add customers
Then add done successfully


Scenario: Add a customer when the admin is not logged in
Given the admin is not logged in
And  i will to add a customer  
When click add customer
Then adding failed and print error message "please login to add customer"
