Feature: Edit Program

	#1
	Scenario: Edit program null
	When Click edit button
  And Hapus nama program
  And Hapus harga normal
  And Hapus diskon
  And Hapus keunggulan1
  And Hapus keunggulan2
  And Hapus keunggulan3
  And Hapus keunggulan4
  And Hapus keunggulan5
	And Click simpan program null
  Then Edit program null credential
  
  #2
  Scenario: Edit program nama program null
	When Edit nama program null
	And Click simpan nama program null
  Then Edit program nama program null credential
  
  #3
  Scenario: Edit program harga normal null
	When Edit harga normal null
	And Click simpan harga normal null
  Then Edit program harga normal null credential
  	
  #4
  Scenario: Edit program keunggulan1 null
	When Input keunggulan1 null
	And Click simpan keunggulan1 null
  Then Edit program keunggulan1 null credential
  	
  #5
  Scenario: Edit program keunggulan2 null
	When Input keunggulan2 null
	And Click simpan keunggulan2 null
  Then Edit program keunggulan2 null credential
  	
  #6
  Scenario: Edit program keunggulan3 null
	When Input keunggulan3 null
	And Click simpan keunggulan3 null
  Then Edit program keunggulan3 null credential
  	
  #7
  Scenario: Edit program keunggulan4 null
	When Input keunggulan4 null
	And Click simpan keunggulan4 null
  Then Edit program keunggulan4 null credential
  	
  #8
  Scenario: Edit program keunggulan5 null
	When Input keunggulan5 null
	And Click simpan keunggulan5 null
  Then Edit program keunggulan5 null credential
  
  #9
  Scenario: Edit program diskon null
	When Edit diskon null
	And Click simpan diskon null
  Then Edit program diskon null credential
  
  #10
  Scenario: Edit program
	When Input nama program baru
	And Input harga normal baru
	And Input diskon baru
	And Input keunggulan1 baru
  And Input keunggulan2 baru
  And Input keunggulan3 baru
  And Input keunggulan4 baru
  And Input keunggulan5 baru
	And Click simpan edit program baru
  Then Edit program credential