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
    
    @When("Kosongkan link fb")
    public void Kosongkan_link_fb() {
    	sosialMediaPage.facebookHapus();
    	extentTest.log(LogStatus.PASS, "Kosongkan link fb");
    }
    @When("Isi link instagram link fb null")
    public void Isi_link_instagram_link_fb_null() {
    	sosialMediaPage.instagram("");
    	extentTest.log(LogStatus.PASS, "Isi link instagram link fb null");
    }
    @When("Isi link youtube link fb null")
    public void Isi_link_youtube_link_fb_null() {
    	sosialMediaPage.youtube("");
    	extentTest.log(LogStatus.PASS, "Isi link youtube link fb null");
    }
    @When("Isi nomor whatsapp link fb null")
    public void Isi_nomor_whatsapp_link_fb_null1() {
    	sosialMediaPage.whatsapp("");
    	extentTest.log(LogStatus.PASS, "Isi nomor whatsapp link fb null");
    }
    @When("Klik button simpan fb null")
    public void Klik_button_simpan_fb_null() {
    	Hooks.delay(2);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    	sosialMediaPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Klik button simpan fb null");
    }
    @Then("Gagal simpan data")
    public void Gagal_simpan_data() {
    	Assert.assertEquals(sosialMediaPage.getTxtFacebook(), "Harap isi facebook");
    	Assert.assertTrue(sosialMediaPage.getTxtFacebook().contains("Harap isi facebook"));
        extentTest.log(LogStatus.PASS, "Gagal simpan data");
    }
    
    //Test case 3
    @When("Isi link facebook link instagram null")
    public void Isi_link_facebook_link_instagram_null() {
    	sosialMediaPage.facebook("https://8.8.8.8/juaracodig");
    	extentTest.log(LogStatus.PASS, "Isi link facebook link instagram null");
    }
    @When("Kosongkan link instagram")
    public void Kosongkan_link_instagram() {
    	sosialMediaPage.instagramHapus();
    	extentTest.log(LogStatus.PASS, "Kosongkan link instagram");
    }
    @When("Isi link youtube link instagram null")
    public void Isi_link_youtube_link_instagram_null() {
    	sosialMediaPage.youtube("");
    	extentTest.log(LogStatus.PASS, "Isi link youtube link instagram null");
    }
    @When("Isi nomor whatsapp link instagram null")
    public void Isi_nomor_whatsapp_link_instagram_null() {
    	sosialMediaPage.whatsapp("");
    	extentTest.log(LogStatus.PASS, "Isi nomor whatsapp link instagram null");
    }
    @When("Klik button simpan link instagram null")
    public void Klik_button_simpan_link_instagram_null() {
    	Hooks.delay(2);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    	sosialMediaPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Klik button simpan link instagram null");
    }
    @Then("Gagal simpan data link instagram null")
    public void Gagal_simpan_data_link_instagram_null() {
    	Assert.assertEquals(sosialMediaPage.getTxtUpdate(), "Data berhasil di update");
    	Assert.assertTrue(sosialMediaPage.getTxtUpdate().contains("Data berhasil di update"));
        extentTest.log(LogStatus.PASS, "Gagal simpan data link instagram null");
    }
    
    @When("Isi link facebook yt null")
    public void Isi_link_facebook_yt_null() {
    	sosialMediaPage.facebook("");
    	extentTest.log(LogStatus.PASS, "Isi link facebook yt null");
    }
    @When("Isi link instagram yt null")
    public void Isi_link_instagram_yt_null() {
    	sosialMediaPage.instagram("https://www.instagram.com/juaracoding");
    	extentTest.log(LogStatus.PASS, "Isi link instagram yt null");
    }
    @When("Kosongkan link youtube")
    public void Kosongkan_link_youtube() {
    	sosialMediaPage.youtubeHapus();
    	extentTest.log(LogStatus.PASS, "IKosongkan link youtube");
    }
    @When("Isi nomor whatsapp yt null")
    public void Isi_nomor_whatsapp_yt_null() {
    	sosialMediaPage.whatsapp("");
    	extentTest.log(LogStatus.PASS, "Isi nomor whatsapp yt null");
    }
    @When("Klik button simpan yt null")
    public void Klik_button_simpan_yt_null() {
    	Hooks.delay(2);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    	sosialMediaPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Klik button simpan yt null");
    }
    @Then("Gagal simpan data yt null")
    public void Gagal_simpan_data_yt_null() {
    	Assert.assertEquals(sosialMediaPage.getTxtUpdate(), "Data berhasil di update");
    	Assert.assertTrue(sosialMediaPage.getTxtUpdate().contains("Data berhasil di update"));
        extentTest.log(LogStatus.PASS, "Gagal simpan data yt null");
    }
    
  //Test case 4
    @When("Isi link facebook wa null")
    public void Isi_link_facebook_wa_null() {
    	sosialMediaPage.facebook("");
    	extentTest.log(LogStatus.PASS, "Isi link facebook wa null");
    }
    @When("Isi link instagram wa null")
    public void Isi_link_instagram_wa_null() {
    	sosialMediaPage.instagram("");
    	extentTest.log(LogStatus.PASS, "Isi link instagram wa null");
    }
    @When("Isi link youtube wa null")
    public void Isi_link_youtube_wa_null() {
    	sosialMediaPage.youtube("https://bit.ly/juaracoding_yt");
    	extentTest.log(LogStatus.PASS, "Isi link youtube wa null");
    }
    @When("Kosongkan nomor whatsapp")
    public void Kosongkan_nomor_whatsapp() {
    	sosialMediaPage.whatsappHapus();
    	extentTest.log(LogStatus.PASS, "Kosongkan nomor whatsapp");
    }
    @When("Klik button simpan wa null")
    public void Klik_button_simpan_wa_null() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    	sosialMediaPage.clickBtnSimpan();
    	extentTest.log(LogStatus.PASS, "Klik button simpan wa null");
    }
    @Then("Gagal simpan data wa null")
    public void Gagal_simpan_data_wa_null() {
    	Assert.assertEquals(sosialMediaPage.getTxtWa(), "Harap isi wa");
    	Assert.assertTrue(sosialMediaPage.getTxtWa().contains("Harap isi wa"));
        extentTest.log(LogStatus.PASS, "Gagal simpan data wa null");
    }
    
 //test case 5
    
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
    	sosialMediaPage.whatsapp("081234567890");
    	extentTest.log(LogStatus.PASS, "Isi nomor whatsapp");
    }
    @When("Klik button simpan")
    public void klik_button_simpan() {
    	Hooks.delay(2);
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
