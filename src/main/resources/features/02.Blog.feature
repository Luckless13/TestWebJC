Feature: Menu Blog

  Scenario: TCC Blog 001 Menu Blog
    When User click Blog Menu tc001
    And User Click Tambah
    Then Masuk ke halaman tambah Blog

  Scenario: TCC Blog 002 Menu Blog
    When User click Blog Menu tc002
    And User input nama blog
    Then Tampil Hasil Pencarian

  Scenario: TCC Blog 003 Menu Blog
    When User click Blog Menu tc003
    And User Click list data
    Then Tampil Menu edit Blog

  Scenario: TCC Blog 004 Menu Blog
    When User click Blog Menu tc004
    And User Click page grid
    Then Tampil List blog dan data lain

  Scenario: TCC Blog 001 Menu tambah Blog valid
    When User click Blog Menu tc005
    And User Click Tambah tc005
    And User Choose file pilih foto
    And User Input Judul Blog
    And User Select Active atau No Active
    And User Select YES atau NO
    And User Input Conten Preview
    And User Input Content
    And User Clik Simpan
    Then Data BerhasiL di tambah

  Scenario: TCC002 Menu tambah invalid
    When User click Blog Menu tc006
    And User Click Tambah tc006
    And User Clik Simpan tc006
    Then Data Tidak BerhasiL di tambah tc006

  Scenario: TCC Blog 003 Menu tambah Blog invalid
    When User click Blog Menu tc007
    And User Click Tambah tc007
    And User Input Judul Blog tc007
    And User Select Active atau No Active tc007
    And User Select YES atau NO tc007
    And User Input Conten Preview tc007
    And User Input Content tc007
    And User Clik Simpan tc007
    Then Data Tidak BerhasiL di tambah tc007

  Scenario: TCC Blog 004 Menu tambah Blog invalid
    When User click Blog Menu tc008
    And User Click Tambah tc008
    And User Choose File Pilih Foto tc008
    And User Select Active atau No Active tc008
    And User Select YES atau NO tc008
    And User Input Conten Preview tc008
    And User Input Content tc008
    And User Clik Simpan tc008
    Then Data Tidak BerhasiL di tambah tc008

  Scenario: TCC Blog 005 Menu tambah Blog invalid
    When User click Blog Menu tc009
    And User Click Tambah tc009
    And User Choose File Pilih Foto tc009
    And User Input Judul Blog tc009
    And User Select Active atau No Active tc009
    And User Select YES atau NO tc009
    And User Input Content tc009
    And User Clik Simpan tc009
    Then Data Tidak BerhasiL di tambah tc009

  Scenario: TCC Blog 006 Menu tambah Blog invalid
    When User click Blog Menu tc010
    And User Click Tambah tc010
    And User Choose File Pilih Foto tc010
    And User Input Judul Blog tc010
    And User Select Active atau No Active tc010
    And User Select YES atau NO tc010
    And User Input Conten Preview tc010
    And User Clik Simpan tc010
    Then Data Tidak BerhasiL di tambah tc010

  Scenario: TCC Blog 006 Menu Edit Blog invalid
    When User click Blog Menu tc011
    And User Click List Blog tc011
    And User Select Active atau No Active tc011
    And User Select YES atau NO tc011
    And User Input Conten Preview tc011
    And User Input Content tc011
    And User Clik Simpan tc011
    Then Data berhasil di ubah tc011

