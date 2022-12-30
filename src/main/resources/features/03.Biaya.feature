Feature: Form rincian biaya

Scenario: TC001 Menambah data rincian biaya
  When User Click menu home
  And User Click menu rincian biaya
  And User Click tambah
  And User Input nama program
  And User Input harga normal
  And User Input diskon
  And User Input Keunggulan1
  And User Input Keunggulan2
  And User Input Keunggulan3
  And User Input Keunggulan4
  And User Input Keunggulan5
  And User Select Publish
  And User Click Simpan
  Then Data telah BerhasiL di tambah

  Scenario: TC002 Menambah data rincian biaya
    When User Click tombol menu home
    And User Click tombol menu rincian biaya
    And User Click tombol tambah
    And User Input nama program02
    And User Input harga normal02
    And User Input Keunggulan01
    And User Input Keunggulan02
    And User Input Keunggulan03
    And User Input Keunggulan04
    And User Input Keunggulan05
    And User Select pilihan Publish
    And User Clik tombol Simpan
    Then tc02 Data BerhasiL di tambah

  Scenario: TC003 Menambah data rincian biaya
    When User tekan tombol menu home
    And User tekan tombol menu rincian biaya
    And User tekan tombol tambah
    And User Input harga normal3
    And User Input diskon3
    And User Input Keunggulan2
    And User Input Keunggulan3
    And User Input Keunggulan4
    And User Input Keunggulan5
    And User memilih Publish
    And User tekan tombol Simpan
    Then tc03 Data gagal di tambah

  Scenario: TC004 Menambah data rincian biaya
    When tc04 User Click menu home
    And tc04 User Click menu rincian biaya
    And tc04 User Click tambah
    And tc04 User Input nama program
    And tc04 User Input diskon
    And tc04 User Input Keunggulan1
    And tc04 User Input Keunggulan2
    And tc04 User Input Keunggulan3
    And tc04 User Input Keunggulan4
    And tc04 User Input Keunggulan5
    And tc04 User Select Publish
    And tc04 User Clik Simpan
    Then tc04 Data gagal di tambah

  Scenario: TC005 Menambah data rincian biaya
    When tc05 User Click menu home
    And tc05 User Click menu rincian biaya
    And tc05 User Click tambah
    And tc05 User Input nama program
    And tc05 User Input harga normal
    And tc05 User Input diskon
    And tc05 User Input Keunggulan2
    And tc05 User Input Keunggulan3
    And tc05 User Input Keunggulan4
    And tc05 User Input Keunggulan5
    And tc05 User Select Publish
    And tc05 User Clik Simpan
    Then tc05 Data gagal di tambah

  Scenario: TC006 Menambah data rincian biaya
    When tc06 User Click menu home
    And tc06 User Click menu rincian biaya
    And tc06 User Click tambah
    And tc06 User Input nama program
    And tc06 User Input harga normal
    And tc06 User Input diskon
    And tc06 User Input Keunggulan1
    And tc06 User Input Keunggulan3
    And tc06 User Input Keunggulan4
    And tc06 User Input Keunggulan5
    And tc06 User Select Publish
    And tc06 User Clik Simpan
    Then tc06 Data BerhasiL di tambah

  Scenario: TC007 Menambah data rincian biaya
    When tc07 User Click menu home
    And tc07 User Click menu rincian biaya
    And tc07 User Click tambah
    And tc07 User Input nama program
    And tc07 User Input harga normal
    And tc07 User Input diskon
    And tc07 User Input Keunggulan1
    And tc07 User Input Keunggulan2
    And tc07 User Select Publish
    And tc07 User Clik Simpan
    Then tc07 Data BerhasiL di tambah

  Scenario: TC008 Menambah data rincian biaya
    When tc08 User Click menu home
    And tc08 User Click menu rincian biaya
    And tc08 User Click tambah
    And tc08 User Input nama program
    And tc08 User Input harga normal
    And tc08 User Input diskon
    And tc08 User Input Keunggulan1
    And tc08 User Input Keunggulan2
    And tc08 User Clik Simpan
    Then tc08 Data gagal di tambah