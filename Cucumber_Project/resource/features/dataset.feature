Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page1
	When User Navigate to LogIn Page1
	And User enters "<username>" and "<password>"
	Then Close Test Here
Examples:
    | username   | password |
    | testuser_8 | Test@111 |
    | testuser_9 | Test@222 |
    | adminfirst | admin@12 |
     | adminfirst1 | admin@123 |
     
Scenario Outline: Verify Footertitles
	Given User is on Home Page1
	And User Click at "<Linkname>"
	Then Verify title presented "<PageTitle>"
	
	Examples:
    | Linkname   	| PageTitle	 	|
    | Signup     	| Facebook  	|
    | Instagram     | Instagaram  	|
  