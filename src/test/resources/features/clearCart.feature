Feature: Saucedemo order

  @SmokeTest
  @debug
  Scenario:Clear product form cart as standard user

    When I open "home" page
    Then I provide "standard.user.name" userName
    And I provide "valid.password" password
    And I click Login button
    Then I verify that Products page is opened

    When I add Fleece Jacket to cart
    Then I verify that Cart counter is displayed with value 1

    When I click Remove button
    Then I verify that Cart is empty

    When I add Fleece Jacket to cart
    Then I verify that Cart counter is displayed with value 1

    When I click Cart button
    And I Verify that Fleece Jacket is displayed in the Cart

    When I click Remove button
    Then I Verify that Fleece Jacket is not displayed in the Cart
