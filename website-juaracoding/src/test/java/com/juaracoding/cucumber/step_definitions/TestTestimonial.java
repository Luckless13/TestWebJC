package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.TestimonialPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTestimonial {
	
	 private static WebDriver driver;
	 private static ExtentTest extentTest;
	 private TestimonialPage testimonialPage = new TestimonialPage();

	    public TestTestimonial() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
	
//	TestCase 1
	@When("Go to Web PtDika")
	public void go_to_web_pt_dika() {
		driver.get(Constants.URL);
    	extentTest.log(LogStatus.PASS, "Go to Web Pt Dika");
    	WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
		uname.sendKeys("ucen1315@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("a");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
		login.click();
	}

	@And("Click home")
	public void click_home() throws InterruptedException {
    	testimonialPage.clickBtnHome();
    	extentTest.log(LogStatus.PASS, "Click button home");
	}

	@And("Click Testimonial")
	public void click_testimonial() throws InterruptedException{
		testimonialPage.clickBtnTestimonial();
    	extentTest.log(LogStatus.PASS, "Click button testimonial");
	}

	@Then("Berada di page list testimonial")
	public void berada_di_page_list_testimonial() {
		AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
    	extentTest.log(LogStatus.PASS, "Berada di page list testimonial");
	}

//	TestCase 2
	@When("Click tambah")
	public void click_tambah() throws InterruptedException {
		testimonialPage.clickBtnTambah();
    	extentTest.log(LogStatus.PASS, "Click button tambah");
	}

	@And("Click choose file null")
	public void click_choose_file_null() throws InterruptedException {
    	extentTest.log(LogStatus.PASS, "Click choose file null");
	}

	@And("Input nama peserta testimonial null")
	public void input_nama_peserta_testimonial_null() throws InterruptedException {
		testimonialPage.NamaPeserta("");
    	extentTest.log(LogStatus.PASS, "Input nama peserta null");
	}

	@And("Select publish status testimonial null")
	public void select_publish_status_testimonial_null() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@And("Input content testimonial null")
	public void input_content_testimonial_null() throws InterruptedException {
		testimonialPage.Content("");
    	extentTest.log(LogStatus.PASS, "Input content testimonial null");  
	}

	@And("Select rating testimonial null")
	public void select_rating_testimonial_null() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@And("Click simpan testimonial null")
	public void click_simpan_testimonial_null() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial null credential")
	public void testimonial_null_credential() throws InterruptedException {
		AssertJUnit.assertEquals(testimonialPage.getTxtNamaWajib(), "Nama Wajib diisi");
    	Assert.assertTrue(testimonialPage.getTxtNamaWajib().contains("Nama Wajib diisi"));
    	AssertJUnit.assertEquals(testimonialPage.getTxtContentWajib(), "Harap isi content testimonial");
    	Assert.assertTrue(testimonialPage.getTxtContentWajib().contains("Harap isi content testimonial"));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, Semua data kosong");
	}

//	TestCase 3
	@When("Click choose file lalu pilih foto testimonial nama dan content null")
	public void click_choose_file_lalu_pilih_foto_testimonial_nama_dan_content_null() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.clickBtnUpload("C:\\Users\\Lenovo\\Downloads\\OP.png");
    	extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
	}

	@And("Input nama peserta testimonial nama dan content null")
	public void input_nama_peserta_testimonial_nama_dan_content_null() throws InterruptedException {
		testimonialPage.NamaPeserta("");
    	extentTest.log(LogStatus.PASS, "Input nama peserta null");
	}

	@And("Select publish status testimonial nama dan content null")
	public void select_publish_status_testimonial_nama_dan_content_null() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@And("Input content testimonial nama dan content null")
	public void input_content_testimonial_nama_dan_content_null() throws InterruptedException {
		testimonialPage.Content("");
    	extentTest.log(LogStatus.PASS, "Input content testimonial null");  
	}

	@And("Select rating testimonial nama dan content null")
	public void select_rating_testimonial_nama_dan_content_null() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@And("Click simpan testimonial nama dan content null")
	public void click_simpan_testimonial_nama_dan_content_null() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial nama dan content null credential")
	public void testimonial_nama_dan_content_null_credential() throws InterruptedException {
		AssertJUnit.assertEquals(testimonialPage.getTxtNamaWajib(), "Nama Wajib diisi");
    	Assert.assertTrue(testimonialPage.getTxtNamaWajib().contains("Nama Wajib diisi"));
    	AssertJUnit.assertEquals(testimonialPage.getTxtContentWajib(), "Harap isi content testimonial");
    	Assert.assertTrue(testimonialPage.getTxtContentWajib().contains("Harap isi content testimonial"));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, karena Nama Peserta dan Isi Testimonial kosong");
	}
	
//	Test case 4
	@When("Click choose file lalu pilih foto testimonial content null")
	public void click_choose_file_lalu_pilih_foto_testimonial_content_null() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.clickBtnUpload("C:\\Users\\Lenovo\\Downloads\\OP.png");
    	extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
	}

	@And("Input nama peserta testimonial content null")
	public void input_nama_peserta_testimonial_content_null() {
		testimonialPage.NamaPeserta("Test 13");
    	extentTest.log(LogStatus.PASS, "Input nama peserta");
	}

	@And("Select publish status testimonial content null")
	public void select_publish_status_testimonial_content_null() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@And("Input content testimonial null testimonial content null")
	public void input_content_testimonial_null_testimonial_content_null() {
		testimonialPage.Content("");
    	extentTest.log(LogStatus.PASS, "Input content testimonial null");
	}

	@And("Select rating testimonial content null")
	public void select_rating_testimonial_content_null() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@And("Click simpan testimonial content null")
	public void click_simpan_testimonial_content_null() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial content null credential")
	public void testimonial_content_null_credential() {
    	AssertJUnit.assertEquals(testimonialPage.getTxtContentWajib(), "Harap isi content testimonial");
    	Assert.assertTrue(testimonialPage.getTxtContentWajib().contains("Harap isi content testimonial"));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, Karena Isi Testimonial kosong");
	}
	
