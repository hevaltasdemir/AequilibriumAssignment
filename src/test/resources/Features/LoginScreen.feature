Feature: LoginScreen

  Background:
    Given Launch a web browser to go to Swaglabs login page

  @TC_1
  Scenario: As a user I have to login application with valid username and password
    Then Enter a valid username as a "standard_user" and password as a "secret_sauce"
    Then Click on login button
    And Verify the products page to make sure success login


  @TC_2
  Scenario: As a user I want to get a message when I enter invalid username
    Then Enter a invalid username as a "hevaltasdemir" and valid password as a "secret_sauce"
    Then Click on login button
    And Verify the error message "Epic sadface: Username and password do not match any user in this service"


  @TC_3
  Scenario: As a user I wont to get a message when I enter invalid password
    Then Enter a valid username as a "standard_user" and invalid password as a "123456"
    Then Click on login button
    And Verify the error message "Epic sadface: Username and password do not match any user in this service"


  @TC_4
  Scenario: As a user I want to get a message when I don't enter username
    Then Do not enter username
    Then Enter a valid password as a "secret_sauce"
    Then Click on login button
    And Verify the error message "Epic sadface: Username is required"

  @TC_5
  Scenario: As a user I want to get a message when I don’t enter password
    Then Enter a valid username as a "standard_user"
    Then Do not enter password
    Then Click on login button
    And Verify the error message "Epic sadface: Password is required"

  @TC_6
  Scenario: As a user I want to get a message when I try to login with locked account
    Then Enter a locked account's username as a "locked_out_user" and password as a "secret_sauce"
    Then Click on login button
    And Verify the error message "Epic sadface: Sorry, this user has been locked out."

  @TC_7
  Scenario: As a user I want to to click on x button to delete credentials when I enter invalid credentials
    Then Enter a invalid username as a "hevaltasdemir" and valid password as a "secret_sauce"
    Then Click on login button
    Then Click on x button beside the username
    And Verify username has been deleted

  @TC_8
  Scenario: As a user I want to to click on x button to delete credentials when I enter invalid credentials
    Then Enter a invalid username as a "hevaltasdemir" and valid password as a "secret_sauce"
    Then Click on login button
    Then Click on x button beside the password
    And Verify password has been deleted