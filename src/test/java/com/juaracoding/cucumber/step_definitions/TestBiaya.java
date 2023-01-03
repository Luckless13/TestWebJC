package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.BiayaPage;
import com.juaracoding.cucumber.pages.BlogPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class TestBiaya {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private BiayaPage biayaPage = new BiayaPage();

    public TestBiaya() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
// test 1
    @When("User Click menu home")
    public void user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("User Click menu rincian biaya")
    public void user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("User Click tambah")
    public void user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("User Input nama program")
    public void user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("User Input harga normal")
    public void user_input_harga_normal() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("User Input diskon")
    public void user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("User Input Keunggulan1")
    public void user_input_keunggulan1() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("User Input Keunggulan2")
    public void user_input_keunggulan2() {
        biayaPage.setInputunggul2("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("User Input Keunggulan3")
    public void user_input_keunggulan3() {
        biayaPage.setInputunggul3("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 3");
    }

    @When("User Input Keunggulan4")
    public void user_input_keunggulan4() {
        biayaPage.setInputunggul4("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 4");
    }

    @When("User Input Keunggulan5")
    public void user_input_keunggulan5() {
        biayaPage.setInputunggul5("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 5");
    }

    @When("User Select Publish")
    public void user_select_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("User Click Simpan")
    public void user_click_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data telah BerhasiL di tambah")
    public void data_telah_berhasil_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTexttambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "data berhasil di tambah tc1");
    }

// test 2
    @When("User Click tombol menu home")
    public void user_click_tombol_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("User Click tombol menu rincian biaya")
    public void user_click_tombol_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("User Click tombol tambah")
    public void user_click_tombol_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("User Input nama program02")
    public void user_input_nama_program02() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("User Input harga normal02")
    public void user_input_harga_normal02() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("User Input Keunggulan01")
    public void user_input_keunggulan01() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("User Input Keunggulan02")
    public void user_input_keunggulan02() {
        biayaPage.setInputunggul2("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("User Input Keunggulan03")
    public void user_input_keunggulan03() {
        biayaPage.setInputunggul3("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 3");
    }

    @When("User Input Keunggulan04")
    public void user_input_keunggulan04() {
        biayaPage.setInputunggul4("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 4");
    }

    @When("User Input Keunggulan05")
    public void user_input_keunggulan05() {
        biayaPage.setInputunggul5("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 5");
    }

    @When("User Select pilihan Publish")
    public void user_select_pilihan_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("User Clik tombol Simpan")
    public void user_clik_tombol_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc02 Data BerhasiL di tambah")
    public void tc02_data_berhasil_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTexttambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "data berhasil di tambah tc1");
    }

//test 3
    @When("User tekan tombol menu home")
    public void user_tekan_tombol_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("User tekan tombol menu rincian biaya")
    public void user_tekan_tombol_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("User tekan tombol tambah")
    public void user_tekan_tombol_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("User Input harga normal3")
    public void user_input_harga_normal3() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("User Input diskon3")
    public void user_input_diskon3() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("User memilih Publish")
    public void user_memilih_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("User tekan tombol Simpan")
    public void user_tekan_tombol_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc03 Data gagal di tambah")
    public void tc03_data_gagal_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTextgagalnama(), "Harap isi nama program");
        extentTest.log(LogStatus.PASS, "data gagal di tambah tc3");
    }

// test 4

    @When("tc04 User Click menu home")
    public void tc04_user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("tc04 User Click menu rincian biaya")
    public void tc04_user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("tc04 User Click tambah")
    public void tc04_user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("tc04 User Input nama program")
    public void tc04_user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("tc04 User Input diskon")
    public void tc04_user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("tc04 User Input Keunggulan1")
    public void tc04_user_input_keunggulan1() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("tc04 User Input Keunggulan2")
    public void tc04_user_input_keunggulan2() {
        biayaPage.setInputunggul2("Menambah kepercayaan diri ya");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("tc04 User Input Keunggulan3")
    public void tc04_user_input_keunggulan3() {
        biayaPage.setInputunggul3("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 3");
    }

    @When("tc04 User Input Keunggulan4")
    public void tc04_user_input_keunggulan4() {
        biayaPage.setInputunggul4("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 4");
    }

    @When("tc04 User Input Keunggulan5")
    public void tc04_user_input_keunggulan5() {
        biayaPage.setInputunggul5("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 5");
    }

    @When("tc04 User Select Publish")
    public void tc04_user_select_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("tc04 User Clik Simpan")
    public void tc04_user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc04 Data gagal di tambah")
    public void tc04_data_gagal_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTextgagalharga(), "Harap isi harga program");
        extentTest.log(LogStatus.PASS, "data gagal di tambah tc4");
    }

