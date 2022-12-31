package com.juaracoding.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class AboutPage {
	private WebDriver driver;
	 
	 public AboutPage () {
		 this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
    WebElement txtDashboard;
	
	@FindBy(xpath= "//span[normalize-space()='About']")
    WebElement btnAbout;
	
	@FindBy(xpath = "//h3[normalize-space()='List Trainer']")
 	WebElement txtTrainer;

	@FindBy (xpath= "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/a")
	WebElement btnTambah; 
	
	@FindBy (xpath= "//input[@name='uploadedFile']")
	WebElement btnUpload; 
	
	@FindBy (xpath= "//input[@placeholder='Nama Trainer']")
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
	
	@FindBy (xpath = "//h1[normalize-space()='CodeIgniter\\Images\\Exceptions\\ImageException']")
	WebElement txtFotoPdf;
	
	public String getTxtDashboard() {
    	return txtDashboard.getText();
    }
	
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
	 public void hapusNamaTrainer(){
	        this.namaTrainer.clear();
	    }
	 
	 public void isiJabatan(String inputJabatan){
	        this.jabatan.sendKeys(inputJabatan);
	    }
	 public void hapusJabatan(){
	        this.jabatan.clear();
	    }
	 
	 public void isiProfile(String inputProfile){
	        this.profile.sendKeys(inputProfile);
	    }
	 public void hapusProfile(){
	        this.profile.clear();
	    }
	 public void selectPublish(int index){
	        Select selectedPublish = new Select(publish);  
	        selectedPublish.selectByIndex(index);
	 }
	 
	 public void klikBtnSimpan(){
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click();",btnSimpan);
	        btnSimpan.click();
	    }
	 
	 public String getTxtSuccess() {
	    	return txtSuccess.getText();
	 }
	 
	 public String getTxtFotoPdf() {
	    	return txtFotoPdf.getText();
	    }
	 
	 public String getAttributeRequiredFoto(){ 
		 return btnUpload.getAttribute("required");
	 }
	 public String getAttributeRequiredNama(){ 
		 return namaTrainer.getAttribute("required");
	 }
	 
	 public String getAttributeRequiredJabatan(){ 
		 return jabatan.getAttribute("required");
	 }
	 
	 public String getAttributeRequiredProfile(){ 
		 return profile.getAttribute("required");
	 }
}
