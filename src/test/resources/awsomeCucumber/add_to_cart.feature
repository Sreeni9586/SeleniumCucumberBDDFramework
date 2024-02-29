@featureTagStore
Feature: Add From Store

  @scenario1
  Scenario: Add one quantity to the cart
    Given I'm on the Store Page
    When I add a "Blue Shoes" to the cart
    Then I should see 1 "Blue Shoes" in the cart

    @scenario2
    Scenario Outline: Add one quantity to the cart from Store
      Given I'm on the Store Page
      When I add a "<product_name>" to the cart
      Then I should see 1 "<product_name>" in the cart
      Examples:
        | product_name |
        | Blue Shoes   |
        | Black Over-the-shoulder Handbag |
        | Anchor Bracelet  |