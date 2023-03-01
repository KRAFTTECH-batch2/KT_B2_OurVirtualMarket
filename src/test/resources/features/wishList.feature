
Feature: Wish List Functionality
@wish
  Scenario: The user clicks on "add to cart" button, the product is added to "shopping cart" list successfully
    Given The user is on the login page
    When The user should input "krafttest@proje.com" and "test123"
    And The user should go to homepage and add at least two products at the My Wish List
    And The user click wish list button on home page
    And The user click Add to cart button of any product
    Then The user should be able to see message as "Added to cart successfully. What is next?"
