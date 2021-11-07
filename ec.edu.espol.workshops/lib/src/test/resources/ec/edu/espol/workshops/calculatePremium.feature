Feature: Calculate the insurance prime for a customer

	Scenario Outline: The customer is a married Female between the ages of 44 and 66
 		Given The customer has 21 years old, is single and female, and her license is 1904002349
 		When We Calculate the premium car insurance
 		Then I should be told 300
 	
	Scenario: The customer is over 80 years old
		Given The customer has 81 years old, is single and female, and her license is 1904002349
 		When The customer gives her age
 		Then I should be told 0
	
	Scenario: The customer doesn’t have a valid driver’s license 
		Given The customer has 50 years old, is single and female, and her license is 190400234
		When The customer Enter driver’s license number
		Then I should be told I should be told 0

	Scenario: The customer is a 24-year-old single Male 
		Given The customer has 24 years old, is single and male, and his license is 1904002345
		When The customer Calculates the premium car insurance
		Then I should be told 2000

 	
 		
 	Examples:
 		| age | answer |
 		| 44  | 300   |
 		| 45  | 200   |
 		| 46  | 200   |
 		| 64  | 200   |
 		| 65  | 300   |
 		| 66  | 300   |