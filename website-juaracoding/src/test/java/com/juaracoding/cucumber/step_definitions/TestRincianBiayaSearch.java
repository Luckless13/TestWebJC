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
    	extentTest.log(LogStatus.PASS, "Select Harga-Normal");
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
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtZero(), "Total Search : 0 Data");
    	Assert.assertTrue(rincianbiayaPage.getTxtZero().contains("Total Search : 0 Data"));
    	extentTest.log(LogStatus.PASS, "Program tidak ditemukan");
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
	
//	TC10
	@When("Select diskon")
	public void Select_diskon() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.selectOpsi(2);
    	extentTest.log(LogStatus.PASS, "Select Diskon");
	}
	@When("Input diskon null")
	public void input_diskon_null() throws InterruptedException {
		rincianbiayaPage.Search("");
    	extentTest.log(LogStatus.PASS, "Input diskon null");
	}
	@When("Enter diskon null")
	public void enter_diskon_null() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search diskon null credential")
	public void search_diskon_null_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Diskon kosong, Kembali ke page Data Rincian Biaya");
	}
	
//	TC11
	@When("Input diskon huruf")
	public void input_diskon_huruf() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Sepuluh");
    	extentTest.log(LogStatus.PASS, "Input diskon huruf");
	}
	@When("Enter diskon huruf")
	public void enter_diskon_huruf() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search diskon huruf credential")
	public void search_diskon_huruf_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtZero(), "Total Search : 0 Data");
    	Assert.assertTrue(rincianbiayaPage.getTxtZero().contains("Total Search : 0 Data"));
    	extentTest.log(LogStatus.PASS, "Program tidak ditemukan");
	}
	
//	TC12
	@When("Input diskon")
	public void input_diskon() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(1000);
		rincianbiayaPage.Search("51");
    	extentTest.log(LogStatus.PASS, "Input diskon");
	}
	@When("Enter diskon")
	public void enter_diskon() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search diskon credential")
	public void search_diskon_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Program ditemukan");
	}
	
//	TC13
	@When("Select harga diskon")
	public void Select_harga_diskon() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.selectOpsi(3);
    	extentTest.log(LogStatus.PASS, "Select Diskon");
	}
	@When("Input harga diskon null")
	public void input_harga_diskon_null() throws InterruptedException {
		rincianbiayaPage.Search("");
    	extentTest.log(LogStatus.PASS, "Input harga diskon null");
	}
	@When("Enter harga diskon null")
	public void enter_harga_diskon_null() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga diskon null credential")
	public void search_harga_diskon_null_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtData(), "Data Rincian Biaya");
    	Assert.assertTrue(rincianbiayaPage.getTxtData().contains("Data Rincian Biaya"));
    	extentTest.log(LogStatus.PASS, "Harga Diskon kosong, Kembali ke page Data Rincian Biaya");
	}
	
//	TC14
	@When("Input harga diskon huruf")
	public void input_harga_diskon_huruf() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		rincianbiayaPage.Search("Sepuluh");
    	extentTest.log(LogStatus.PASS, "Input harga diskon huruf");
	}
	@When("Enter harga diskon huruf")
	public void enter_harga_diskon_huruf() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga diskon huruf credential")
	public void search_harga_diskon_huruf_credential() {
		AssertJUnit.assertEquals(rincianbiayaPage.getTxtZero(), "Total Search : 0 Data");
    	Assert.assertTrue(rincianbiayaPage.getTxtZero().contains("Total Search : 0 Data"));
    	extentTest.log(LogStatus.PASS, "Program tidak ditemukan");
	}
	
//	TC15
	@When("Input harga diskon")
	public void input__diskon() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
//		rincianbiayaPage.selectOpsi(3);
		rincianbiayaPage.Search("4900000");
    	extentTest.log(LogStatus.PASS, "Input harga diskon");
	}
	@When("Enter harga diskon")
	public void enter_harga_diskon() throws InterruptedException {
		rincianbiayaPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search harga diskon credential")
	public void search_harga_diskon_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(rincianbiayaPage.getProgramyangdicari(), "Pelatihan Bagus");
    	Assert.assertTrue(rincianbiayaPage.getProgramyangdicari().contains("Pelatihan Bagus"));
		extentTest.log(LogStatus.PASS, "Program ditemukan");
	}
}
