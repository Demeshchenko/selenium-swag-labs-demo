Feature: Saucedemo login

  @SmokeTest
  Scenario: Login as standard user

    When I open "home" page
    Then I provide "standard.user.name" userName
    And I provide "valid.password" password
    And I click Login button
    Then I verify that Products page is opened

  @SmokeTest
  Scenario: Login as standard user with invalid password

    When I open "home" page
    Then I provide "standard.user.name" userName
    And I provide "invalid.password" password
    And I click Login button
    Then I verify that "password.do.not.match" validation message is shown

  @SmokeTest
  Scenario: Login as locked user

    When I open "home" page
    Then I provide "locked.user.name" userName
    And I provide "valid.password" password
    And I click Login button
    Then I verify that "user.is.locked" validation message is shown
