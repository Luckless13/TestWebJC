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

public class TestRincianBiayaEdit {

	 private static WebDriver driver;
	 private static ExtentTest extentTest;
	 private RincianBiayaPage rincianbiayaPage = new RincianBiayaPage();

	    public TestRincianBiayaEdit() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
	    
//	    TC1
	    @When("Click edit button")
	    public void click_edit_button() throws InterruptedException {
	    	driver.get(Constants.URL);
	    	WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
			uname.sendKeys("ucen1315@gmail.com");
			WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			password.sendKeys("a");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
			login.click();
			rincianbiayaPage.clickBtnHome();
			rincianbiayaPage.clickBtnRincianBiaya();
			rincianbiayaPage.Search("Test Program");
			rincianbiayaPage.Enter();
	    	
	    	rincianbiayaPage.clickBtnEdit();
	    	extentTest.log(LogStatus.PASS, "Click button edit");
	    }
	    
	    @When("Hapus nama program")
	    public void hapus_nama_program() throws InterruptedException {
	    	rincianbiayaPage.ClearNama();
	    	rincianbiayaPage.EditNamaProgram("");
	    	extentTest.log(LogStatus.PASS, "Input Nama Program null");
	    }
	    
	    @When("Hapus harga normal")
	    public void hapus_harga_normal() throws InterruptedException {
	    	rincianbiayaPage.ClearHarga();
	    	rincianbiayaPage.EditHarga("");
	    	extentTest.log(LogStatus.PASS, "Input Harga Normal null");
	    }

	    @When("Hapus diskon")
	    public void hapus_diskon() throws InterruptedException {
	    	rincianbiayaPage.ClearDiskon();
	    	rincianbiayaPage.EditDiskon("");
	    	extentTest.log(LogStatus.PASS, "Input Diskon null");
	    }

	    @When("Hapus keunggulan1")
	    public void hapus_keunggulan1() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan1();
	    	rincianbiayaPage.EditKeunggulan1("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 1 null");
	    }

	    @When("Hapus keunggulan2")
	    public void hapus_keunggulan2() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan2();
	    	rincianbiayaPage.EditKeunggulan2("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 2 null");
	    }

	    @When("Hapus keunggulan3")
	    public void hapus_keunggulan3() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan3();
	    	rincianbiayaPage.EditKeunggulan3("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 3 null");
	    }

	    @When("Hapus keunggulan4")
	    public void hapus_keunggulan4() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan4();
	    	rincianbiayaPage.EditKeunggulan4("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 4 null");
	    }

	    @When("Hapus keunggulan5")
	    public void hapus_keunggulan5() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan5();
	    	rincianbiayaPage.EditKeunggulan5("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 5 null");
	    }

	    @When("Click simpan program null")
	    public void click_simpan_program_null() throws InterruptedException {
	        rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program null credential")
	    public void edit_program_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtAlertNamaProgram(), "Harap isi nama program");
	    	Assert.assertTrue(rincianbiayaPage.getTxtAlertNamaProgram().contains("Harap isi nama program"));
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtAlertkeunggulan1(), "Harap isi keunggulan program");
	    	Assert.assertTrue(rincianbiayaPage.getTxtAlertkeunggulan1().contains("Harap isi keunggulan program"));
	    	extentTest.log(LogStatus.PASS, "Gagal Edit Rincian Biaya, Semua data kosong");
	    }

//	    TC2
	    @When("Edit nama program null")
	    public void edit_nama_program_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearNama();
	    	rincianbiayaPage.EditNamaProgram("");
	    	extentTest.log(LogStatus.PASS, "Edit nama program null");
	    }

	    @When("Click simpan nama program null")
	    public void click_simpan_nama_program_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program nama program null credential")
	    public void edit_program_nama_program_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtAlertNamaProgram(), "Harap isi nama program");
	    	Assert.assertTrue(rincianbiayaPage.getTxtAlertNamaProgram().contains("Harap isi nama program"));
	    	extentTest.log(LogStatus.PASS, "Gagal Edit Rincian Biaya, Nama Program kosong");
	    }

//	    TC3
	    @When("Edit harga normal null")
	    public void edit_harga_normal_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearHarga();
	    	rincianbiayaPage.EditHarga("");
	    	extentTest.log(LogStatus.PASS, "Input Harga Normal null");
	    }

	    @When("Click simpan harga normal null")
	    public void click_simpan_harga_normal_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program harga normal null credential")
	    public void edit_program_harga_normal_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtEditRincianBiaya(), "Edit Rincian Biaya");
	    	Assert.assertTrue(rincianbiayaPage.getTxtEditRincianBiaya().contains("Edit Rincian Biaya"));
	    	extentTest.log(LogStatus.PASS, "Gagal Edit Rincian Biaya, Harga Normal kosong");
	    }

