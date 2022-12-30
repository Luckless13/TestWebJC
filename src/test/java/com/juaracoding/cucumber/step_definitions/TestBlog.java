package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.BlogPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class TestBlog {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private BlogPage blogPage = new BlogPage();

    public TestBlog() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
// Test 1
    @When("User click Blog Menu tc001")
    public void user_click_blog_menu_tc001() throws InterruptedException {
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User Click Tambah")
    public void user_click_tambah() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @Then("Masuk ke halaman tambah Blog")
    public void masuk_ke_halaman_tambah_blog() {
      AssertJUnit.assertEquals(blogPage.getTexttambah(), "Tambah Blog");
      Assert.assertTrue(blogPage.getTexttambah().contains("Tambah Blog"));
    	extentTest.log(LogStatus.PASS, "Berhasil masuk ke halaman tambah");
    }
// Test 2
    @When("User click Blog Menu tc002")
    public void user_click_blog_menu_tc002() throws InterruptedException {
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User input nama blog")
    public void user_input_nama_blog() {
        blogPage.setSearch("Judul");
        extentTest.log(LogStatus.PASS, "User input search blog");
    }

    @Then("Tampil Hasil Pencarian")
    public void tampil_hasil_pencarian() {
        AssertJUnit.assertEquals(blogPage.getTextlist(), "List Blog");
        Assert.assertTrue(blogPage.getTextlist().contains("List Blog"));
        extentTest.log(LogStatus.PASS, "Berhasil Menampilkan List");
    }

// Test 3
    @When("User click Blog Menu tc003")
    public void user_click_blog_menu_tc003() throws InterruptedException {
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User Click list data")
    public void user_click_list_data() throws InterruptedException {
        blogPage.Listdata();
        extentTest.log(LogStatus.PASS, "User click List data");
    }

    @Then("Tampil Menu edit Blog")
    public void tampil_menu_edit_blog() {
        AssertJUnit.assertEquals(blogPage.getTextedit(), "Edit Blog");
        Assert.assertTrue(blogPage.getTextedit().contains("Edit Blog"));
        extentTest.log(LogStatus.PASS, "Berhasil Menampilkan halaman Edit");
    }
// Test 4
    @When("User click Blog Menu tc004")
    public void user_click_blog_menu_tc004() throws InterruptedException {
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User Click page grid")
    public void user_click_page_grid() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.setPagenumber();
        extentTest.log(LogStatus.PASS, "Cllik Page grid");
    }

    @Then("Tampil List blog dan data lain")
    public void tampil_list_blog_dan_data_lain() {
        AssertJUnit.assertEquals(blogPage.getTextlist(), "List Blog");
        Assert.assertTrue(blogPage.getTextlist().contains("List Blog"));
        extentTest.log(LogStatus.PASS, "Berhasil Menampilkan List blog lain");
    }

// Test 5
    @When("User click Blog Menu tc005")
    public void user_click_blog_menu_tc005() throws InterruptedException {
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User Click Tambah tc005")
    public void user_click_tambah_tc005() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @And("User Choose file pilih foto")
    public void user_choose_file_pilih_foto() throws InterruptedException {
        blogPage.clickBtnUpload("C:\\Users\\zentrum3\\Downloads\\jc.jpg");
        extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
    }

    @And("User Input Judul Blog")
    public void user_input_judul_blog() {
        blogPage.setInputjudul("test QA jc 6 ya");
        extentTest.log(LogStatus.PASS, "Input judul blog");
    }

    @And("User Select Active atau No Active")
    public void user_select_active_atau_no_active() throws InterruptedException {
        blogPage.setselectPublish(0);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @And("User Select YES atau NO")
    public void user_select_yes_atau_no() throws InterruptedException {
        blogPage.setselecttohome(0);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @And("User Input Conten Preview")
    public void user_input_conten_preview() {
        blogPage.setInputcontent1("test QA Jc 6 juga ya");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @And("User Input Content")
    public void user_input_content() {
        blogPage.setInputcontent2("test QA jc 6 juga ya");
        extentTest.log(LogStatus.PASS, "Input Content");
    }

    @And("User Clik Simpan")
    public void user_clik_simpan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data BerhasiL di tambah")
    public void data_berhasi_l_di_tambah() {
        AssertJUnit.assertEquals(blogPage.getTextberhasiltambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "berhasil di tambah tc05");
    }
// Test 6
    @When("User berada di halaman tambah")
    public void user_berada_di_halaman_tambah() {
        blogPage.getTexttambah();
        extentTest.log(LogStatus.PASS, "Tambah Blog");
    }

    @And("Kosongkan judul")
    public void Kosongkan_judul() {
        blogPage.judulHapus();
        extentTest.log(LogStatus.PASS, "Mengosongkan Judul");
    }

    @And("Kosongkan content preview")
    public void Kosongkan_content_preview() {
        blogPage.content1Hapus();
        extentTest.log(LogStatus.PASS, "Mengosongkan content preview");
    }

    @And("Kosongkan content")
    public void Kosongkan_content() {
        blogPage.content2Hapus();
        extentTest.log(LogStatus.PASS, "Mengosongkan content");
    }

    @And("User Clik Simpan tc006")
    public void user_clik_simpan_tc006() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data Tidak BerhasiL di tambah tc006")
    public void data_tidak_berhasi_l_di_tambah_tc006() {
        AssertJUnit.assertEquals(blogPage.getTextberhasiltambah(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "berhasil tidak berhasil di tambah tc06");
    }
// Test 7
    @When("User click Blog Menu tc007")
    public void user_click_blog_menu_tc007() throws InterruptedException {
        Hooks.delay(2);
        blogPage.btnblog3();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @And("User Click Tambah tc007")
    public void user_click_tambah_tc007() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @And("User Input Judul Blog tc007")
    public void user_input_judul_blog_tc007() {
        blogPage.setInputjudul("test QA Juara coding tc6");
        extentTest.log(LogStatus.PASS, "Input judul blog");
    }

    @And("User Select Active atau No Active tc007")
    public void user_select_active_atau_no_active_tc007() throws InterruptedException {
        blogPage.setselectPublish(1);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @And("User Select YES atau NO tc007")
    public void user_select_yes_atau_no_tc007() throws InterruptedException {
        blogPage.setselecttohome(1);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @And("User Input Conten Preview tc007")
    public void user_input_conten_preview_tc007() {
        blogPage.setInputcontent1("test QA Juara coding tc6");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @And("User Input Content tc007")
    public void user_input_content_tc007() {
        blogPage.setInputcontent2("test QA Juara coding tc6");
        extentTest.log(LogStatus.PASS, "Input Content");
    }

    @And("User Clik Simpan tc007")
    public void user_clik_simpan_tc007() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data Tidak BerhasiL di tambah tc007")
    public void data_tidak_berhasi_l_di_tambah_tc007() {
        extentTest.log(LogStatus.PASS, "berhasil tidak berhasil di tambah tc07");
    }
// Test 8

    @When("User click Blog Menu tc008")
    public void user_click_blog_menu_tc008() throws InterruptedException {
        Hooks.delay(2);
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @When("User Click Tambah tc008")
    public void user_click_tambah_tc008() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @When("User Choose File Pilih Foto tc008")
    public void user_choose_file_pilih_foto_tc008() throws InterruptedException {
        blogPage.clickBtnUpload("C:\\Users\\zentrum3\\Downloads\\jc.jpg");
        extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
    }

    @When("User Select Active atau No Active tc008")
    public void user_select_active_atau_no_active_tc008() throws InterruptedException {
        blogPage.setselectPublish(0);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @When("User Select YES atau NO tc008")
    public void user_select_yes_atau_no_tc008() throws InterruptedException {
        blogPage.setselecttohome(0);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @When("User Input Conten Preview tc008")
    public void user_input_conten_preview_tc008() {
        blogPage.setInputcontent1("test QA Juara coding tc5");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @When("User Input Content tc008")
    public void user_input_content_tc008() {
        blogPage.setInputcontent2("test QA Juara coding tc5");
        extentTest.log(LogStatus.PASS, "Input Content");
    }

    @When("User Clik Simpan tc008")
    public void user_clik_simpan_tc008() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data Tidak BerhasiL di tambah tc008")
    public void data_tidak_berhasi_l_di_tambah_tc008() {
        extentTest.log(LogStatus.PASS, "berhasil tidak berhasil di tambah tc 08");
    }
// Test 9
    @When("User click Blog Menu tc009")
    public void user_click_blog_menu_tc009() throws InterruptedException {
        Hooks.delay(2);
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @When("User Click Tambah tc009")
    public void user_click_tambah_tc009() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @When("User Choose File Pilih Foto tc009")
    public void user_choose_file_pilih_foto_tc009() throws InterruptedException {
        blogPage.clickBtnUpload("C:\\Users\\zentrum3\\Downloads\\jc.jpg");
        extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
    }

    @When("User Input Judul Blog tc009")
    public void user_input_judul_blog_tc009() {
        blogPage.setInputjudul("test QA Juara coding tc6");
        extentTest.log(LogStatus.PASS, "Input judul blog");
    }

    @When("User Select Active atau No Active tc009")
    public void user_select_active_atau_no_active_tc009() throws InterruptedException {
        blogPage.setselectPublish(0);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @When("User Select YES atau NO tc009")
    public void user_select_yes_atau_no_tc009() throws InterruptedException {
        blogPage.setselecttohome(0);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @When("User Input Content tc009")
    public void user_input_content_tc009() {
        blogPage.setInputcontent1("test QA Juara coding tc6");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @When("User Clik Simpan tc009")
    public void user_clik_simpan_tc009() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data Tidak BerhasiL di tambah tc009")
    public void data_tidak_berhasi_l_di_tambah_tc009() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
// test 10
    @When("User click Blog Menu tc010")
    public void user_click_blog_menu_tc010() throws InterruptedException {
        Hooks.delay(2);
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @When("User Click Tambah tc010")
    public void user_click_tambah_tc010() throws InterruptedException {
        blogPage.btntambah();
        extentTest.log(LogStatus.PASS, "User Click Tambah");
    }

    @When("User Choose File Pilih Foto tc010")
    public void user_choose_file_pilih_foto_tc010() throws InterruptedException {
        blogPage.clickBtnUpload("C:\\Users\\zentrum3\\Downloads\\jc.jpg");
        extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
    }

    @When("User Input Judul Blog tc010")
    public void user_input_judul_blog_tc010() {
        blogPage.setInputjudul("test QA Juara coding tc7");
        extentTest.log(LogStatus.PASS, "Input judul blog");
    }

    @When("User Select Active atau No Active tc010")
    public void user_select_active_atau_no_active_tc010() throws InterruptedException {
        blogPage.setselectPublish(0);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @When("User Select YES atau NO tc010")
    public void user_select_yes_atau_no_tc010() throws InterruptedException {
        blogPage.setselecttohome(0);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @When("User Input Conten Preview tc010")
    public void user_input_conten_preview_tc010() {
        blogPage.setInputcontent1("test QA Juara coding tc7");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @When("User Clik Simpan tc010")
    public void user_clik_simpan_tc010() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data Tidak BerhasiL di tambah tc010")
    public void data_tidak_berhasi_l_di_tambah_tc010() {
        extentTest.log(LogStatus.PASS, "berhasil tidak berhasil di tambah tc10");
    }
// Test 11
    @When("User click Blog Menu tc011")
    public void user_click_blog_menu_tc011() throws InterruptedException {
        Hooks.delay(2);
        blogPage.btnblog();
        extentTest.log(LogStatus.PASS, "User click Blog Menu");
    }

    @When("User Click List Blog tc011")
    public void user_click_list_blog_tc011() throws InterruptedException {
        blogPage.Listdata();
        extentTest.log(LogStatus.PASS, "User click List data");
    }

    @When("User Select Active atau No Active tc011")
    public void user_select_active_atau_no_active_tc011() throws InterruptedException {
        blogPage.setselectPublish(0);
        extentTest.log(LogStatus.PASS, "Select publish status");
    }

    @When("User Select YES atau NO tc011")
    public void user_select_yes_atau_no_tc011() throws InterruptedException {
        blogPage.setselecttohome(0);
        extentTest.log(LogStatus.PASS, "Select set to home status");
    }

    @When("User Input Conten Preview tc011")
    public void user_input_conten_preview_tc011() {
        blogPage.setInputcontent1("test QA Juara coding tc8");
        extentTest.log(LogStatus.PASS, "Input Content preview");
    }

    @When("User Input Content tc011")
    public void user_input_content_tc011() {
        blogPage.setInputcontent2("test QA Juara coding tc8");
        extentTest.log(LogStatus.PASS, "Input Content");
    }

    @When("User Clik Simpan tc011")
    public void user_clik_simpan_tc011() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        blogPage.btnsimpan();
        extentTest.log(LogStatus.PASS, "User click Button Simpan");
    }

    @Then("Data berhasil di ubah tc011")
    public void data_berhasil_di_ubah_tc011() {
        extentTest.log(LogStatus.PASS, "berhasil berhasil di ubah kecuali foto, publish dan set to home");
    }
}
