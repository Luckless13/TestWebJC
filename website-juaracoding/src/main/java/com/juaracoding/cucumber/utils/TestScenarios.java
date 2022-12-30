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
	T9 ("Menambahkan akun sosial media");
	

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
