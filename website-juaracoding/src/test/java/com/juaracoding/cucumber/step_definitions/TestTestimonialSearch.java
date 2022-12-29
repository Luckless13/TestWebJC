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

public class TestTestimonialSearch {
	
	 private static WebDriver driver;
	 private static ExtentTest extentTest;
	 private TestimonialPage testimonialPage = new TestimonialPage();

	    public TestTestimonialSearch() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
	
//	TestCase 1
	    @When("Web PtDika")
		public void web_pt_dika() {
			driver.get(Constants.URL);
	    	extentTest.log(LogStatus.PASS, "Go to Web Pt Dika");
	    	WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
			uname.sendKeys("ucen1315@gmail.com");
			WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			password.sendKeys("a");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[3]/button"));
			login.click();
		}
	
		@And("Home")
		public void home() throws InterruptedException {
	    	testimonialPage.clickBtnHome();
	    	extentTest.log(LogStatus.PASS, "Click button home");
		}
	
		@And("Testimonial")
		public void testimonial() throws InterruptedException{
			testimonialPage.clickBtnTestimonial();
	    	extentTest.log(LogStatus.PASS, "Click button testimonial");
		}
	
		@Then("Page list testimonial")
		public void page_list_testimonial() {
			AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
	    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
	    	extentTest.log(LogStatus.PASS, "Berada di page list testimonial");
		}
	
//	TestCase 2
	@When("Scroll down valid")
	public void scroll_down_valid() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		extentTest.log(LogStatus.PASS, "Scroll Down");
	}

	@And("Click grid page valid")
	public void click_grid_page_valid() throws InterruptedException {
		testimonialPage.clickNextpage();
    	extentTest.log(LogStatus.PASS, "Click Grid Next Page");
	}

	@Then("Next page valid credential")
	public void next_page_valid_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(testimonialPage.getActivePage(), "active page-item");
    	Assert.assertTrue(testimonialPage.getActivePage().contains("active page-item"));
    	extentTest.log(LogStatus.PASS, "Berada di Next Page");
	}

//	TestCase 3
	@When("Scroll down invalid")
	public void scroll_down_invalid() {
		driver.navigate().back();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		extentTest.log(LogStatus.PASS, "Scroll Down");
	}

	@And("Click grid page invalid")
	public void click_grid_page_invalid() throws InterruptedException {
		testimonialPage.clickNextpage();
    	extentTest.log(LogStatus.PASS, "Click Grid Next Page");
	}

	@Then("Next page invalid credential")
	public void next_page_invalid_credential() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		AssertJUnit.assertEquals(testimonialPage.getUnActivePage(), "page-item");
    	Assert.assertTrue(testimonialPage.getUnActivePage().contains("page-item"));
    	extentTest.log(LogStatus.PASS, "Berada di Next Page");
	}

//	TestCase 4
	@When("Input nama peserta null")
	public void input_nama_peserta_null() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.Search("");
    	extentTest.log(LogStatus.PASS, "Input nama peserta null");
	}

	@And("Enter nama peserta null")
	public void enter_nama_peserta_null() throws InterruptedException {
		testimonialPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	
	@Then("Search nama peserta null credential")
	public void search_nama_peserta_null_credential() {
		AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
    	extentTest.log(LogStatus.PASS, "Nama Peserta kosong, Kembali ke page list testimonial");
	}

//	TestCase 5
	@When("Input nama peserta lengkap dengan spasi dibelakang")
	public void input_nama_peserta_lengkap_dengan_spasi_dibelakang() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.Search("Test 13 ");
    	extentTest.log(LogStatus.PASS, "Input nama peserta lengkap dengan spasi dibelakang");
	}

	@And("Enter nama peserta lengkap dengan spasi dibelakang")
	public void enter_nama_peserta_lengkap_dengan_spasi_dibelakang() throws InterruptedException {
		testimonialPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	
	@Then("Search nama peserta lengkap dengan spasi dibelakang credential")
	public void search_nama_peserta_lengkap_dengan_spasi_dibelakang_credential() {
		AssertJUnit.assertEquals(testimonialPage.getTxtTestimonial(), "List Testimonial");
    	Assert.assertTrue(testimonialPage.getTxtTestimonial().contains("List Testimonial"));
    	extentTest.log(LogStatus.PASS, "Nama Peserta tidak ditemukan");
	}

//	TestCase 6
	@When("Input nama nama depan peserta")
	public void input_nama_nama_depan_peserta() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.Search("Test");
    	extentTest.log(LogStatus.PASS, "Input nama nama depan peserta");
	}

	@And("Enter nama nama depan peserta")
	public void enter_nama_nama_depan_peserta() throws InterruptedException {
		testimonialPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	
	@Then("Search nama depan peserta credential")
	public void search_nama_depan_peserta_credential() {
		AssertJUnit.assertEquals(testimonialPage.getNamayangdicari(), "Test 13");
    	Assert.assertTrue(testimonialPage.getNamayangdicari().contains("Test 13"));
		extentTest.log(LogStatus.PASS, "Pencarian Nama Peserta dengan nama depan ditemukan");
	}

//	TestCase 7
	@When("Input nama belakang peserta")
	public void input_nama_belakang_peserta() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.Search("13");
    	extentTest.log(LogStatus.PASS, "Input nama belakang peserta");
	}

	@And("Enter nama belakang peserta")
	public void enter_nama_belakang_peserta() throws InterruptedException {
		testimonialPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	
	@Then("Search nama belakang peserta credential")
	public void search_nama_belakang_peserta_credential() {
		AssertJUnit.assertEquals(testimonialPage.getNamayangdicari(), "Test 13");
    	Assert.assertTrue(testimonialPage.getNamayangdicari().contains("Test 13"));
		extentTest.log(LogStatus.PASS, "Pencarian Nama Peserta dengan nama belakang ditemukan");
	}

//	TestCase 8
	@When("Input nama peserta lengkap")
	public void input_nama_peserta_lengkap() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		testimonialPage.Search("Test 13");
    	extentTest.log(LogStatus.PASS, "Input nama peserta lengkap");
	}
	@When("Enter nama peserta lengkap")
	public void enter_nama_peserta_lengkap() throws InterruptedException {
		testimonialPage.Enter();
		extentTest.log(LogStatus.PASS, "Tekan Enter");
	}
	@Then("Search nama peserta lengkap credential")
	public void search_nama_peserta_lengkap_credential() {
		AssertJUnit.assertEquals(testimonialPage.getNamayangdicari(), "Test 13");
    	Assert.assertTrue(testimonialPage.getNamayangdicari().contains("Test 13"));
		extentTest.log(LogStatus.PASS, "Nama Peserta ditemukan");
	}
}
