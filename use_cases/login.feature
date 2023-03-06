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

Feature: login

  
  Scenario: login success
    Given the user_name is "adham_12028277"
    And the password is "123456789@adham" 
    Then login success
    And Done 
    And Welcome

  
  Scenario: login faild the user_name is wrong
    Given the user_name is "moheeb_12021520"
    And the password is "123456789@adham" 
    Then login faild
    And sorry, try again 
    
  
  Scenario: login faild the password is wrong
    Given the user_name is "adham_12028277"
    And the password is "13597@moheeb" 
    Then login faild
    And sorry, try again
    
   
  Scenario: login faild the password and user_name are wrong 
    Given the user_name is "moheeb_1201262"
    And the password is "13597@moheeb" 
    Then login faild
    And sorry, try again
    
