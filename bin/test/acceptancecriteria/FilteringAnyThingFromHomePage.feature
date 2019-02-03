@Ignore 
Feature: Choosing any male shoes from the Home page 
	As a user, without account created, when I choose any male shoes from the home page, I want to see all the male shoes that Netshoes has.

Background: 
	Given a user is on Home page without login 
	
Scenario Outline: Filtering any shoes and accessory from the home page 
	When a user will search "<anything such as shoes or accessory>" on the filter 
	Then a user will see "<a list from the filter searched>" available on Netshoes 
	
	Examples: 
		| anything such as shoes or acessory | a list from the filter searched|
		|calcado masculino					 | CALCADO MASCULINO			  |
		|perfume feminino					 | PERFUME FEMININO				  |
		|perfume masculino					 | PERFUME MASCULINO			  |