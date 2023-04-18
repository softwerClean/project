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
Feature: register user


Scenario: register user success
Given the admin logged in
And user with ID "12010108" , Name "Muheeb Hasan" , Email "s12010108@stu.najah.edu" ,Address "Nablus street" , code "00000" ,city "Nablus"
When the user is registered
Then the user with ID "12010108" , Name "Muheeb Hasan" , Email "s12010108@stu.najah.edu" ,Address "Nablus street" , code "00000" ,city "Nablus"is added


Scenario: register user when the admin not logged in 
Given the admin not logged in
And user with ID "12010108" , Name "Muheeb Hasan" , Email "s12010108@stu.najah.edu" ,Address "Nablus street" , code "00000" ,city "Nablus"
When the user is registered
Then error message "we must the admin logged in"

Scenario: admin logged in try to register a user is already regiser
Given the admin  logged in
And user with ID "12010108" , Name "Muheeb Hasan" , Email "s12010108@stu.najah.edu" ,Address "Nablus street" , code "00000" ,city "Nablus"
When the user is registered
Then error message "this user is already registered"

