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
Feature: Order tracking
  Customer want to track his orders So that he can know their status
@track1
  Scenario Outline: Track order status
    Given <Customer> have an order with the order number <number>
    When he check the status of his order
    Then the status should be "waiting"
    
    Examples:
    |Customer|number|
    |"adham"   | 1    |
    
@track2
  Scenario Outline: Update order status
    Given <Customer> have an order with the order number <number>
    When the order is being processed
    Then the status should be "in treatment"
     Examples:
    |Customer|number|
    |"muheeb" | 2    |
@track3
  Scenario Outline: Complete order
    Given <Customer> have an order with the order number <number>
    When the order is complete
    Then the status should be "complete"
     Examples:
    |Customer|number|
    |"yazan"    | 3    |