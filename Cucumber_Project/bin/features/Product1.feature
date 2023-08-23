Feature: Checking Product Details
	Scenario:  Checkign Product1 details
	Given enter name of product "iphone"
	And enter product quantity 3
	And Verify total product price is 1000020.00
	Then Verify product status is true
	
	Scenario:  Checkign Product1 details
	Given enter name of product "Samsung"
	And enter product quantity 1
	And Verify before price is 123000.00 and after price is 32000.00
	Then Verify Total Price
	