//	Test Case 5
	@When("Click choose file lalu pilih foto testimonial nama null")
	public void click_choose_file_lalu_pilih_foto_testimonial_nama_null() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.clickBtnUpload("C:\\Users\\Lenovo\\Downloads\\OP.png");
    	extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
	}

	@And("Input nama peserta testimonial nama null")
	public void input_nama_peserta_testimonial_nama_null() {
		testimonialPage.NamaPeserta("");
    	extentTest.log(LogStatus.PASS, "Input nama peserta null");
	}

	@And("Select publish status testimonial nama null")
	public void select_publish_status_testimonial_nama_null() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@And("Input content testimonial nama null")
	public void input_content_testimonial_nama_null() {
		testimonialPage.Content("Bagus");
    	extentTest.log(LogStatus.PASS, "Input content testimonial");
	}

	@And("Select rating testimonial nama null")
	public void select_rating_testimonial_nama_null() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@And("Click simpan testimonial nama null")
	public void click_simpan_testimonial_nama_null() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial nama null credential")
	public void testimonial_nama_null_credential() {
		AssertJUnit.assertEquals(testimonialPage.getTxtNamaWajib(), "Nama Wajib diisi");
    	Assert.assertTrue(testimonialPage.getTxtNamaWajib().contains("Nama Wajib diisi"));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, Karena Nama Peserta kosong");
	}
	
//	Test Case 6
	@When("Click choose file lalu pilih foto null")
	public void click_choose_file_lalu_pilih_foto_null() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
    	extentTest.log(LogStatus.PASS, "Click choose file null");
	}

	@And("Input nama peserta testimonial foto null")
	public void input_nama_peserta_testimonial_foto_null() {
		testimonialPage.NamaPeserta("Test 13");
    	extentTest.log(LogStatus.PASS, "Input nama peserta");
	}

	@And("Select publish status testimonial foto null")
	public void select_publish_status_testimonial_foto_null() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@And("Input content testimonial testimonial foto null")
	public void input_content_testimonial_testimonial_foto_null() {
		testimonialPage.Content("Bagus");
    	extentTest.log(LogStatus.PASS, "Input content testimonial");
	}

	@And("Select rating testimonial foto null")
	public void select_rating_testimonial_foto_null() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@And("Click simpan testimonial foto null")
	public void click_simpan_testimonial_foto_null() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial foto null credential")
	public void testimonial_foto_null_credential() {
		AssertJUnit.assertEquals(testimonialPage.getTxt404(), "404 - File Not Found");
    	Assert.assertTrue(testimonialPage.getTxt404().contains("404 - File Not Found"));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, Karena Foto kosong");
	}
	
