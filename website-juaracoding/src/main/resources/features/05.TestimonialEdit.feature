Feature: Testimonial Edit
	
	#1
	Scenario: Edit Testimonial nama null
	When Click nama peserta yang dicari
  And Input nama null
	And Click simpan nama null
  Then Edit Testimonial nama null credential
  
  #2
  Scenario: Edit Testimonial isi testimoninal null
	When Input isi testimonial null
	And Click simpan isi testimoninal null
  Then Edit Testimonial isi testimoninal null credential
  
  #3
  Scenario: Edit Testimonial nama dan isi testimoial null
	When Input nama dan isi testimoial null
	And Click simpan nama dan isi testimoial null
  Then Edit Testimonial nama dan isi testimoial null credential
  
  #4
  Scenario: Edit Testimonial foto pdf
	When Click pilih gambar ulang lalu pilih foto pdf
	And Click simpan foto pdf
  Then Edit Testimonial foto pdf credential
  
  #5
	Scenario: Edit Testimonial
	When Input nama peserta baru
  And Select publish status baru
  And Input isi testimonial baru
  And Select rating baru
	And Click simpan
  Then Edit Testimonial credential
  