Feature: Retail Account Page

Background:
	Given User is on retail website homepage
	When User click on the login link
	And User enter email 'tawfiq.ahmad@tekschool.us' and password 'Roqya2627$'
	And User click on login button
	Then Verify user is logged in

@updatePI
Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'GuardiansTAA' and Phone '7034445556'
    And User click on Update button
    Then user profile information should be updated

@addPaymentMethod
Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |2223334445556660|Kabuljan|10|2025|700|
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'
    
@UpdatePaymentMethod
Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User select payment card
    And User click on Edit option of card section
    And user edit information with below data
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |2223334445556661 | Kabuljan|09 |2023 |501|
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’
    
    
@RemovePaymentMethod
Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User select payment card
    And User click on remove option of card section
    Then payment details should be removed
    
@addAddress
Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
    |country|fullName|phoneNumber|streetAddress|apt|city |state|zipCode|
    |countryValue|fullnameValue|phoneValue|stAddress|aptValue|cityValue|stateValue|zipCodeValue|
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'
    
@EditAddress
 Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
    |country|fullName|phoneNumber|streetAddress|apt |city| state |zipCode|
    |countryValue|fullnameValue|phoneValue|stAddress|aptValue|cityValue|stateValue|zipCodeValue|
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’
    
    
 @RemoveAddress   
 Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed