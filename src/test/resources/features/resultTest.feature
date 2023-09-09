Feature: result Test

  Scenario: User byes T-Shirt (Red)
    Given start browser
    * open login page
    When user logs in to the site with username standard_user and password secret_sauce
    * user adds one item to the cart
    * user opens the cart
    * user clicks checkout button
    * user fills in first name Natalya last name Brago and postal code 224024
    * user clicks continue button
    * user clicks the finish button
    Then the message is displayed after checkout "Thank you for your order!"