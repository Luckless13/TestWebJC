Feature: Form Testimonial
	
	#0
	Scenario: Tampilan Form Testimonial
	When Go to Web PtDika
  And Click home
	And Click Testimonial
  Then Berada di page list testimonial
	
	#1
  Scenario: Tambah Testimonial null
  When Click tambah
  And Click choose file null
	And Input nama peserta testimonial null
  And Select publish status testimonial null
  And Input content testimonial null
  And Select rating testimonial null
  And Click simpan testimonial null
  Then Testimonial null credential
  
  #2
  Scenario: Tambah Testimonial nama dan content null
  When Click choose file lalu pilih foto testimonial nama dan content null
	And Input nama peserta testimonial nama dan content null
  And Select publish status testimonial nama dan content null
  And Input content testimonial nama dan content null
  And Select rating testimonial nama dan content null
  And Click simpan testimonial nama dan content null
  Then Testimonial nama dan content null credential
  
  #3
  Scenario: Tambah Testimonial content null
  When Click choose file lalu pilih foto testimonial content null
	And Input nama peserta testimonial content null
  And Select publish status testimonial content null
  And Input content testimonial null testimonial content null
  And Select rating testimonial content null
  And Click simpan testimonial content null
  Then Testimonial content null credential
  
  #4
  Scenario: Tambah Testimonial nama null
  When Click choose file lalu pilih foto testimonial nama null
	And Input nama peserta testimonial nama null
  And Select publish status testimonial nama null
  And Input content testimonial nama null
  And Select rating testimonial nama null
  And Click simpan testimonial nama null
  Then Testimonial nama null credential
  
  #5
  Scenario: Tambah Testimonial foto null
  When Click choose file lalu pilih foto null
  And Input nama peserta testimonial foto null
  And Select publish status testimonial foto null
  And Input content testimonial testimonial foto null
  And Select rating testimonial foto null
  And Click simpan testimonial foto null
  Then Testimonial foto null credential
  
  #6
  Scenario: Tambah Testimonial foto pdf
  When Click choose file lalu pilih foto pdf
  And Input nama peserta testimonial foto pdf
  And Select publish status testimonial foto pdf
  And Input content testimonial testimonial foto pdf
  And Select rating testimonial foto pdf
  And Click simpan testimonial foto pdf
  Then Testimonial foto pdf credential
  
  #7
  #Scenario: Tambah Testimonial 
  #When Click choose file lalu pilih foto
  #And Input nama peserta 
  #And Select publish status
  #And Input content testimonial
  #And Select rating
  #And Click simpan
  #Then Add Testimonial success credential