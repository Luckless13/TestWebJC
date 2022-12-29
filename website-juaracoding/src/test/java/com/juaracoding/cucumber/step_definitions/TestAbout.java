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
    @When("Go to web")
    public void Go_to_web() {
    	driver.get(Constants.URL);
        WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
		uname.sendKeys("ucen1315@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("a");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
		login.click();
		extentTest.log(LogStatus.PASS, "Go to web");
    }
    
	@When("Klik about")
	public void klik_about() throws InterruptedException {
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
		Assert.assertEquals(aboutPage.getTxtTrainer(), "List Trainer");
        extentTest.log(LogStatus.PASS, "Berada di halaman about");
	}
	@And("Klik button tambah")
	public void klik_button_tambah() {
	    aboutPage.klikBtnTambah();
        extentTest.log(LogStatus.PASS, "Klik button tambah");
	}
	@And("Klik choose file pilih foto")
	public void klik_choose_file_pilih_foto() {
		driver.navigate().back();
		driver.navigate().refresh();
		aboutPage.klikBtnUpload("E:\\Punya Utty\\Jennie.JPG");
    	extentTest.log(LogStatus.PASS, "Klik choose file pilih foto");
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
	@And("Publish aktive")
	public void publish_aktive() {
		aboutPage.selectPublish(0);
    	extentTest.log(LogStatus.PASS, "Publish aktive");
	}
	@And("Klik simpan")
	public void klik_simpan() {
		aboutPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan");
	}
	@Then("Data berhasil di simpan")
	public void Data_berhasil_di_simpan() {
		Assert.assertEquals(aboutPage.getTxtSuccess(), "Data berhasil di update");
    	Assert.assertTrue(aboutPage.getTxtSuccess().contains("Data berhasil di update"));
//    	Assert.assertEquals(sosialMediaPage.getTxtSosialMedia(), "Social Media");
        extentTest.log(LogStatus.PASS, "Data berhasil di simpan");
	}

}
