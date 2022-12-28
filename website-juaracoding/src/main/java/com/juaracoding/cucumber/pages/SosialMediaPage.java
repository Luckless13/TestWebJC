package com.juaracoding.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class SosialMediaPage {
	 private WebDriver driver;
	 
	 public SosialMediaPage () {
		 this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	 }
	 
// Test case 1
	 @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
	    WebElement txtDashboard;
	 
	 @FindBy(xpath = "//span[normalize-space()='Home']")
	    WebElement home;
	 
	 @FindBy(xpath = "//a[normalize-space()='Social Media']")
	    WebElement sosialMedia;
	 
	 @FindBy(xpath = "//h3[normalize-space()='Social Media']")
	 	WebElement txtSosialMedia;
	 
	 
	 public String getTxtDashboard() {
	    	return txtDashboard.getText();
	    }
	 
	 public void home(){
		 home.click();
	    }
	 
	 public void sosialMedia(){
		 sosialMedia.click();
	    }
	 
	 public String getTxtSosialMedia() {
	    	return txtSosialMedia.getText();
	    }

	 //Test case 2
	 @FindBy(xpath = "//input[@id='link_fb']")
	 WebElement inputFacebook;
	 
	 @FindBy(xpath = "//input[@id='link_ig']")
	 WebElement inputInstagram;
	 
	 @FindBy(xpath = "//input[@id='link_youtube']")
	 WebElement inputYoutube;
	 
	 @FindBy(xpath = "//input[@id='link_wa']")
	 WebElement inputWhatsapp;
	 
	 @FindBy(xpath = "//input[@name='mysubmit']")
	 WebElement btnSimpan;
	 
	 @FindBy(xpath = "//*[@id=\"frmregister\"]/alert")
	 WebElement txtUpdate;
	 
	 public void facebook(String inputFacebook){
	        this.inputFacebook.sendKeys(inputFacebook);
	    }
	 public void instagram(String inputInstagram){
	        this.inputInstagram.sendKeys(inputInstagram);
	    }
	 public void youtube(String inputYoutube){
	        this.inputYoutube.sendKeys(inputYoutube);
	    }
	 public void whatsapp(String inputWhatsapp){
	        this.inputWhatsapp.sendKeys(inputWhatsapp);
	    }
	 public void clickBtnSimpan(){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",btnSimpan);
	        btnSimpan.click();
	    }
	 public String getTxtUpdate() {
	    	return txtUpdate.getText();
	    }
}
