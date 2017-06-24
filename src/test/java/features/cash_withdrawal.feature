Feature: Cash withdrawal
	Scenario: Successful withdrawal from an accound in credit
		Given I have $17 in my account
		When I requested $20
		Then $20 should be dispensed