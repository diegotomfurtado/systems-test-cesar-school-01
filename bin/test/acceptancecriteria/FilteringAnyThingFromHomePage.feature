@TestRun 
Feature: Choosing any male shoes from the Home page 
	As a user, without account created, when he choose any stuff from the home page, he hope to see all stuff which Netshoes has.

Background: 
	Given a user is on Home page without login 
	
Scenario Outline: Filtering any shoes and accessory from the home page
	When a user search "<anything such as shoes or accessory>" on the filter 
	Then a user will see "<a list from the filter searched>" available on Netshoes 
	
	Examples: 
		| anything such as shoes or accessory | a list from the filter searched |
		|calcado masculino					  | CALCADO MASCULINO			  	|
		|perfume feminino					  | PERFUME FEMININO				|
		|perfume masculino					  | PERFUME MASCULINO			  	|