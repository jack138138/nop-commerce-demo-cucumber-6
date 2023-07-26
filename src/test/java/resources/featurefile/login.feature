Feature: Login Test
  As user I want to login into nop commerce website

  @smoke, @regression
  Scenario: User should navigate to login page successfully
    Given  I am on homepage
    When I click on login link
    Then Welcome message is displayed

  @sanity, @regression
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "Jack@gmail.com"
    And I enter password "Jack122"
    And I click on login button
    Then I should see the error message

  @regression
  Scenario: Verify user should login successfully with valid credentials
    Given I am on homepage
    When  I click on login link
    And I enter email "Jackdfg25p89r45w@gmail.com"
    And I enter password "abcd123"
    And  I click on login button
    Then  I should see the logout Button


  Scenario:  Verify user should logout successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "Jackdfg25p89r45w@gmail.com"
    And I enter password "abcd123"
    And I click on login button
    And  I should see the logout link
    And I click on logout button
    Then I should see login link











  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    And I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
