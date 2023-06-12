Feature: Signup Feature
@smoke
  Scenario: users are able to create new account
    Given User in LUMA customer login page
     And user click on 'Create an Account' button
    And user enter FirstName and LastName
    And user enter valid email address
    And user enter password
    And user enter confirm password
    When user click on Create an Account button on bottom
  Then user should be able to get  new sign up account



  Scenario Outline: Create a new user with given list
    Given User in LUMA customer login page
    And user click on "Create an Account" button
    And user enter "<First>" and "<Last>" Name
    And user enter valid email address
    And user enter password
    And user enter confirm password
    When user click on Create an Account button on bottom
    Then user should be able to get  new sign up account
    Examples:
      |First|Last|
      |reddy   |anq|
      |Turag|Khanl|
      |Imran |Chykt|
      |Kajol |Monim|



