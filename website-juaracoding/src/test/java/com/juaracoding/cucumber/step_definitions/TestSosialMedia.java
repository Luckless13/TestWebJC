package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.SosialMediaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSosialMedia {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private SosialMediaPage sosialMediaPage = new SosialMediaPage();

    public TestSosialMedia() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    //Test Case 1
    @When("Berada di halaman dashboard")
    public void Berada_di_halaman_dashboard() {
    	sosialMediaPage.getTxtDashboard();
        extentTest.log(LogStatus.PASS, "Berada di halaman dashboard");
    }
    
    @When("Klik home")
    public void klik_home() {
    	sosialMediaPage.home();
        extentTest.log(LogStatus.PASS, "Klik home");
    }
    @When("Klik sosial media")
    public void klik_sosial_media() {
    	sosialMediaPage.sosialMedia();
        extentTest.log(LogStatus.PASS, "Klik sosial media");
    }
    @Then("Berada di page sosial media")
    public void berada_di_page_sosial_media() {
    	Assert.assertEquals(sosialMediaPage.getTxtSosialMedia(), "Social Media");
        extentTest.log(LogStatus.PASS, "Berada di page sosial media");
    }
    
    //test case 2
    
    @When("Berada di halaman sosial media")
    public void berada_di_halaman_sosial_media() {
    	sosialMediaPage.getTxtSosialMedia();
    	extentTest.log(LogStatus.PASS, "Berada di halaman sosial media");
    }
    @When("Isi link facebook")
    public void isi_link_facebook() {
    	sosialMediaPage.facebook("");
    	extentTest.log(LogStatus.PASS, "Isi link facebook");
    }
    @When("Isi link instagram")
    public void isi_link_instagram() {
    	sosialMediaPage.instagram("");
    	extentTest.log(LogStatus.PASS, "Isi link instagram");
    }
    @When("Isi link youtube")
    public void isi_link_youtube() {
    	sosialMediaPage.youtube("");
    	extentTest.log(LogStatus.PASS, "Isi link youtube");
    }
    @When("Isi nomor whatsapp")
    public void isi_nomor_whatsapp() {
    	sosialMediaPage.whatsapp("");
    	extentTest.log(LogStatus.PASS, "Isi nomor whatsapp");
    }
    @When("Klik button simpan")
    public void klik_button_simpan() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    	sosialMediaPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Klik button simpan");
    }
    @Then("Berhasil disimpan")
    public void berhasil_disimpan() {
    	Assert.assertEquals(sosialMediaPage.getTxtUpdate(), "Data berhasil di update");
    	Assert.assertTrue(sosialMediaPage.getTxtUpdate().contains("Data berhasil di update"));
//    	Assert.assertEquals(sosialMediaPage.getTxtSosialMedia(), "Social Media");
        extentTest.log(LogStatus.PASS, "Berhasil disimpan");
    }
   }
