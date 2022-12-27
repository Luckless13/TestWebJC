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
    
		    @When("User go to Web PtDika")
		    public void user_go_to_web_pt_dika() {
		    	driver.get(Constants.URL);
		    	extentTest.log(LogStatus.PASS, "User go to Web Pt Dika");
		    }
		    @And("User enter username and password null")
		    public void user_enter_username_and_password_null() throws InterruptedException {
		    	loginPage.login("", "");
		    	extentTest.log(LogStatus.PASS, "User enter password valid and username null");
		    }
		    @And("User click button login valid")
		    public void user_click_button_login_valid() throws InterruptedException {
		    	loginPage.clickBtnLogin();
		    	extentTest.log(LogStatus.PASS, "User click button login");
		    }
		    @Then("User invalid credentials username and password")
		    public void user_invalid_credentials_username_and_password() throws InterruptedException {
		    	AssertJUnit.assertEquals(loginPage.getTxtErrorLogin(), "username Atau Password Kosong");
		    	Assert.assertTrue(loginPage.getTxtErrorLogin().contains("username Atau Password Kosong"));
		    	loginPage.clickBtnOk();
		    	extentTest.log(LogStatus.PASS, "User invalid credentials username");
		    }
   
    		//Test Case 2

			
			@When("User enter username null")
			public void user_enter_username_null() throws InterruptedException {
				driver.navigate().refresh();
				loginPage.login("", "a");
				  extentTest.log(LogStatus.PASS, "User enter password valid and username null");
			}
			@And("User klik button login valid")
			public void user_klik_button_login_valid() throws InterruptedException {
				loginPage.clickBtnLogin();
				  extentTest.log(LogStatus.PASS, "User klik button login");
			}
			@Then("User invalid credentials username")
			public void user_invalid_credentials_username() throws InterruptedException {
				AssertJUnit.assertEquals(loginPage.getTxtErrorLogin(), "username Atau Password Kosong");
				Assert.assertTrue(loginPage.getTxtErrorLogin().contains("username Atau Password Kosong"));
				loginPage.clickBtnOk();
				extentTest.log(LogStatus.PASS, "User invalid credentials username");
			}	
			
//			Test Case 3
			
			@When("User enter password null")
			public void user_enter_password_null() throws InterruptedException {
				driver.navigate().refresh();
				loginPage.login("ucen1315@gmail.com", "");
				extentTest.log(LogStatus.PASS, "User enter username valid, password null");
			}
			
			@And("User click btn login ")
			public void user_click_btn_login() throws InterruptedException {
				loginPage.clickBtnLogin();
				  extentTest.log(LogStatus.PASS, "User click button login");
			}
			
			@Then("User invalid credentials password")
			public void user_invalid_credentials_password() throws InterruptedException {
				AssertJUnit.assertEquals(loginPage.getTxtErrorLogin(), "username Atau Password Kosong");
				Assert.assertTrue(loginPage.getTxtErrorLogin().contains("username Atau Password Kosong"));
				loginPage.clickBtnOk();
				extentTest.log(LogStatus.PASS, "User invalid credentials password");
			}
			
		
//			Test Case 4
			
			@When("User enter username salah")
			public void user_enter_username_salah() throws InterruptedException {
				driver.navigate().refresh();
				loginPage.login("ucen13@gmail.com", "a");
				extentTest.log(LogStatus.PASS, "User enter username invalid, password valid");
			}
			@And("User klik button login")
			public void user_klik_button_login() throws InterruptedException {
				loginPage.clickBtnLogin();
				  extentTest.log(LogStatus.PASS, "User click button login");
			}
			@Then("gagal masuk username salah")
			public void gagal_masuk_username_salah() {
				AssertJUnit.assertEquals(loginPage.getTxtErrorMessage(), "Username Atau Password Salah");
				Assert.assertTrue(loginPage.getTxtErrorMessage().contains("Username Atau Password Salah"));
				extentTest.log(LogStatus.PASS, "User invalid credentials username");
			}
			
//			Test Case 5
			
			@When("User input password salah")
			public void user_input_password_salah() throws InterruptedException {
				driver.navigate().refresh();
				loginPage.login("ucen1315@gmail.com", "A");
				extentTest.log(LogStatus.PASS, "User input password salah");
			}
			@And("klik button login")
			public void klik_button_login() throws InterruptedException {
				loginPage.clickBtnLogin();
				  extentTest.log(LogStatus.PASS, "klik button login");
			}
			@Then("gagal masuk password salah")
			public void gagal_masuk_password_salah() throws InterruptedException {
				AssertJUnit.assertEquals(loginPage.getTxtErrorMessage(), "Username Atau Password Salah");
				Assert.assertTrue(loginPage.getTxtErrorMessage().contains("Username Atau Password Salah"));
				extentTest.log(LogStatus.PASS, "gagal masuk password salah");
			}
						
			
//			Test Case 6
			
			@When("User enter username uppercase and password Valid")
			public void user_enter_username_uppercase_and_password_valid() throws InterruptedException {
				loginPage.login("UCEN1315@GMAIL.COM", "a");
				  extentTest.log(LogStatus.PASS, "User enter username uppercase and password Valid");
			}
			@And("User klik login")
			public void user_klikbutton_login() throws InterruptedException {
			  loginPage.clickBtnLogin();
			  extentTest.log(LogStatus.PASS, "User klik login");
			}
			@When("User berhasil Login")
			public void user_berhasil_login() {
				AssertJUnit.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
				Assert.assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
				extentTest.log(LogStatus.PASS, "User berhasil Login");
			}
			@Then("User click Logout")
			public void user_click_logout() throws InterruptedException {
				loginPage.hold();
				loginPage.clickBtnLogout();
				  extentTest.log(LogStatus.PASS, "User click Logout");
			}

//			Test Chase 7
			
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

  
