Feature: Swag Labs

  Background: 
    Given User navigates to Swag Labs website "https://www.saucedemo.com/"
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks Login button

  @swag
  Scenario: User should be logged in to the Swag Labs successfully
    Then User should be logged in

  @swag
  Scenario: To verify if we click on Add to cart button then number 1 is displayed over the cart icon and if we click remove then it gets disappered
    When User clicks Add to cart button
    Then The same button should be turned into "Remove" button
    And Number "1" should be displayed over the cart icon
    When User clicks Remove button
    Then The same button should be turned into "Add to cart" button
    And Number "1" should be disappeared over the cart icon

  @swag
  Scenario: User clicks cart icon, it should navigate to cart page and when click continue shopping navigates back to product page
    When User clicks cart icon
    Then User should land on cart page
    When User clicks continue shopping
    Then User should get back to product page

  @swag
  Scenario: Pop up should be displayed when moving the cursor to the products
    When User clicks burger icon
    And User clicks About
    And User moves cursor to products option
    Then Pop up should be displayed

  @swag
  Scenario: On mouse hover link color should be changed to green
    When User hovers Sauce Labs Backpack link
    Then Colour of link should be changed to green
