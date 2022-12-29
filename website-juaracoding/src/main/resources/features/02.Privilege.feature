Feature: Privilege

#Positif

    #TC1
    Scenario: Menampilkan halaman trainer
    When user klik navbar about
    Then User berada pada halaman trainer
    
    #TC2
    Scenario: Menampilkan halaman blog
    When User klik navbar blog
    Then User berada pada halaman blog
    
     #TC3
    Scenario: Menampilkan halaman Contact Messages
    When User klik navbar Contact Messages
    Then User berada pada halaman Contact Messages 
    
     #TC4
    Scenario: Menampilkan halaman Gallery
    When User klik navbar Gallery
    Then User berada pada halaman Gallery
    
		 #TC5
    Scenario: Menampilkan halaman Home
    When User klik navbar Home
    Then Menampilkan menu pada home
    
    