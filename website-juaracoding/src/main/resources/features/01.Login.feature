Feature: Login User

    #TC1
    Scenario: User input username and password null
    When User go to Web PtDika
    And User enter username and password null
		And User click button login valid
    Then User invalid credentials username and password
    
    #TC2
  	Scenario: User input username null
    When User enter username null
		And User klik button login valid
    Then User invalid credentials username
    
    #TC3
    Scenario: User input password null
    When User enter password null
		And User click button login valid
    Then User invalid credentials password   
      
    #TC4
    Scenario: User input username salah
    When User enter username salah
		And User klik button login
    Then gagal masuk username salah
    
    
    #TC5
    Scenario: User input password salah
    When User input password salah
		And klik button login
    Then gagal masuk password salah
    
    
    #TC6
    Scenario: User input username Uppercase
    When User enter username uppercase and password Valid
		And User klik login
    And User berhasil Login
    Then User click Logout
    
    
    #TC7
    Scenario: User valid login
    When User enter username password valid
    And User click button login
    Then User success login

    
 