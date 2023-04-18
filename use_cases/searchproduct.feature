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
@tag
Feature: Searching for product by name
Description : user or admin search for product

Background: the company has set of product 
Given the admin is logged in
And the product contained in company
    
      | rug  | Cotton  |  100 |  3    |
      |lal sa  |  ffff    | 200  |    5  |
      |  rug| vcd      |300   |    6  |
      |lal sa |  mam    | 400  |    7  |
      |  ppp| ccc      |500   |   8 |
      
      
      
       Scenario: Searching for a product by the name
      Given the admin not logg in
      When  the user search for txt "rug"
      Then the product with name "rug" is found 
      
      
       Scenario: Searching for the admin logged in
      Given the admin  logg in
      When  the user search for txt "lal sa"
      Then the product with name "lal sa" is found 
      
      
      Scenario: the product not found
      When the user search for txt "ade"
      Then no product found
      

      Scenario: find more than one product
      When the user search for txt "lal sa"
      Then the product with name " lal sa " and "lal sa" found
      
      
      
      
      
      