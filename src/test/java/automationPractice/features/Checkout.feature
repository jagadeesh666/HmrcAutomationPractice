Feature: I want to add item to cart and  purchase item


    Background:
    Given User is on the home page
    When User selects SignIn link
    Then User should be on the login page
    When User enter email as "temp1242911417@gmail.com" and password as "abcde"
    And User selects SignIn

  #happy path scenario

  @checkout @smoke
  Scenario: Add product to cart
    Given I see search
    And I type search item "t-shirt"
    And I select search
    And I select a product"Faded Short Sleeve T-shirts"
    When I select AddItemToCart
    And I proceed to checkout
    Then I should see "Faded Short Sleeve T-shirts" in my Cart
