Feature: I want to add item to cart so i can  purchase the item

Background:
    Given User is on the home page

  #happy path scenario

  @search @smoke
  Scenario: select most expensive dress to add it to cart
    Given I see search
    And I type search item "dress"
    And I select search
    And I select most expensive dress "Printed Dress"
    When I select AddItemToCart
    Then I should see message "Product successfully added to your shopping cart"

  @search @smoke
  Scenario: Add item to cart from search
    Given I see search
    And I type search item "t-shirt"
    And I select search
    And I select a product"Faded Short Sleeve T-shirts"
    When I select AddItemToCart
    Then I should see message "Product successfully added to your shopping cart"

