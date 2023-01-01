package com.juaracoding.cucumber.pages;

import org.openqa.selenium.Keys;
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
	    
	    @FindBy(xpath = "//a[normalize-space()='2']")
	    WebElement nextpage;
	    
	    @FindBy(xpath = "//li[@class='active page-item']")
	    WebElement activepage;
	    
	    @FindBy(xpath = "//li[@class='page-item']")
	    WebElement unactivepage;
	    
	    @FindBy(xpath = "//input[@placeholder='Search Nama Peserta']")
	    WebElement search;
	    
	    @FindBy(xpath = "//p[normalize-space()='Test 13']")
	    WebElement namayangdicari;
	    
	    @FindBy(xpath = "//input[@id='nama']")
	    WebElement editnama;
	    
	    @FindBy(xpath = "//textarea[@id='summernote']")
	    WebElement editcontent;
	    
	    @FindBy(xpath = "//input[@id='filename']")
	    WebElement namafoto;
	    
	    @FindBy(xpath = "//input[@id='uploadedFile']")
	    WebElement editfoto;
	    
	    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	    WebElement editpublish;
	    
	    @FindBy(xpath = "//select[@id='rating']")
	    WebElement editrating;
	    
	    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div")
	    WebElement NamaAlert;
	    
	    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[4]/div/div")
	    WebElement ContentAlert;
	  
	    
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

		public String getTxt404() {
			return txt404.getText();
		}

		public String getTxtfilenotsupport() {
			return txtnotsupport.getText();
		}

		public void clickNextpage() throws InterruptedException {
			Thread.sleep(2000);
	        nextpage.click();
		}

		public String getActivePage() {
			return activepage.getAttribute("class");
//			return nextpage.getText();
		}

		public void Search(String search) throws InterruptedException {
			this.search.sendKeys(search);	
		}

		public void Enter() throws InterruptedException {
			Thread.sleep(2000);
	        search.sendKeys(Keys.ENTER);
		}

		public String getNamayangdicari() {
			return namayangdicari.getText();
		}

		public String getUnActivePage() {
			return unactivepage.getAttribute("class");
		}

		public void clickNamayangdicari() throws InterruptedException {
			Thread.sleep(1000);
	        namayangdicari.click();
		}

		public void ClearNama() throws InterruptedException {
			Thread.sleep(1000);
			this.editnama.clear();	
		}
		
		public void ClearContent() throws InterruptedException {
			Thread.sleep(1000);
			this.editcontent.clear();
		}
		
		public void EditNama(String editnama) throws InterruptedException {
			Thread.sleep(1000);
			this.editnama.sendKeys(editnama);	
		}
		
		public void EditContent(String editcontent) throws InterruptedException {
			Thread.sleep(1000);
			this.editcontent.sendKeys(editcontent);	
		}

		public String getNamaAlert() {
			return NamaAlert.getText();
		}
		
		public String getContentAlert() {
			return ContentAlert.getText();
		}

//		public void PilihGambarUlang(String photo) throws InterruptedException {
//			Thread.sleep(1000);
//	        namafoto.sendKeys(photo);
//		}
		
		public void clickBtnPilihGambarUlang(String foto) throws InterruptedException {
			Thread.sleep(1000);
	        editfoto.sendKeys(foto); 
		}

		public void EditPublish(int index) throws InterruptedException {
			Thread.sleep(1000);
	        Select selectedPublish = new Select(editpublish);  
			selectedPublish.selectByIndex(index);
			
		}

		public void EditRating(int index) throws InterruptedException {
			Thread.sleep(1000);
	        Select selectedRating = new Select(editrating);  
			selectedRating.selectByIndex(index);
		}
		

}
