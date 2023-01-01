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
Scenario: Jenis file foto yang berbeda
			When Klik choose file pilih foto pdf
			And Isi nama trainer foto pdf
			And Isi jabatan trainer foto pdf
			And Isi profile foto pdf
			And Publish no aktive foto pdf
			And Klik simpan foto pdf
			Then Gagal menambahkan trainer foto pdf
				
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
			
		
#8
Scenario: Search nama peserta tiga huruf depan
		When Input nama tiga huruf depan
		And Klik enter tiga huruf depan
		Then Tampil hasil pencarian tiga huruf depan
		
#9
Scenario: Search nama peserta tiga huruf belakang
		When Input nama tiga huruf belakang
		And Klik enter tiga huruf belakang
		Then Tampil hasil pencarian tiga huruf belakang
		
#10
Scenario: Search nama peserta
		When Input nama
		And Klik enter
		Then Tampil hasil pencarian
		
#11
Scenario: Page grid
    When Klik page grid
    Then Tampil List trainer dan data lain
    
#12
#Scenario: Edit data trainer foto pdf edit
#		When Klik satu list data trainer foto pdf edit
#		And Berda di halaman edit data trainer foto pdf edit
#		And Input nama file foto pdf edit
#		And Pilih foto pdf edit
#		And Isi nama trainer foto pdf edit 
#		And Isi jabatan foto pdf edit
#		And Isi profile foto pdf edit
#		And Pilih publish aktive foto pdf edit
#		And Klik Simpan foto pdf edit
#		Then Data gagal di edit foto pdf edit
#		
#13
#Scenario: Edit data trainer nama null edit
#		When Input nama file foto nama null
#		And Pilih foto ulang nama null
#		And kosongkan nama trainer nama null edit
#		And Isi jabatan nama null edit
#		And Isi profile nama null edit
#		And Pilih publish no aktive nama null edit
#		And Klik Simpan nama null edit
#		Then Data gagal di edit nama null edit
#	
#14
#Scenario: Edit data trainer jabatan null
#		When Pilih foto ulang jabatan null
#		And Isi nama trainer jabatan null
#		And Kosongkan jabatan jabatan null
#		And Isi profile jabatan null
#		And Pilih publish aktive jabatan null
#		And Klik Simpan jabatan null
#		Then Data gagal di edit jabatan null
#		
#15
#Scenario: Edit data trainer profile null
#		When Pilih foto ulang profile null
#		And Isi nama trainer profile null
#		And Isi jabatan profile null
#		And Kosongkan profile profile null
#		And Pilih publish no aktive profile null
#		And Klik Simpan profile null
#		Then Data gagal di edit profile null
#		
#16
#Scenario: Edit data trainer lengkap
#		When Pilih foto ulang lengkap
#		And Isi nama trainer lengkap
#		And Isi jabatan lengkap
#		And Isi profile lengkap
#		And Pilih publish aktive lengkap
#		And Klik Simpan lengkap
#		Then Data berhasil diedit