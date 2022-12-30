Feature: Form sosial media
#1
Scenario: Tampilan form sosial media
			When Berada di halaman dashboard
			And Klik home
			And Klik sosial media
			Then Berada di page sosial media
#3
Scenario: Kosongkan link facebook
      When Berada di halaman sosial media
			And Kosongkan link fb
			And Isi link instagram link fb null
			And Isi link youtube link fb null
			And Isi nomor whatsapp link fb null
			And Klik button simpan fb null
			Then Gagal simpan data
		
Scenario: Kosongkan link instagram
			When Isi link facebook link instagram null
			And Kosongkan link instagram
			And Isi link youtube link instagram null
			And Isi nomor whatsapp link instagram null
			And Klik button simpan link instagram null
			Then Gagal simpan data link instagram null
		
Scenario: Kosongkan link youtube
			When Isi link facebook yt null
			And Isi link instagram yt null
			And Kosongkan link youtube
			And Isi nomor whatsapp yt null
			And Klik button simpan yt null
			Then Gagal simpan data yt null
			
Scenario: Kosongkan nomor whatsapp
			When Isi link facebook wa null
			And Isi link instagram wa null
			And Isi link youtube wa null
			And Kosongkan nomor whatsapp
			And Klik button simpan wa null
			Then Gagal simpan data wa null
			
#2		
Scenario: Menambahkan akun sosial media
			When Isi link facebook
			And Isi link instagram
			And Isi link youtube
			And Isi nomor whatsapp
			And Klik button simpan
			Then Berhasil disimpan