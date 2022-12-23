package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	
	T1("User invalid login"),
	T2("User invalid login"),
	T3("User invalid login"),
	T4("User invalid login"),
	T5("User invalid login"),
	T6("User valid login"),
    T7("User valid login"),
    T8("Dashboard user function");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
