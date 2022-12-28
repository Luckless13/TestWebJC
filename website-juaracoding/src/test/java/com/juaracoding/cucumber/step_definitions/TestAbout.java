package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.juaracoding.cucumber.pages.AboutPage;
import com.juaracoding.cucumber.pages.SosialMediaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

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
    
    
    @When("Berada di dashboard")
    public void berada_di_dashboard() {
    	aboutPage.getTxtDashboard();
        extentTest.log(LogStatus.PASS, "Berada di dashboard");
    }
	@When("Klik about")
	public void klik_about() {
		aboutPage.about();
        extentTest.log(LogStatus.PASS, "Klik about");
	}
	@Then("Berada di form about")
	public void berada_di_form_about() {
		Assert.assertEquals(aboutPage.getTxtTrainer(), "List Trainer");
        extentTest.log(LogStatus.PASS, "Berada di form about");
	}
	
}