//	Test Case 7
	@When("Click choose file lalu pilih foto pdf")
	public void click_choose_file_lalu_pilih_foto_pdf() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.clickBtnUpload("C:\\Users\\Lenovo\\Downloads\\OP.pdf");
    	extentTest.log(LogStatus.PASS, "Click choose file pdf");
	}

	@When("Input nama peserta testimonial foto pdf")
	public void input_nama_peserta_testimonial_foto_pdf() {
		testimonialPage.NamaPeserta("Test 13");
    	extentTest.log(LogStatus.PASS, "Input nama peserta");
	}

	@When("Select publish status testimonial foto pdf")
	public void select_publish_status_testimonial_foto_pdf() throws InterruptedException {
		testimonialPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Select publish status");
	}

	@When("Input content testimonial testimonial foto pdf")
	public void input_content_testimonial_testimonial_foto_pdf() {
		testimonialPage.Content("Bagus");
    	extentTest.log(LogStatus.PASS, "Input content testimonial");
	}

	@When("Select rating testimonial foto pdf")
	public void select_rating_testimonial_foto_pdf() throws InterruptedException {
		testimonialPage.selectRating(5);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}

	@When("Click simpan testimonial foto pdf")
	public void click_simpan_testimonial_foto_pdf() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		testimonialPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Click button simpan");
	}

	@Then("Testimonial foto pdf credential")
	public void testimonial_foto_pdf_credential() {
		AssertJUnit.assertEquals(testimonialPage.getTxtfilenotsupport(), "The supplied file is not a supported image type.");
    	Assert.assertTrue(testimonialPage.getTxtfilenotsupport().contains("The supplied file is not a supported image type."));
    	extentTest.log(LogStatus.PASS, "Gagal menambah testimonial, Karena format foto bukan image");
	}

//	Test Case 8
//	@When("Click choose file lalu pilih foto")
//	public void click_choose_file_lalu_pilih_foto() throws InterruptedException {
//		driver.navigate().back();
//		driver.navigate().refresh();
//		testimonialPage.clickBtnUpload("C:\\Users\\Lenovo\\Downloads\\OP.png");
//		extentTest.log(LogStatus.PASS, "Click choose file, pilih foto");
//	}
//
//	@When("Input nama peserta")
//	public void input_nama_peserta() {
//		testimonialPage.NamaPeserta("Test 13");
//    	extentTest.log(LogStatus.PASS, "Input nama peserta");
//	}
//
//	@When("Select publish status")
//	public void select_publish_status() throws InterruptedException {
//		testimonialPage.selectPublish(0);
//    	extentTest.log(LogStatus.PASS, "Select publish status");
//	}
//
//	@When("Input content testimonial")
//	public void input_content_testimonial() {
//		testimonialPage.Content("Bagus");
//    	extentTest.log(LogStatus.PASS, "Input content testimonial");
//	}
//
//	@When("Select rating")
//	public void select_rating() throws InterruptedException {
//		testimonialPage.selectPublish(0);
//    	extentTest.log(LogStatus.PASS, "Select publish status");
//	}
//
//	@When("Click simpan")
//	public void click_simpan() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		testimonialPage.clickBtnSimpan();
//    	extentTest.log(LogStatus.PASS, "Click button simpan");
//	}
//
//	@Then("Add Testimonial success credential")
//	public void add_testimonial_success_credential() {
//		AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
//    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
//    	extentTest.log(LogStatus.PASS, "Berhasil menambahkan testimonial");
//	}
}
