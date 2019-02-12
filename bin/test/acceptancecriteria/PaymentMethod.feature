@TestRun 
Feature: Check the payment method are available
	As a customer, I want to know which payment method is available to me.

Scenario Outline: Checking if my payment method are available to buy my stuff at Netshoes 
	Given I know where are the payment method information  
	Then I will check if <"my payment method"> are a avalable
	
	Examples: 
		| my payment method |
		| Visa |
		| Mastercard |
		
