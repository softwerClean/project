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
Feature: Delete Customer
Description: you can Delete customer if the admin login

Scenario: Delete customer success
Given the admin is loggin 
And the id is "12028255",the name is "ali",the address is "nables",the phone is "0594348312"
When the job of the customer is canceled 
Then the customer with id is "12028255",the name is "ali",the address is "nables",the phone is "0594348312" is deleted from menue         

Scenario: Delete customer and the admin is not login
Given the admin is logged out 
And the customer id is "12028255",the name is "ali",the address is "nables",the phone is "0594348312"
When the job of the customer is not canceled
Then print message "can not Delete the customer becouse the admin is not login"
