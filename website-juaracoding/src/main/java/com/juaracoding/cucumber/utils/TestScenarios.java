package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	T1("User valid login"),
    T2("User invalid login"),
    T3("Dashboard user function"),
	T4 ("Tampilan form sosial media"),
	T5 ("Kosongkan link facebook"),
	T6("Kosongkan link instagram"),
	T7 ("Kosongkan link youtube"),
	T8 ("Kosongkan nomor whatsapp"),
	T9 ("Menambahkan akun sosial media"),
	T10("Tampilan form about"),
	T11("Kosongkan file foto"),
	T12("Kosongkan nama trainer"),
	T13("Jenis file foto yang berbeda"),
	T14("Kosongkan jabatan trainer"),
	T15("Search nama peserta tiga huruf depan"),
	T16("Search nama peserta tiga huruf belakang"),
	T17("Search nama peserta"),
	T18("Page grid");
//	T19("Edit data trainer foto pdf");
//	T20("Edit data trainer nama null"),
//	T21("Edit data trainer jabatan null"),
//	T22("Edit data trainer profile null"),
//	T23("Edit data trainer lengkap");
	
	

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
