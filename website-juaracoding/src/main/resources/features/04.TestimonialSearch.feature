Feature: Testimonial Search
	
	#1
	Scenario: Form Testimonial
	When Web PtDika
  And Home
	And Testimonial
  Then Page list testimonial
  
  #2
  Scenario: Go to next page valid
  When Scroll down valid
  And Click grid page valid
  Then Next page valid credential
  
  #3
  Scenario: Go to next page invalid
  When Scroll down invalid
  And Click grid page invalid
  Then Next page invalid credential
  
  #4
  Scenario: Search nama peserta null
  When Input nama peserta null
  And Enter nama peserta null
  Then Search nama peserta null credential
  
  #5
  Scenario: Search nama peserta lengkap dengan spasi dibelakang
  When Input nama peserta lengkap dengan spasi dibelakang
  And  Enter nama peserta lengkap dengan spasi dibelakang
  Then Search nama peserta lengkap dengan spasi dibelakang credential
  
  #6
  Scenario: Search nama depan peserta
  When Input nama nama depan peserta 
  And  Enter nama nama depan peserta
  Then Search nama depan peserta credential
  
  #7
  Scenario: Search nama belakang peserta
  When Input nama belakang peserta
  And  Enter nama belakang peserta
  Then Search nama belakang peserta credential
  
  #8
  Scenario: Search nama peserta lengkap
  When Input nama peserta lengkap
  And  Enter nama peserta lengkap
  Then Search nama peserta lengkap credential
   