Feature: Search Program

	#1
	Scenario: Tampilan Form Rincian Biaya
	When Go to Website PtDika
  And Click home button
	And Click Rincian Biaya
  Then Berada di page list Rincian Biaya
  
  #2
	Scenario: Search nama program null
  When Input nama program null
  And Enter nama program null
  Then Search nama program null credential
  
  #3
  Scenario: Search nama program lengkap dengan spasi dibelakang
  When Input nama program lengkap dengan spasi dibelakang
  And  Enter nama program lengkap dengan spasi dibelakang
  Then Search nama program lengkap dengan spasi dibelakang credential
  
  #4
  Scenario: Search nama depan program
  When Input nama depan program 
  And  Enter nama depan program
  Then Search nama depan program credential
	
	#5
	Scenario: Search nama belakang program
  When Input nama belakang program
  And  Enter nama belakang program
  Then Search nama belakang program credential
  
  #6
  Scenario: Search nama program lengkap
  When Input nama program lengkap
  And  Enter nama program lengkap
  Then Search nama program lengkap credential
  
  #7
  Scenario: Search harga normal null
  When Select harga normal
  And Input harga normal null
  And Enter harga normal null
  Then Search harga program null credential
  
  #8
  Scenario: Search harga normal huruf
  When  Input harga normal huruf
  And Enter harga normal huruf
  Then Search harga program null credential
  
  #9
  Scenario: Search harga normal
  When  Input harga normal
  And Enter harga normal
  Then Search harga normal credential
  
  #10
  #Scenario: Search diskon null
  #When Select diskon
  #And Input diskon null
  #And Enter diskon null
  #Then Search diskon null credential
  #
  #11
  #Scenario: Search diskon huruf
  #When  Input diskon huruf
  #And Enter diskon huruf
  #Then Search diskon null credential
  #
  #12
  #Scenario: Search diskon
  #When  Input diskon
  #And Enter diskon
  #Then Search diskon credential
  #
  #13
#Scenario: Search harga diskon null
  #When Select harga diskon
  #And Input harga diskon null
  #And Enter harga diskon null
  #Then Search harga diskon null credential
  #
  #14
  #Scenario: Search harga diskon huruf
  #When  Input harga diskon huruf
  #And Enter harga diskon huruf
  #Then Search harga diskon null credential
  #
  #15
  #Scenario: Search harga diskon
  #When  Input harga diskon
  #And Enter harga diskon
  #Then Search harga diskon credential
 