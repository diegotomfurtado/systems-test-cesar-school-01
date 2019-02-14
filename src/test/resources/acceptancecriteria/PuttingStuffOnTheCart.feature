@TestRun 
Feature: Putting any stuff on the cart while a user has money. 
	As a user, I want to choose any items on Netshoes website to spend my money.

Scenario Outline: Choosing items to put on the Cart while a user has money 
	Given a user has <money> reais to spend 
	When a user chooses the products "<male or female>" 
	Then while a user has money will can put more products on the cart
	
	Examples: 
		| money | male or female	|
		| 500  | calcado feminino	|
		
