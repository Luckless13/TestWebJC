package com.juaracoding.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AboutPage {
	
	private static final JavascriptExecutor driver = null;

	@FindBy(xpath= "//span[normalize-space()='About']")
    WebElement btnAbout;
	
	@FindBy(xpath = "//h3[normalize-space()='List Trainer']")
 	WebElement txtTrainer;

	@FindBy (xpath= "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/a")
	WebElement btnTambah; 
	
	@FindBy (xpath= "//*[@id=\"frmregister\"]/div[2]/div/div[1]/div/input")
	WebElement btnUpload; 
	
	@FindBy (xpath= "//input[@placeholder='Nama Trainer']t")
	WebElement namaTrainer; 
	
	@FindBy (xpath= "//input[@placeholder='Jabatan']")
	WebElement jabatan;
	
	@FindBy (xpath= "//textarea[@name='isi_profil']")
	WebElement profile;
	
	@FindBy (xpath = "//select[@id='exampleFormControlSelect9']")
	WebElement publish;
	
	@FindBy (xpath = "//input[@name='mysubmit']")
	WebElement btnSimpan;
	
	@FindBy (xpath = "//alert[@class='alert alert-success']")
	 WebElement txtSuccess;
	 
	 public void klikBtnAbout(){
			btnAbout.click();	
		}
	 
	 public String getTxtTrainer() {
	    	return txtTrainer.getText();
	    }
	 public void klikBtnTambah(){
			btnTambah.click();	
		}
	 public void klikBtnUpload(String photo){
			btnUpload.sendKeys(photo);	
		}
	 public void isiNamaTrainer(String inputNama){
	        this.namaTrainer.sendKeys(inputNama);
	    }
	 public void isiJabatan(String inputJabatan){
	        this.jabatan.sendKeys(inputJabatan);
	    }
	 public void isiProfile(String inputProfile){
	        this.profile.sendKeys(inputProfile);
	    }
	 public void selectPublish(int index){
	        Select selectedPublish = new Select(publish);  
	        selectedPublish.selectByIndex(index);
	 }
	 
	 public void klikBtnSimpan(){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",btnSimpan);
	        btnSimpan.click();
	    }
	 
	 public String getTxtSuccess() {
	    	return txtSuccess.getText();
	    }
}
