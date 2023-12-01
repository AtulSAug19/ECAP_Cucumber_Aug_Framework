Feature: Verify login functionality

Background:
	Given User click on registration link

	Scenario: Verify user should be able to login with correct information
	When user enter username ""
	When user enter password ""
	When user click on Submit button
	Then Alert should be displayed
	
#	Scenario: Verify user should not be able to login with incorrect information
#	When user enter incorrect username ""
#	When user enter incorrect password ""
#	When click on Submit button
#	Then error message should be displayed in alert