package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//    Test Case 1
//
		    @When("User go to Web PtDika")
		    public void user_go_to_web_pt_dika() {
		    	driver.get(Constants.URL);
		    	extentTest.log(LogStatus.PASS, "User go to Web Pt Dika");
		    }

			@When("User enter username password valid")
			public void user_enter_username_password_valid() throws InterruptedException {
			  loginPage.login("ucen1315@gmail.com", "a");
			  extentTest.log(LogStatus.PASS, "User enter username password valid");
			}

			@And("User click button login")
			public void user_click_button_login() throws InterruptedException {
			  loginPage.clickBtnLogin();
			  extentTest.log(LogStatus.PASS, "User click button login");
			}

			@Then("User success login")
			public void user_success_login() {
			AssertJUnit.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
			Assert.assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
			extentTest.log(LogStatus.PASS, "User valid credentials");
			}

}

  
