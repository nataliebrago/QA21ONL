Feature: result Test

  Scenario: User byes 1 item
    Given start browser
    * open login page
    When user logs into the site with username standard_user and password secret_sauce
    * user adds one item to the cart
    * user opens the cart
    * user clicks continue button
    * user fills in first name Natalya last name Brago and postal code 224024