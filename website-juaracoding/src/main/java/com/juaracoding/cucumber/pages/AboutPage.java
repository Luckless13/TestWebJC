package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage {

	@FindBy(xpath = "//*[@id=\\\"simple-bar\\\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
    WebElement txtDashboard;
	
	@FindBy(xpath = "//span[normalize-space()='About']")
    WebElement about;
	
	@FindBy(xpath = "//h3[normalize-space()='List Trainer']")
 	WebElement txtTrainer;
	
	 public String getTxtDashboard() {
	    	return txtDashboard.getText();
	    }
	 
	 public void about(){
		 about.click();
	    }
	 
	 public String getTxtTrainer() {
	    	return txtTrainer.getText();
	    }
	 
	 @FindBy(xpath = "//a[@class='btn btn-gradient']")
	 WebElement btnTambah;
	 
	 public void btnTambah(){
		 btnTambah.click();
	    }
}
