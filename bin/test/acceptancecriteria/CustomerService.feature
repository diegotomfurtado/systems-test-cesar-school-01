@TestRun 
Feature: Customer Services
	As a user, I need an online customer service where I clear up my questions

Scenario Outline:  
	Given a user is looking for a place where he could ask something 
	When a user found it he will <"type his doubt"> on the customer service place  
	Then Netshoes will answer <"his doubt">
	
	Examples: 
		| type his doubt | his doubt |
		| Como fazer uma troca? |  Como fazer uma troca? |		
