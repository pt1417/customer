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
Feature: Place an order from a menu
  	As a restaurant cashier
			I want to retrieve existing customer information using customerNumber
			so that I don’t have to recreate customer information

  @tag1
  Scenario Outline: get an existing customer record from Customer
    Given Customer service and database are running  and Customer DB has customerNumber, <customerNumber>
    When Customer mS receives request for customerNumber, <customerNumber>
    Then Customer information should be displayed for customerNumber, <customerNumber>

    Examples: 
      |customerNumber| 
      |CUST456|  
      |CUSTf7973a87-3e5c-4c92-b92d-050a2f723a20|  
   
