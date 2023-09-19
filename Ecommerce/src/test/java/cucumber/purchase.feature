Feature: Purchase order from ecommerce website

Background:
Given I am on Ecommerce page  
  @tag2
  Scenario Outline: Test for submitting order
    Given Login with username <username> and password <password>
    When I add product <product> to cart
    And Checkout <product> and submit
    Then I verify "THANKYOU FOR THE ORDER." message displayed on screen.

    Examples: 
      | username						| password					| product					|
      | jmayer@gmail.com 		| Jmayer123 				| ADIDAS ORIGINAL |