Feature: Saucedemo order

  @SmokeTest
  @debug
  Scenario:Order product as standard user

    When I open "home" page
    Then I provide "standard.user.name" userName
    And I provide "valid.password" password
    And I click Login button
    Then I verify that Products page is opened

    When I add Fleece Jacket to cart
    Then I verify that Cart counter is displayed with value 1

    When I click Cart button
    And I Verify that Fleece Jacket is displayed in the Cart

    When I click Checkout button
    Then I provide "first.name" First Name
    And I provide "last.name" Last Name
    And I provide "postal.code" Zip/Postal Code
    And I click Continue button
    Then I verify that payment Information is displayed

    When I click Finish button
    Then I verify that Checkout: complete page is opened