Feature: Add Cart Item

  Scenario: User add cart jeans product item
    When User click jeans product
    And User pick jeans product color
    And User pick jeans product size
    And User click addcart button on jeans product
    And User click cart icon for jeans view
    Then Showing jeans product after add to cart

  Scenario: User add cart coat product item
    When User click coat product
    And User pick coat product color
    And User pick coat product size
    And User click addcart button on jeans product
    And User click cart icon for coat view
    Then Showing coat product after add to cart