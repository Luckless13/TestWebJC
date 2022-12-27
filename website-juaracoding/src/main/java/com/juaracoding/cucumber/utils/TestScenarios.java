package com.juaracoding.cucumber.utils;

public enum TestScenarios {
//	Login
//	T1("User invalid login"),
//	T2("User invalid login"),
//	T3("User invalid login"),
//	T4("User invalid login"),
//	T5("User invalid login"),
//	T6("User valid login"),
//  T7("User valid login"),
	
//	Testimonial
    T8("Berada di Testimonial"),
	T9("Tambah Testimonial null"),
	T10("Tambah Testimonial nama dan content null"),
	T11("Tambah Testimonial content null"),
	T12("Tambah Testimonial nama null"),
	T13("Tambah Testimonial foto null"),
	T14("Tambah Testimonial foto pdf"),
	T15("Tambah Testimonial Success");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
