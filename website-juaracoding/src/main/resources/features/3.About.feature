Feature: Form about
#1
Scenario: Tampilan form about
			When Klik about
			Then Berada di form about
#2			
Scenario: Kosongkan file foto
			When Berada di halaman about
			And Klik button tambah
			And Klik choose file kosongkan file
			And Isi nama trainer
			And Isi jabatan trainer
			And Isi profile
			And Publish no aktif
			And Klik simpan
			Then Gagal simpan
#3	
Scenario: Kosongkan nama trainer
			When Klik choose file pilih poto nama null
			And Kosongkan nama trainer
			And Isi jabatan trainer nama null
			And Isi profile nama null
			And Publish aktive nama null
			And Klik simpan nama null
			Then Gagal menambahkan trainer nama null
#4	
#Scenario: Jenis file foto yang berbeda
#			When Klik choose file pilih foto pdf
#			And Isi nama trainer foto pdf
#			And Isi jabatan trainer foto pdf
#			And Isi profile foto pdf
#			And Publish no aktive foto pdf
#			And Klik simpan foto pdf
#			Then Gagal menambahkan trainer foto pdf
				
#5		
Scenario: Kosongkan jabatan trainer
			When Klik choose file jabatan null
			And Isi nama trainer jabatan null
			And Kosongkan jabatan trainer 
			And Isi profile jabatan null
			And Publish aktive jabatan null
			And Klik simpan jabatan null
			Then Gagal menambahkan trainer jabatan null
#6			
Scenario: Kosongkan profile trainer
			When Klik choose file profile null
			And Isi nama trainer profile null
			And Isi jabatan trainer profile null
			And Kosongkan profile 
			And Publish no aktive profile null
			And Klik simpan profile null
			Then Gagal menambahkan trainer profile null
			
#7		
Scenario: Tambah data trainer baru
			When Klik choose file photo lalu pilih photo
			And Isi nama trainer baru
			And Isi jabatan trainer baru
			And Isi profile baru
			And Publish aktive profile baru
			And Klik simpan profile baru
			Then Data berhasil di simpan