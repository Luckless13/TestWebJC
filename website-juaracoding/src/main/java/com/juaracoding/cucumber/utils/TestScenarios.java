package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	
	T1("User invalid login"),
	T2("User invalid login"),
	T3("User invalid login"),
	T4("User invalid login"),
	T5("User invalid login"),
	T6("User valid login"),
    T7("User valid login"),
    T8("Page About"),
	T9("Page Blog"),
	T10("Page Contact Message"),
	T11("Page Peserta"),
	T12("Page Program"),
	T13("Page User"),
	T14("Page Gallery"),
	T15("Page Setting");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