// test 5
    @When("tc05 User Click menu home")
    public void tc05_user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("tc05 User Click menu rincian biaya")
    public void tc05_user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("tc05 User Click tambah")
    public void tc05_user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("tc05 User Input nama program")
    public void tc05_user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("tc05 User Input harga normal")
    public void tc05_user_input_harga_normal() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("tc05 User Input diskon")
    public void tc05_user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("tc05 User Input Keunggulan2")
    public void tc05_user_input_keunggulan2() {
        biayaPage.setInputunggul2("Menguasai lebih dari 1 bahasa");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("tc05 User Input Keunggulan3")
    public void tc05_user_input_keunggulan3() {
        biayaPage.setInputunggul3("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 3");
    }

    @When("tc05 User Input Keunggulan4")
    public void tc05_user_input_keunggulan4() {
        biayaPage.setInputunggul4("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 4");
    }

    @When("tc05 User Input Keunggulan5")
    public void tc05_user_input_keunggulan5() {
        biayaPage.setInputunggul5("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 5");
    }

    @When("tc05 User Select Publish")
    public void tc05_user_select_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("tc05 User Clik Simpan")
    public void tc05_user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc05 Data gagal di tambah")
    public void tc05_data_gagal_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTextgagalkeunggulan(), "Harap isi keunggulan program");
        extentTest.log(LogStatus.PASS, "data gagal di tambah tc5");
    }

// test 6

    @When("tc06 User Click menu home")
    public void tc06_user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("tc06 User Click menu rincian biaya")
    public void tc06_user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("tc06 User Click tambah")
    public void tc06_user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("tc06 User Input nama program")
    public void tc06_user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("tc06 User Input harga normal")
    public void tc06_user_input_harga_normal() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("tc06 User Input diskon")
    public void tc06_user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("tc06 User Input Keunggulan1")
    public void tc06_user_input_keunggulan1() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("tc06 User Input Keunggulan3")
    public void tc06_user_input_keunggulan3() {
        biayaPage.setInputunggul3("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 3");
    }

    @When("tc06 User Input Keunggulan4")
    public void tc06_user_input_keunggulan4() {
        biayaPage.setInputunggul4("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 4");
    }

    @When("tc06 User Input Keunggulan5")
    public void tc06_user_input_keunggulan5() {
        biayaPage.setInputunggul5("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 5");
    }

    @When("tc06 User Select Publish")
    public void tc06_user_select_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("tc06 User Clik Simpan")
    public void tc06_user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc06 Data BerhasiL di tambah")
    public void tc06_data_berhasil_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTexttambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "data berhasil di tambah tc6");
    }

// test 7
    @When("tc07 User Click menu home")
    public void tc07_user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("tc07 User Click menu rincian biaya")
    public void tc07_user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("tc07 User Click tambah")
    public void tc07_user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("tc07 User Input nama program")
    public void tc07_user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("tc07 User Input harga normal")
    public void tc07_user_input_harga_normal() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("tc07 User Input diskon")
    public void tc07_user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("tc07 User Input Keunggulan1")
    public void tc07_user_input_keunggulan1() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("tc07 User Input Keunggulan2")
    public void tc07_user_input_keunggulan2() {
        biayaPage.setInputunggul1("Rajin menabung");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("tc07 User Select Publish")
    public void tc07_user_select_publish() throws InterruptedException {
        biayaPage.selectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish");
    }

    @When("tc07 User Clik Simpan")
    public void tc07_user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc07 Data BerhasiL di tambah")
    public void tc07_data_berhasil_di_tambah() {
        AssertJUnit.assertEquals(biayaPage.getTexttambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "data berhasil di tambah tc7");
    }

// test 8
    @When("tc08 User Click menu home")
    public void tc08_user_click_menu_home() throws InterruptedException {
        biayaPage.btnhome();
        extentTest.log(LogStatus.PASS, "User click Menu home");
    }

    @When("tc08 User Click menu rincian biaya")
    public void tc08_user_click_menu_rincian_biaya() throws InterruptedException {
        biayaPage.btnbiaya();
        extentTest.log(LogStatus.PASS, "User click Menu rincian biaya");
    }

    @When("tc08 User Click tambah")
    public void tc08_user_click_tambah() throws InterruptedException {
        biayaPage.btntambah();
        extentTest.log(LogStatus.PASS, "User click tambah");
    }

    @When("tc08 User Input nama program")
    public void tc08_user_input_nama_program() {
        biayaPage.setInputnama("Pelatihan akhir tahun");
        extentTest.log(LogStatus.PASS, "Input nama program");
    }

    @When("tc08 User Input harga normal")
    public void tc08_user_input_harga_normal() {
        biayaPage.setInputharga("10000000");
        extentTest.log(LogStatus.PASS, "Input harga normal");
    }

    @When("tc08 User Input diskon")
    public void tc08_user_input_diskon() {
        biayaPage.setInputdiskon("10");
        extentTest.log(LogStatus.PASS, "Input diskon");
    }

    @When("tc08 User Input Keunggulan1")
    public void tc08_user_input_keunggulan1() {
        biayaPage.setInputunggul1("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 1");
    }

    @When("tc08 User Input Keunggulan2")
    public void tc08_user_input_keunggulan2() {
        biayaPage.setInputunggul2("Menambah kepercayaan diri");
        extentTest.log(LogStatus.PASS, "Input keunggulan 2");
    }

    @When("tc08 User Clik Simpan")
    public void tc08_user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        biayaPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("tc08 Data gagal di tambah")
    public void tc08_data_gagal_di_tambah() {
        extentTest.log(LogStatus.PASS, "data gagal di tambah tc8 (tidak ada alert)");
    }

}
