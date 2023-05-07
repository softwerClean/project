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
Feature: Generate statistics
 Description: As an admin I want to view statistics about the business So that I can track the performance of the company

  Scenario: View total delivered items
    Given I have delivered 10 items
    When I generate a report
    Then the total delivered items should be 10

  Scenario: View total cash
    Given I have received 1000 NIS in cash
    When Im generate a report
    Then the total cash should be 1000 NIS

  Scenario: View total paid
    Given I have received 500 NIS in payment
    When I will generate a report
    Then the total paid should be 500 NIS

  Scenario: View total debts
    Given I have unpaid debts of 200 NIS
    When we generate a report
    Then the total debts should be 200 NIS