Feature: Cash withdrawal
	Scenario: Successful withdrawal from an accound in credit
		Given I have $100 in my accound
		When I requested $20
		Then $20 should be dispensed