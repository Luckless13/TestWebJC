Feature: Form sosial media

Scenario: Tampilan form sosial media
			When Berada di halaman dashboard
			And Klik home
			And Klik sosial media
			Then Berada di page sosial media
			
Scenario: Menambahkan akun sosial media
			When Berada di halaman sosial media
			And Isi link facebook
			And Isi link instagram
			And Isi link youtube
			And Isi nomor whatsapp
			And Klik button simpan
			Then Berhasil disimpan

#Scenario: Kosongkan link facebook
#			When Berada di page sosial media
#			And Kosongkan link facebook
#			And Isi link instagram
#			And Isi link youtube
#			And Isi nomor whatsapp
#			And Klik button simpan
#			Then Gagal simpan data
#			
#Scenario: Kosongkan link instagram
#			When Berada di page sosial media
#			And Isi link facebook
#			And Kosongkan link instagram
#			And Isi link youtube
#			And Isi nomor whatsapp
#			And Klik button simpan
#			Then Gagal simpan data
#			
#Scenario: Kosongkan link youtube
#			When Berada di page sosial media
#			And Isi link facebook
#			And Isi link instagram
#			And Kosongkan link youtube
#			And Isi nomor whatsapp
#			And Klik button simpan
#			Then Gagal simpan data
#			
#Scenario: Kosongkan nomor whatsapp
#			When Berada di page sosial media
#			And Isi link facebook
#			And Isi link instagram
#			And Isi link youtube
#			And Kosongkan nomor whatsapp
#			And Klik button simpan
#			Then Gagal simpan data