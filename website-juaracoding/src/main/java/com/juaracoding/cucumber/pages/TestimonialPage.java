package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class TestimonialPage {
	 private WebDriver driver;

	    public TestimonialPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
	    WebElement btnHome;
	    
	    @FindBy(xpath = "//a[normalize-space()='Testimonial']")
	    WebElement btnTestimonial;
	    
	    @FindBy(xpath = "//h3[normalize-space()='List Testimonial']")
	    WebElement txtTestimonial;
	    
	    @FindBy(xpath = "//a[@class='btn btn-gradient']")
	    WebElement btnTambah;
	    
	    @FindBy(xpath = "//input[@name='uploadedFile']")
	    WebElement btnUpload;
//	    @FindBy(xpath = "//*[@type='file']")
//	    WebElement foto;

	    @FindBy(xpath = "//input[@placeholder='Nama Peserta']")
	    WebElement namapeserta;
	    
	    @FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
	    WebElement publish;
	    
	    @FindBy(xpath = "//textarea[@name='body']")
	    WebElement content;
	    
	    @FindBy(xpath = "//select[@id='rating']")
	    WebElement rating;
	    
	    @FindBy(xpath = "//input[@name='mysubmit']")
	    WebElement btnSimpan;
	    
	    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[2]/div/div")
	    WebElement txtNamaWajib;
	    
	    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[4]/div/div")
	    WebElement txtContentWajib;
	    
	    @FindBy(xpath = "//h1[normalize-space()='404 - File Not Found']")
	    WebElement txt404;
	    
	    @FindBy(xpath = "//div[@class='header']//p[1]")
	    WebElement txtnotsupport;
	    
		public void clickBtnHome() throws InterruptedException {
			Thread.sleep(1000);
	        btnHome.click();	
		}

		public void clickBtnTestimonial() throws InterruptedException {
			Thread.sleep(1000);
	        btnTestimonial.click();
		}

		public String getTxtTestimonial() {
			return txtTestimonial.getText();
		}
		
		public void clickBtnTambah() throws InterruptedException {
			Thread.sleep(1000);
	        btnTambah.click();
		}

		public void clickBtnSimpan() throws InterruptedException {
			Thread.sleep(1000);
	        btnSimpan.click();
		}

		public String getTxtNamaWajib() {
			return txtNamaWajib.getText();
		}

		public String getTxtContentWajib() {
			return txtContentWajib.getText();
		}
	
		public void NamaPeserta(String namapeserta) {
			this.namapeserta.sendKeys(namapeserta);	
		}

		public void Content(String content) {
			this.content.sendKeys(content);
		}

		public void selectRating(int index) throws InterruptedException {
			Thread.sleep(1000);
	        Select selectedRating = new Select(rating);  
			selectedRating.selectByIndex(index);
		}

		public void selectPublish(int index) throws InterruptedException {
			Thread.sleep(1000);
	        Select selectedPublish = new Select(publish);  
	        selectedPublish.selectByIndex(index);
		}

		public void clickBtnUpload(String photo) throws InterruptedException {
			Thread.sleep(1000);
	        btnUpload.sendKeys(photo);
		}
//		 public void upload(String foto) throws InterruptedException{
//	          this.foto.sendKeys(foto);
//	    }

		public String getTxt404() {
			return txt404.getText();
		}

		public String getTxtfilenotsupport() {
			return txtnotsupport.getText();
		}


}
