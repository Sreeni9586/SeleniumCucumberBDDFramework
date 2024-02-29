@featureTagCart
Feature: Place an Order as Guest

  Scenario: using default payment option
    Given I am a guest customer
    And I have a product in the cart
    And I am on the checkout Page
    And my billing details are
      | firstName | lastName | country            | addressLine1      | city  | state | zip   | email               |
      | demo      | user     | United States (US) | 6300 Spring Creek | Plano | Texas | 75024 | sreeni@testmail.com |
    And I Place an order
    Then the order should be placed successfully