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
	
//	Testimonial Tambah
//    T8("Berada di Testimonial"),
//	T9("Tambah Testimonial null"),
//	T10("Tambah Testimonial nama dan content null"),
//	T11("Tambah Testimonial content null"),
//	T12("Tambah Testimonial nama null"),
//	T13("Tambah Testimonial foto null"),
//	T14("Tambah Testimonial foto pdf"),
//	T15("Tambah Testimonial Success"),
	
//	Testimonial Search
//  T16("Berada di Testimonial"),
//	T17("Go to next page valid"),
//	T18("Go to next page invalid"),
//	T19("Search nama peserta null"),
//	T20("Search nama peserta lengkap dengan spasi dibelakang"),
//	T21("Search nama depan peserta"),
//	T22("Search nama belakang peserta"),
//	T23("Search nama peserta lengkap"),
	
//	Testimonial Edit
	T24("Edit Testimonial nama null"),
	T25("Edit Testimonial isi testimoninal null"),
	T26("Edit Testimonial nama dan isi testimoial null"),
	T27("Edit Testimonial foto pdf");
//	T28("Edit Testimonial");
	
//	Rincian Biaya Search
//	T29("Berada di Page Rincian Biaya"),
//	T30("Search nama program null"),
//	T31("Search nama program lengkap dengan spasi dibelakang"),
//	T32("Search nama depan program"),
//	T33("Search nama belakang program"),
//	T34("Search nama program lengkap"),
//	T35("Search harga normal null"),
//	T36("Search harga normal huruf"),
//	T37("Search harga normal");
//	T38("Search harga normal huruf"),
//	T39("Search harga normal huruf"),
//	T40("Search harga normal huruf");
	
	
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
