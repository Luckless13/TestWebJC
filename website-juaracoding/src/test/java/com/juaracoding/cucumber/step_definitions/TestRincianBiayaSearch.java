package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.RincianBiayaPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRincianBiayaSearch {

	 private static WebDriver driver;
	 private static ExtentTest extentTest;
	 private RincianBiayaPage rincianbiayaPage = new RincianBiayaPage();

	    public TestRincianBiayaSearch() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
//	TC1
	@When("Go to Website PtDika")
	public void go_to_website_pt_dika() {
		driver.get(Constants.URL);
    	WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
		uname.sendKeys("ucen1315@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("a");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
		login.click();
		extentTest.log(LogStatus.PASS, "Go to Web Pt Dika");
	}
	@When("Click home button")
	public void click_home_button() throws InterruptedException {
		rincianbiayaPage.clickBtnHome();
    	extentTest.log(LogStatus.PASS, "Click button home");
	}
	@When("Click Rincian Biaya")
	public void click_rincian_biaya() throws InterruptedException {
		rincianbiayaPage.clickBtnRincianBiaya();
    	extentTest.log(LogStatus.PASS, "Click button Rincian Biaya");
	}
	@Then("Berada di page list Rincian Biaya")
	public void berada_di_page_list_rincian_biaya() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Berada di page Data Rincian Biaya");
	}
	
//	TC2
	@When("Input nama program null")
	public void input_nama_program_null() throws InterruptedException {
		rincianbiayaPage.Search("");
    	extentTest.log(LogStatus.PASS, "Input nama program null");
	}
	@When("Enter nama program null")
	public void enter_nama_program_null() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama program null credential")
	public void search_nama_program_null_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Nama Program kosong, Kembali ke page Data Rincian Biaya");
	}
	
//	TC3
	@When("Input nama program lengkap dengan spasi dibelakang")
	public void input_nama_program_lengkap_dengan_spasi_dibelakang() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Pelatihan Bagus ");
    	extentTest.log(LogStatus.PASS, "Input nama program lengkap dengan spasi dibelakang");
	}
	@When("Enter nama program lengkap dengan spasi dibelakang")
	public void enter_nama_program_lengkap_dengan_spasi_dibelakang() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama program lengkap dengan spasi dibelakang credential")
	public void search_nama_program_lengkap_dengan_spasi_dibelakang_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Nama Peserta tidak ditemukan");
	}
	
//	TC4
	@When("Input nama depan program")
	public void input_nama_depan_program() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Pelatihan");
    	extentTest.log(LogStatus.PASS, "Input nama depan program");
	}
	@When("Enter nama depan program")
	public void enter_nama_depan_program() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama depan program credential")
	public void search_nama_depan_program_credential() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Pencarian Nama Program dengan nama depan ditemukan");
	}
	
//	TC5
	@When("Input nama belakang program")
	public void input_nama_belakang_program() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Bagus");
    	extentTest.log(LogStatus.PASS, "Input nama belakang program");
	}
	@When("Enter nama belakang program")
	public void enter_nama_belakang_program() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama belakang program credential")
	public void search_nama_belakang_program_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Pencarian Nama Program dengan nama belakang ditemukan");
	}
	
//	TC6
	@When("Input nama program lengkap")
	public void input_nama_program_lengkap() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Pelatihan Bagus");
    	extentTest.log(LogStatus.PASS, "Input nama belakang program");
	}
	@When("Enter nama program lengkap")
	public void enter_nama_program_lengkap() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama program lengkap credential")
	public void search_nama_program_lengkap_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Nama Program ditemukan");
	}
	
//	TC7
	@When("Select harga normal")
	public void Select_harga_normal() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.selectOpsi(1);
    	extentTest.log(LogStatus.PASS, "Select rating");
	}
	@When("Input harga normal null")
	public void input_harga_normal_null() throws InterruptedException {
		rincianbiayaPage.Search("");
    	extentTest.log(LogStatus.PASS, "Input harga normal null");
	}
	@When("Enter harga normal null")
	public void enter_harga_normal_null() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga program null credential")
	public void Search_harga_program_null_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Harga kosong, Kembali ke page Data Rincian Biaya");
	}
	
	
//	TC8
	@When("Input harga normal huruf")
	public void input_harga_huruf() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Sepuluh");
    	extentTest.log(LogStatus.PASS, "Input harga normal huruf");
	}
	@When("Enter harga normal huruf")
	public void enter_harga_huruf() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga program huruf credential")
	public void Search_harga_program_huruf_credential() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
//    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
//		extentTest.log(LogStatus.PASS, "Program ditemukan");
//		extentTest.log(LogStatus.FAIL, "Program tidak ditemukan");
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Program ditemukan");
	}
	
//	TC9
	@When("Input harga normal")
	public void input_harga() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("10000000");
    	extentTest.log(LogStatus.PASS, "Input harga normal");
	}
	@When("Enter harga normal")
	public void enter_harga() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga normal credential")
	public void Search_harga_normal_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Nama Program ditemukan");
	}
}
