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
//	T13("Jenis file foto yang berbeda"),
	T13("Kosongkan jabatan trainer");
	

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
