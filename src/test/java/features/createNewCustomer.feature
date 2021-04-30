Feature: Register

	@register_login
  Scenario: Register to system and login
  	Given Get Login Page Url
    When Open Register Page
    And Input to email ID
    And I click to Submit button
    Then Get User and password infor
    When Back to Login page
    And Submit valid infor to login form
    Then Home page display
 @new_customer
  Scenario: Create New Customer
    Given I open New Customer page
    When I input to Customer Form with Data
      | Name    | DateOfBirth | Address            | City        | State     | Pin    | Phone      | Email       | Password |  
      | Hung Ho | 02/11/1996  | Phan Xich Long | Ho Chi Minh | Phu Nhuan | 123456 | 0987654321 | tanhung9966@gmail.com | 123123   | 
    Then Verify message Customer Registered Successfully!!! displayed success
 