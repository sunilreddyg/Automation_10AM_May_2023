Feature:    Checking Login feature

	Scenario:   Verifying login with valid data
	
			Given enter facebook url
			When user enter valid username and password
			And click on login button
			Then verify Logout feature displayed
			
	Scenario:  Verifying login with invalid data
		Given enter facebook url
		When user ener invalid username and passowrd
		And click on login button
		Then verify email field exist