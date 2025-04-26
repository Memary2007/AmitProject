Feature:   Sign Up Page

  Scenario:  Verify that User Can Sign Up Successfully
    Given    Clicking Sign up button in the Header
    When     Fill in the username "mE5854577"
    And      Fill in the Password "M@1233456"
    And      Clicking Sign up button
    Then    A success message should be displayed: "Sign up successful."

  Scenario:  Verify that Two Products Are Purchased Successfully
    Given    Clicking Log In button in the Header
    When     Fill in the username In Login Form "mE5854577"
    And      Fill in the Password In Login Form"M@1233456"
    And      Clicking Log In button
    Then    The account should open successfully: "mE5854577"
    When    Clicking Catagory Laptops
    And     select items "Sony vaio i5"
    And     Add Product To Cart from Product page
    Then    A success message should be displayed: "Product added."
    When    Accept Alrt
    And     Navagite Back
    And     Navagite Back
    And      select items "Sony vaio i7"
    And     Add Product To Cart from Product page
    Then    A success message should be displayed: "Product added."
    When    Accept Alrt
    And  Click On Cart Page Link
    Then Check item "Sony vaio i5" name and price to be "790"
    And Check item "Sony vaio i7" name and price to be "790"
    And check total calculated amount is equal to "1580"
    When click on place order button
    Then check total calculated amount from order form is equal to "1580"
    When enter name "Mohamed"
    And  enter country "Egypt"
    And enter City "Giza"
    And enter credit card "378282246310005"
    And enter year "2026"
    And enter month "11"
    And click on Purchase Button
    Then    A confirmation message should be displayed: "Thank you for your purchase!"


