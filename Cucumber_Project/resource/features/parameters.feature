Feature:  Checking login

	Scenario:  Valid Test 
	
		Given load hrm webpage "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		When user enter valid username "Admin"
		And user enter valid password "admin123"
		Then Verify Header displayed "Dashboard"