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

Feature: report

Scenario: print list customer
Given admin logged in
When admin enters customer 
|name|User_Name|Password|address|
|muheeb|muheeb19|0595781756|Nablus|
|momen|mom456|0000000|Ramallah|
|zena|zena1010|173244|Tulkarem|
|adham|adham00|169988|gaza|
Then print data of customer


Scenario: print product
Given admin logged in
When admin enters product
 |Category|name|price|amount|
|Cotton1|rug1|100|3|
|Cotton12|rug12|200|5|
|Cotton13|rug13|50|7|
Then print data of product
