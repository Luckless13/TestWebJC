package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.juaracoding.cucumber.pages.AboutPage;
import com.juaracoding.cucumber.pages.SosialMediaPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbout {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AboutPage aboutPage = new AboutPage();

    public TestAbout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case 1
	@When("Klik about")
	public void klik_about() throws InterruptedException {
		Hooks.delay(2);
		aboutPage.klikBtnAbout();
        extentTest.log(LogStatus.PASS, "Klik about");
	}
	@Then("Berada di form about")
	public void berada_di_form_about() {
		Assert.assertEquals(aboutPage.getTxtTrainer(), "List Trainer");
        extentTest.log(LogStatus.PASS, "Berada di form about");
	}
	
	//Test case 2
	@When("Berada di halaman about")
	public void Berada_di_halaman_about() {
		Hooks.delay(2);
		Assert.assertEquals(aboutPage.getTxtTrainer(), "List Trainer");
        extentTest.log(LogStatus.PASS, "Berada di halaman about");
	}
	@And("Klik button tambah")
	public void klik_button_tambah() {
		Hooks.delay(2);
	    aboutPage.klikBtnTambah();
        extentTest.log(LogStatus.PASS, "Klik button tambah");
	}
	@And("Klik choose file kosongkan file")
	public void Klik_choose_file_kosongkan_file() {
    	extentTest.log(LogStatus.PASS, "Klik choose file kosongkan file");
	}
	@And("Isi nama trainer")
	public void isi_nama_trainer() {
		aboutPage.isiNamaTrainer("Jennie");
        extentTest.log(LogStatus.PASS, "Isi nama trainer");
	}
	@And("Isi jabatan trainer")
	public void isi_jabatan_trainer() {
		aboutPage.isiJabatan("Pemula");
        extentTest.log(LogStatus.PASS, "Isi jabatan trainer");
	}
	@And("Isi profile")
	public void isi_profile() {
		aboutPage.isiProfile("Pemula");
        extentTest.log(LogStatus.PASS, "Isi profile");
	}
	@And("Publish no aktif")
	public void publish_no_aktive() {
		aboutPage.selectPublish(1);
    	extentTest.log(LogStatus.PASS, "no aktif");
	}
	@And("Klik simpan")
	public void klik_simpan() {
		Hooks.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan");
	}
	@Then("Gagal simpan")
	public void Gagal_simpan() {
//		Assert.assertEquals(aboutPage.getTxtSuccess(), "Data berhasil di update");
//    	Assert.assertTrue(aboutPage.getTxtSuccess().contains("Data berhasil di update"));
    	Assert.assertTrue(aboutPage.getAttributeRequiredFoto().contains("Pilih file"));
        extentTest.log(LogStatus.PASS, "Gagal simpan");
	}

	
	//Test case 3
	@When("Klik choose file pilih poto nama null")
	public void klik_choose_file_pilih_poto_nama_null() {
		aboutPage.klikBtnUpload("E:\\Punya Utty\\Jennie.JPG");
    	extentTest.log(LogStatus.PASS, "Klik choose file pilih poto nama null");
	}
	@When("Kosongkan nama trainer")
	public void kosongkan_nama_trainer() {
		aboutPage.hapusNamaTrainer();
        extentTest.log(LogStatus.PASS, "Kosongkan nama trainer");
	}
	@When("Isi jabatan trainer nama null")
	public void isi_jabatan_trainer_nama_null() {
		aboutPage.isiJabatan("");
        extentTest.log(LogStatus.PASS, "Isi jabatan trainer nama null");
	}
	@When("Isi profile nama null")
	public void isi_profile_nama_null() {
		aboutPage.isiProfile("");
        extentTest.log(LogStatus.PASS, "Isi profile nama null");
	}
	@When("Publish aktive nama null")
	public void publish_aktive_nama_null() {
		aboutPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Publish aktive nama null");
	}
	@When("Klik simpan nama null")
	public void klik_simpan_nama_null() {
		Hooks.delay(2);
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan nama null");
	}
	@Then("Gagal menambahkan trainer nama null")
	public void gagal_menambahkan_trainer_nama_null() {
//    	Assert.assertFalse(aboutPage.getTxtSuccess().contains("Data berhasil di tambah"));
		Assert.assertTrue(aboutPage.getAttributeRequiredNama().contains("Harap isi bidang ini"));
        extentTest.log(LogStatus.PASS, "Data berhasil di simpan");
	}
	
	//Test case 4
//	@When("Klik choose file pilih foto pdf")
//	public void klik_choose_file_pilih_foto_pdf() {
//		aboutPage.klikBtnUpload("E:\\Punya Utty\\CO.pdf");
//    	extentTest.log(LogStatus.PASS, "Klik choose file pilih foto pdf");
//	}
//	@When("Isi nama trainer foto pdf")
//	public void isi_nama_trainer_foto_pdf() {
//		aboutPage.isiNamaTrainer("Jennie");
//        extentTest.log(LogStatus.PASS, "Isi nama trainer foto pdf");
//	}
//	@When("Isi jabatan trainer foto pdf")
//	public void isi_jabatan_trainer_foto_pdf() {
//		aboutPage.isiJabatan("");
//        extentTest.log(LogStatus.PASS, "Isi jabatan trainer foto pdf");
//	}
//	@When("Isi profile foto pdf")
//	public void isi_profile_foto_pdf() {
//		aboutPage.isiProfile("");
//        extentTest.log(LogStatus.PASS, "Isi profile foto pdf");
//	}
//	@When("Publish no aktive foto pdf")
//	public void publish_no_aktive_foto_pdf() {
//		aboutPage.selectPublish(1);
//    	extentTest.log(LogStatus.PASS, "Publish no aktive foto pdf");
//	}
//	@When("Klik simpan foto pdf")
//	public void klik_simpan_foto_pdf() {
//		Hooks.delay(2);
//		aboutPage.klikBtnSimpan();
//        extentTest.log(LogStatus.PASS, "Klik simpan foto pdf");
//	}
//	@Then("Gagal menambahkan trainer foto pdf")
//	public void gagal_menambahkan_trainer_foto_pdf() {
//		Assert.assertEquals(aboutPage.getTxtFotoPdf(), "The supplied file is not a supported image type");
//    	Assert.assertTrue(aboutPage.getTxtFotoPdf().contains("The supplied file is not a supported image type"));
//        extentTest.log(LogStatus.PASS, "Gagal menambahkan trainer foto pdf");
//	}
	
	//Test case 5
	@When("Klik choose file jabatan null")
	public void klik_choose_file_jabatan_null() {
		aboutPage.klikBtnUpload("E:\\Punya Utty\\Jennie.JPG");
    	extentTest.log(LogStatus.PASS, "Klik choose file jabatan null");
	}
	@When("Isi nama trainer jabatan null")
	public void isi_nama_trainer_jabatan_null() {
		aboutPage.isiNamaTrainer("Jennie");
        extentTest.log(LogStatus.PASS, "Isi nama trainer jabatan null");
	}
	@When("Kosongkan jabatan trainer")
	public void kosongkan_jabatan_trainer() {
		aboutPage.hapusJabatan();
        extentTest.log(LogStatus.PASS, "Kosongkan jabatan trainer");
	}
	@When("Isi profile jabatan null")
	public void isi_profile_jabatan_null() {
		aboutPage.isiProfile("");
        extentTest.log(LogStatus.PASS, "Isi profile jabatan null");
	}
	@When("Publish aktive jabatan null")
	public void publish_aktive_jabatan_null() {
		aboutPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Publish aktive jabatan null");
	}
	@When("Klik simpan jabatan null")
	public void klik_simpan_jabatan_null() {
		Hooks.delay(2);
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan jabatan null");
	}
	@Then("Gagal menambahkan trainer jabatan null")
	public void gagal_menambahkan_trainer_jabatan_null() {
		Assert.assertTrue(aboutPage.getAttributeRequiredJabatan().contains("Harap isi bidang ini"));
        extentTest.log(LogStatus.PASS, "Gagal menambahkan trainer jabatan null");
	}
	
	//Test case 6
	@When("Klik choose file profile null")
	public void klik_choose_file_profile_null() {
		aboutPage.klikBtnUpload("E:\\Punya Utty\\Jennie.JPG");
    	extentTest.log(LogStatus.PASS, "Klik choose file profile null");
	}
	@When("Isi nama trainer profile null")
	public void isi_nama_trainer_profile_null() {
		aboutPage.isiNamaTrainer("");
        extentTest.log(LogStatus.PASS, "Isi nama trainer profile null");
	}
	@When("Isi jabatan trainer profile null")
	public void isi_jabatan_trainer_profile_null() {
		aboutPage.isiJabatan("Profesional");
        extentTest.log(LogStatus.PASS, "Isi jabatan trainer profile null");
	}
	@When("Kosongkan profile")
	public void kosongkan_profile() {
		aboutPage.hapusProfile();
        extentTest.log(LogStatus.PASS, "Kosongkan profile");
	}
	@When("Publish no aktive profile null")
	public void publish_no_aktive_profile_null() {
		aboutPage.selectPublish(1);
    	extentTest.log(LogStatus.PASS, "Publish no aktive profile null");
	}
	@When("Klik simpan profile null")
	public void klik_simpan_profile_null() {
		Hooks.delay(2);
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan profile null");
	}
	@Then("Gagal menambahkan trainer profile null")
	public void gagal_menambahkan_trainer_profile_null() {
		Assert.assertTrue(aboutPage.getAttributeRequiredProfile().contains("Harap isi bidang ini"));
        extentTest.log(LogStatus.PASS, "Gagal menambahkan trainer profile null");
	}

	//Test case 7
	
	@When("Klik choose file photo lalu pilih photo")
	public void klik_choose_file_photo_lalu_pilih_photo() {
		aboutPage.klikBtnUpload("E:\\Punya Utty\\Jennie.JPG");
    	extentTest.log(LogStatus.PASS, "Klik choose file photo lalu pilih photo");
	}
	@When("Isi nama trainer baru")
	public void isi_nama_trainer_baru() {
		aboutPage.isiNamaTrainer("");
        extentTest.log(LogStatus.PASS, "Isi nama trainer baru");
	}
	@When("Isi jabatan trainer baru")
	public void isi_jabatan_trainer_baru() {
		aboutPage.isiJabatan("");
        extentTest.log(LogStatus.PASS, "Isi jabatan trainer baru");
	}
	@When("Isi profile baru")
	public void isi_profile_baru() {
		aboutPage.isiProfile("Suka mengajar");
        extentTest.log(LogStatus.PASS, "Isi profile baru");
	}
	@When("Publish aktive profile baru")
	public void publish_aktive_profile_baru() {
		aboutPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Publish aktive profile baru");
	}
	@When("Klik simpan profile baru")
	public void klik_simpan_profile_baru() {
		Hooks.delay(2);
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan profile baru");
	}
	@Then("Data berhasil di simpan")
	public void data_berhasil_di_simpan() {
		Assert.assertEquals(aboutPage.getTxtSuccess(), "Data berhasil di tambah");
    	Assert.assertTrue(aboutPage.getTxtSuccess().contains("Data berhasil di tambah"));
        extentTest.log(LogStatus.PASS, "Berhasil disimpan");
	}
}
