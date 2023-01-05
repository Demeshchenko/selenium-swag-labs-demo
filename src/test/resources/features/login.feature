Feature: Saucedemo login

  Scenario: Login as standard user

    When I open "home" page
    Then I provide "standard.user.name" userName
    And I provide "valid.password" password
    And I click Login button
#    Then I should see products
