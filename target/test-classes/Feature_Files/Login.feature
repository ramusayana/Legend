Feature: Login page of Bugzila
  To test the Login page of  Bugzila website
  @smoke
  Scenario: Login with valid  Username and Password

    Given  I should be  at the Login page
    And    I provide valid  Username and Password
    When   I click on Login button
    Then   I should be able to login inside the budzila
    And    The title of webpage should be  Bugzila main page
