Feature: User search

  Scenario: User search product for product not found
    When User click button search for product not found
    And User enter hat product
    And User press enter for product not found
    Then Showing text message no product were found

  Scenario: User search product item
    When User click button search
    And User enter jeans product
    And User press enter
    Then Showing jeans products