Feature: Register Test

  @smoke, @regression
  Scenario: Verify User should Navigate to Register page successfully
    Given I am on homepage
    When I click on register link
    Then I should see the Registration Link

  @sanity, @regression
  Scenario: Verify that FirstName, Last Name, Email, Password and Confirm Password Fields Are Mandatory
    Given I am on homepage
    When I click on register link
    When I click  on REGISTER button
    Then I should see the error message that "First Name is required."
    And I should see the error message that is "Last name is required."
    And I should see the error message thatE "Email is required."
    And I should see the error message thatpw  "Password is required."
    And I should see the error message thatpwr "Password is required."

  @regression
  Scenario: Verify that User should Create Account Successfully
    Given I am on homepage
    When I click on register link
    And I select gender "Male"
    And I enter firstname "Jack"
    And I enter lastname "Sparrow"
    And I select date of birth day "15"
    And I select date of birth month "January"
    And I select date of birth year "1999"
    And I enter the email address "Jackdfg25p89r45w@gmail.com"
    And I enter the password "abcd123"
    And I enter the confirm password "abcd123"
    And I click  on REGISTER button
    Then I should see the message "your registration completed"









#  Scenario: User should create account successfully
#    Given I am on homepage
#    When I click on register link
#    And I enters following users details
#      | Jay  | Vaghani    | jay@gmail.com  | 07878451263 | Harrow |
#      | Amit | Kathrotiya | amit@gmail.com | 07878451285 | Luton  |
#      | Aum  | Vaghani    | aum@gmail.com  | 07878454585 | Harrow |
#    Then registration successful