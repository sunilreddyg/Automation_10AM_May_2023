Feature:  Checking login feature
	Scenario: Login with valid data
	
		Given open hrm page
		When user enter valid username
		And user enter valid password
		And click the login button
		Then Verify hrm login is successful