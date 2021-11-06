Feature: Calculate the insurance prime for a customer

	Scenario: The customer is over 80 years old
		Given An 81-year-old single female customer with driver’s license 1904002349
 		When Enter the age
 		Then I should be told sorry, premium car insurance is not available for 80 years older
	
	Scenario: The customer doesn’t have a valid driver’s license 
		Given A 50-year-old single female customer with driver’s license 190400234
		When Enter driver’s license number
		Then I should be told Come on, Driving License [ten digits]:

	Scenario: The customer is a 24-year-old single Male 
		Given A 24-year-old single male customer with driver’s license 1904002345
		When Calculate the premium car insurance
		Then I should be told Premium Car Insurance: $2000

 	Scenario Outline: The customer is a married Female between the ages of 44 and 66
 		Given A "<age>"-year-old married female customer with driver’s license 1904002349
 		When Calculate the premium car insurance
 		Then I should be told Premium Car Insurance: "<answer>"
 		
 	Examples:
 		| age | answer |
 		| 44  | $300   |
 		| 45  | $200   |
 		| 46  | $200   |
 		| 64  | $200   |
 		| 65  | $300   |
 		| 66  | $300   |