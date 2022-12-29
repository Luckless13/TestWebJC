package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.PrivilegePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestPrivilege {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private PrivilegePage privilegePage = new PrivilegePage();

    public TestPrivilege() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
//    Test Case 1
    
    @When("user klik navbar about")
    public void user_klik_navbar_about() throws InterruptedException{
    	privilegePage.clickAbout();
    	extentTest.log(LogStatus.PASS, "user klik navbar about");
    }
    
    @Then("User berada pada halaman trainer")
    public void user_berada_pada_halaman_trainer() {
    	AssertJUnit.assertEquals(privilegePage.getTxtAbout(), "List Trainer");
    	Assert.assertTrue(privilegePage.getTxtAbout().contains("List Trainer"));
    	extentTest.log(LogStatus.PASS, "User berada pada halaman trainer");
    }
    
//    Test Case 2
    
    @When("User klik navbar blog")
    public void user_klik_navbar_blog() throws InterruptedException {
    	privilegePage.clickBlog();
    	extentTest.log(LogStatus.PASS, "user klik navbar blog");
    }
    @Then("User berada pada halaman blog")
    public void user_berada_pada_halaman_blog() {
    	AssertJUnit.assertEquals(privilegePage.getTxtBlog(), "List Blog");
    	Assert.assertTrue(privilegePage.getTxtBlog().contains("List Blog"));
    	extentTest.log(LogStatus.PASS, "User berada pada halaman blog");
    }
    
//    Test Case 3
    
    @When("User klik navbar Contact Messages")
    public void user_klik_navbar_contact_messages() throws InterruptedException {
    	privilegePage.clickContact();
    	extentTest.log(LogStatus.PASS, "user klik navbar Contact Message");
    }
    @Then("User berada pada halaman Contact Messages")
    public void user_berada_pada_halaman_contact_messages() {
    	AssertJUnit.assertEquals(privilegePage.getTxtContact(), "Data Contact Messages");
    	Assert.assertTrue(privilegePage.getTxtContact().contains("Data Contact Messages"));
    	extentTest.log(LogStatus.PASS, "User berada pada halaman Data Contact Messages");
    }
    
//    Test Case 4
    
    @When("User klik navbar Gallery")
    public void user_klik_navbar_gallery() throws InterruptedException {
    	privilegePage.clickGallery();
    	extentTest.log(LogStatus.PASS, "user klik navbar Contact Message");
    }
    @Then("User berada pada halaman Gallery")
    public void user_berada_pada_halaman_gallery() {
    	AssertJUnit.assertEquals(privilegePage.getTxtGallery(), "List Gallery");
    	Assert.assertTrue(privilegePage.getTxtGallery().contains("List Gallery"));
    	extentTest.log(LogStatus.PASS, "User berada pada halaman List Gallery");
    }
    
    @When("User klik navbar Home")
    public void user_klik_navbar_home() {
    	privilegePage.clickHome();
    	extentTest.log(LogStatus.PASS, "user klik navbar Home");
    }
    @Then("Menampilkan menu pada home")
    public void menampilkan_menu_pada_home() throws InterruptedException {
//    	AssertJUnit.assertEquals(privilegePage.listHome(), "List Gallery");
//    	Assert.assertTrue(privilegePage.listHome().contains("List Gallery"));
//    	privilegePage.listHome();
    	
//    	System.out.println(privilegePage.listHome());
    	privilegePage.listHome();
    	extentTest.log(LogStatus.PASS, "User berada pada halaman List Home");
    }
    
}
