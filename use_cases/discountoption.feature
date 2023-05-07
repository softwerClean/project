Feature: discount

Background:
Given these customers and those information
#name |totalpayed|frequently|
|adham |   2000   | 11       |
|omar |   7000   | 14       |
|auheeb  |   1200   | 23       |
|adnan |    360   | 19       |
|yazan|   4000   |  3       |
| ali |   120    |  1       |
  @discount_tag


Scenario Outline: Give the customer discount
    Given the <customer> has used the service 'frequently'
    And he has spent more than 400 NIS
    When he requests a discount
    Then the discount rate should be 10 %
   
   Examples:  
    |customer  |
    | "adham"   |
    | "omar"   |
    | "muheeb"    |
     
     
 @discount_tag2
 
    Scenario Outline: Give the customer discount
    When the <customer> hasnt used the service so many
    And the customer hasnt spent more than 400 NIS
    Then he will not get a discount
    
     Examples:  
    |customer  |
    | "adnan"   |
    | "yazan"  |
    | "ali"    |