package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User valid login"),
    T2("TCC Blog 001 Menu Blog"),
    T3("TCC Blog 002 Menu Blog"),
    T4("TCC Blog 003 Menu Blog"),
    T5("TCC Blog 004 Menu Blog"),
    T6("TCC Blog 001 Menu tambah Blog valid"),
    T7("TCC blog 002 Menu tambah blog invalid"),
    T8("TCC Blog 003 Menu tambah Blog invalid"),
    T9("TCC Blog 004 Menu tambah Blog invalid"),
    T10("TCC Blog 005 Menu tambah Blog invalid"),
    T11("TCC Blog 006 Menu tambah Blog invalid"),
    T12("TCC Blog 007 Menu tambah Blog invalid"),
    T13("TC001 Menambah data rincian biaya"),
    T14("TC002 Menambah data rincian biaya"),
    T15("TC003 Menambah data rincian biaya"),
    T16("TC004 Menambah data rincian biaya"),
    T17("TC005 Menambah data rincian biaya"),
    T18("TC006 Menambah data rincian biaya"),
    T19("TC007 Menambah data rincian biaya"),
    T20("TC008 Menambah data rincian biaya");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
