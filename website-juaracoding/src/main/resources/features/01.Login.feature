Feature: Login User

  Scenario: User valid login
    When User go to Web PtDika
    And User enter username password valid
    And User click button login
    Then User success login
