Feature: Form about

Scenario: Tampilan form about
      When Berada di halaman dashboard about
			And Klik about
			Then Berada di form about
			
Scenario: Tambah data trainer baru
			When Berada di halaman about
			And Klik button tambah
			And Klik choose file pilih foto
			And Isi nama trainer
			And Isi jabatan trainer
			And Isi profile
			And Publish aktive
			And Klik simpan
			Then Berhasil disimpan
		
#Scenario: Kosongkan chose fike foto
#			When Klik button tambah
#			And Klik choose file null
#			And Isi nama trainer
#			And Isi jabatan trainer
#			And Isi profile
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer
#			
#Scenario: Jenis file foto yang berbeda
#			When Klik button tambah
#			And Klik choose file pilih pdf
#			And Isi nama trainer
#			And Isi jabatan trainer
#			And Isi profile
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer
#			
#Scenario: Jenis file foto yang berbeda
#			When Klik button tambah
#			And Klik choose file pilih pdf
#			And Isi nama trainer
#			And Isi jabatan trainer
#			And Isi profile
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer
#			
#Scenario: Kosongkan nama trainer
#			When Klik button tambah
#			And Klik choose file 
#			And Nama trainer null
#			And Isi jabatan trainer
#			And Isi profile
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer
#			
#Scenario: Kosongkan jabatan trainer
#			When Klik button tambah
#			And Klik choose file 
#			And Isi nama trainer 
#			And Jabatan trainer null
#			And Isi profile
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer
#			
#Scenario: Kosongkan profile trainer
#			When Klik button tambah
#			And Klik choose file 
#			And Isi nama trainer 
#			And Isi jabatan trainer 
#			And Profile null
#			And Publish aktive
#			And Klik simpan
#			Then Gagal menambahkan trainer