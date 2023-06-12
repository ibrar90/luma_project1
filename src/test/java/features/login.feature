
Feature: Login Feature
  Background:
    Given User in LUMA customer login page

  Scenario:users should be able to login with valid credentials
      When  user enter valid  email address
      And user enter valid password
      And user clicks on sign in button
      Then user should be successfully sign in
  Scenario:users should not able to login with invalid email and valid password
    When  user enter invalid  email address
    And user enter valid password
    And user clicks on sign in button
    Then user should able to see error message

  Scenario:users should not  able to login with valid email and invalid password
    When  user enter valid  email address
    And user enter invalid password
    And user clicks on sign in button
    Then user should able to see error message

Scenario: Existing user should be able to login
  And login

  Scenario: