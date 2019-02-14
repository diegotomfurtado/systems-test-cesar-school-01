@TestRun 
Feature: WishList 
	As a user, I want to save anything on the WishList and return anytime to buy.

Background: 
	Given a user is logged into his Netshoes account 
	
Scenario Outline: putting anything on the WishList 
	When a user selects "<any stuff>" to put on Wish List 
	Then a user could return anytime to finish his shopping 
	
	Examples: 
		| any stuff |
		| calcado feminino |