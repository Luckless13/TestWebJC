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

public class TestTestimonialEdit {

	 private static WebDriver driver;
	 private static ExtentTest extentTest;
	 private TestimonialPage testimonialPage = new TestimonialPage();

	    public TestTestimonialEdit() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
//		TestCase 1
	    @When("Click nama peserta yang dicari")
	    public void click_nama_peserta_yang_dicari() throws InterruptedException {
	    	driver.get(Constants.URL);
	    	extentTest.log(LogStatus.PASS, "Go to Web Pt Dika");
	    	WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
			uname.sendKeys("ucen1315@gmail.com");
			WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			password.sendKeys("a");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
			login.click();
			testimonialPage.clickBtnHome();
			testimonialPage.clickBtnTestimonial();
			testimonialPage.Search("Test 13");
			testimonialPage.Enter();
	    	
	    	testimonialPage.clickNamayangdicari();
	    	extentTest.log(LogStatus.PASS, "Click Nama Peserta yang ditemukan");
	    }

	    @And("Input nama null")
	    public void input_nama_null() throws InterruptedException {
	    	testimonialPage.ClearNama();
	    	extentTest.log(LogStatus.PASS, "Edit Nama Peserta null");
	    }
	        
	    @And("Click simpan nama null")
	    public void click_simpan_nama_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	testimonialPage.clickBtnSimpan();
	    	extentTest.log(LogStatus.PASS, "Click button simpan");
	    }

	    @Then("Edit Testimonial nama null credential")
	    public void edit_testimonial_nama_null_credential() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	AssertJUnit.assertEquals(testimonialPage.getNamaAlert(), "Nama Wajib diisi");
	    	Assert.assertTrue(testimonialPage.getNamaAlert().contains("Nama Wajib diisi"));
	    	extentTest.log(LogStatus.PASS, "Gagal edit testimonial, Nama Peserta kosong");
	    }

//		TestCase 2
	    @When("Input isi testimonial null")
	    public void input_isi_testimonial_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
			testimonialPage.ClearContent();
	    	extentTest.log(LogStatus.PASS, "Edit Isi Testimonial null");
	    }

	    @And("Click simpan isi testimoninal null")
	    public void click_simpan_isi_testimoninal_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	testimonialPage.clickBtnSimpan();
	    	extentTest.log(LogStatus.PASS, "Click button simpan");
	    }

	    @Then("Edit Testimonial isi testimoninal null credential")
	    public void edit_testimonial_isi_testimoninal_null_credential() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	AssertJUnit.assertEquals(testimonialPage.getContentAlert(), "Harap isi content testimonial");
	    	Assert.assertTrue(testimonialPage.getContentAlert().contains("Harap isi content testimonial"));
	    	extentTest.log(LogStatus.PASS, "Gagal edit testimonial, Isi Testimonial kosong");
	    }
	    
//		TestCase 3
	    @When("Input nama dan isi testimoial null")
	    public void Input_nama_dan_isi_testimoial_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	testimonialPage.ClearNama();
	    	testimonialPage.ClearContent();
	    	extentTest.log(LogStatus.PASS, "Edit Nama Peserta dan Isi Testimonial null");
	    	
	    }
	    
	    @And("Click simpan nama dan isi testimoial null")
	    public void click_simpan_nama_dan_isi_testimoial_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	testimonialPage.clickBtnSimpan();
	    	extentTest.log(LogStatus.PASS, "Click button simpan");
	    }

	    @Then("Edit Testimonial nama dan isi testimoial null credential")
	    public void edit_testimonial_nama_dan_isi_testimoial_null_credential() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			AssertJUnit.assertEquals(testimonialPage.getNamaAlert(), "Nama Wajib diisi");
	    	Assert.assertTrue(testimonialPage.getNamaAlert().contains("Nama Wajib diisi"));
			AssertJUnit.assertEquals(testimonialPage.getContentAlert(), "Harap isi content testimonial");
	    	Assert.assertTrue(testimonialPage.getContentAlert().contains("Harap isi content testimonial"));
	    	extentTest.log(LogStatus.PASS, "Gagal edit testimonial, Nama Peserta dan Isi Testimonial kosong");
	    }
	    
//		TestCase 4
	    @When("Click pilih gambar ulang lalu pilih foto pdf")
	    public void click_pilih_gambar_ulang_lalu_pilih_foto_pdf() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
			testimonialPage.clickBtnPilihGambarUlang("C:\\Users\\Lenovo\\Downloads\\OP.pdf");
	    	extentTest.log(LogStatus.PASS, "Click Pilih Gambar Ulang, alu pilih file pdf");
	    }

	    @When("Click simpan foto pdf")
	    public void click_simpan_foto_pdf() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	testimonialPage.clickBtnSimpan();
	    	extentTest.log(LogStatus.PASS, "Click button simpan");
	    }

	    @Then("Edit Testimonial foto pdf credential")
	    public void edit_testimonial_foto_pdf_credential() {
	    	AssertJUnit.assertEquals(testimonialPage.getTxtfilenotsupport(), "The supplied file is not a supported image type.");
	    	Assert.assertTrue(testimonialPage.getTxtfilenotsupport().contains("The supplied file is not a supported image type."));
	    	extentTest.log(LogStatus.PASS, "Gagal edit testimonial, Karena format foto bukan image");
	    }

//		TestCase 5
	    @When("Input nama peserta baru")
	    public void input_nama_peserta_baru() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			testimonialPage.ClearNama();
	    	testimonialPage.EditNama("Test 14");
	    	extentTest.log(LogStatus.PASS, "Edit Nama Peserta");
	    }

	    @When("Select publish status baru")
	    public void select_publish_status_baru() throws InterruptedException {
	    	testimonialPage.EditPublish(2);
	    	extentTest.log(LogStatus.PASS, "Select publish status");
	    }

	    @When("Input isi testimonial baru")
	    public void input_isi_testimonial_baru() throws InterruptedException {
	    	testimonialPage.ClearContent();
	    	testimonialPage.EditContent("Cukup");
	    	extentTest.log(LogStatus.PASS, "Edit Isi Testimonial");
	    }

	    @When("Select rating baru")
	    public void select_rating_baru() throws InterruptedException {
	    	testimonialPage.EditRating(4);
	    	extentTest.log(LogStatus.PASS, "Select rating");
	    }

	    @When("Click simpan")
	    public void click_simpan() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	testimonialPage.clickBtnSimpan();
	    	extentTest.log(LogStatus.PASS, "Click button simpan");
	    }

	    @Then("Edit Testimonial credential")
	    public void edit_testimonial_credential() {
	    	AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
	    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
	    	extentTest.log(LogStatus.PASS, "Berhasil edit testimonial");
	    }      

}