//	    TC4
	    @When("Input keunggulan1 null")
	    public void input_keunggulan1_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearKeunggulan1();
	    	rincianbiayaPage.EditKeunggulan1("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 1 null");
	    }

	    @When("Click simpan keunggulan1 null")
	    public void click_simpan_keunggulan1_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program keunggulan1 null credential")
	    public void edit_program_keunggulan1_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtAlertkeunggulan1(), "Harap isi keunggulan program");
	    	Assert.assertTrue(rincianbiayaPage.getTxtAlertkeunggulan1().contains("Harap isi keunggulan program"));
	    	extentTest.log(LogStatus.PASS, "Gagal Edit Rincian Biaya, Keunggulan 1 kosong");
	    }

//	    TC5
	    @When("Input keunggulan2 null")
	    public void input_keunggulan2_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearKeunggulan2();
	    	rincianbiayaPage.EditKeunggulan2("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 2 null");
	    }

	    @When("Click simpan keunggulan2 null")
	    public void click_simpan_keunggulan2_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program keunggulan2 null credential")
	    public void edit_program_keunggulan2_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }

//	    TC6
	    @When("Input keunggulan3 null")
	    public void input_keunggulan3_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearKeunggulan3();
	    	rincianbiayaPage.EditKeunggulan3("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 3 null");
	    }

	    @When("Click simpan keunggulan3 null")
	    public void click_simpan_keunggulan3_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program keunggulan3 null credential")
	    public void edit_program_keunggulan3_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }

//	    TC7
	    @When("Input keunggulan4 null")
	    public void input_keunggulan4_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearKeunggulan4();
	    	rincianbiayaPage.EditKeunggulan4("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 4 null");
	    }

	    @When("Click simpan keunggulan4 null")
	    public void click_simpan_keunggulan4_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program keunggulan4 null credential")
	    public void edit_program_keunggulan4_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }

//	    TC8
	    @When("Input keunggulan5 null")
	    public void input_keunggulan5_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearKeunggulan5();
	    	rincianbiayaPage.EditKeunggulan5("");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 5 null");
	    }

	    @When("Click simpan keunggulan5 null")
	    public void click_simpan_keunggulan5_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program keunggulan5 null credential")
	    public void edit_program_keunggulan5_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }

//	    TC9
	    @When("Edit diskon null")
	    public void edit_diskon_null() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
	    	rincianbiayaPage.ClearDiskon();
	    	rincianbiayaPage.EditDiskon("");
	    	extentTest.log(LogStatus.PASS, "Input Diskon null");
	    }
	    
	    @When("Click simpan diskon null")
	    public void click_simpan_diskon_null() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }

	    @Then("Edit program diskon null credential")
	    public void edit_program_diskon_null_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }

//	    TC10
	    @When("Input nama program baru")
	    public void input_nama_program_baru() throws InterruptedException {
	    	driver.navigate().back();
			driver.navigate().refresh();
			rincianbiayaPage.ClearHarga();
	    	rincianbiayaPage.EditHarga("Test Programs");
	    	extentTest.log(LogStatus.PASS, "Input Harga Normal Baru");
	    }

	    @When("Input harga normal baru")
	    public void input_harga_normal_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearHarga();
	    	rincianbiayaPage.EditHarga("12000000");
	    	extentTest.log(LogStatus.PASS, "Input Harga Normal Baru");
	    }

	    @When("Input diskon baru")
	    public void input_diskon_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearDiskon();
	    	rincianbiayaPage.EditDiskon("52");
	    	extentTest.log(LogStatus.PASS, "Input Diskon Baru");
	    }

	    @When("Input keunggulan1 baru")
	    public void input_keunggulan1_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan1();
	    	rincianbiayaPage.EditKeunggulan1("Bagus");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 1 Baru");
	    }

	    @When("Input keunggulan2 baru")
	    public void input_keunggulan2_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan2();
	    	rincianbiayaPage.EditKeunggulan2("Bagus");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 2 Baru");
	    }

	    @When("Input keunggulan3 baru")
	    public void input_keunggulan3_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan3();
	    	rincianbiayaPage.EditKeunggulan3("Bagus");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 3 Baru");
	    }

	    @When("Input keunggulan4 baru")
	    public void input_keunggulan4_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan4();
	    	rincianbiayaPage.EditKeunggulan4("Bagus");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 4 Baru");
	    }

	    @When("Input keunggulan5 baru")
	    public void input_keunggulan5_baru() throws InterruptedException {
	    	rincianbiayaPage.ClearKeunggulan5();
	    	rincianbiayaPage.EditKeunggulan5("Bagus");
	    	extentTest.log(LogStatus.PASS, "Input Keunggulan 5 Baru");
	    }

	    @When("Click simpan edit program baru")
	    public void Click_simpan_edit_program_baru() throws InterruptedException {
	    	rincianbiayaPage.ClickBtnSimpan();
	        extentTest.log(LogStatus.PASS, "Click Simpan");
	    }
	    
	    @Then("Edit program credential")
	    public void edit_program_credential() throws InterruptedException {
	    	AssertJUnit.assertEquals(rincianbiayaPage.getTxtDataBerhasilUpdate(), "Data berhasil di update");
	    	Assert.assertTrue(rincianbiayaPage.getTxtDataBerhasilUpdate().contains("Data berhasil di update"));
	    	extentTest.log(LogStatus.PASS, "Data berhasil di update");
	    }
}
