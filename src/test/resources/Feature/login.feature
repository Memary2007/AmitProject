Feature:   Sign Up Page

  Scenario:  Verify that User Can Sign Up Successfully
    Given    Clicking Sign up button in the Header
    When     Fill in the username "mE58545"
    And      Fill in the Password "M@1233456"
    And      Clicking Sign up button
    Then    A success message should be displayed: "Sign up successful."

  Scenario:  Verify that Two Products Are Purchased Successfully
    Given    Clicking Log In button in the Header
    When     Fill in the username In Login Form "mE58545"
    And      Fill in the Password In Login Form"M@1233456"
    And      Clicking Log In button
    Then    The account should open successfully: "mE58545"