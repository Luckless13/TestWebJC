package com.juaracoding.cucumber.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class RincianBiayaPage {
	private WebDriver driver;

    public RincianBiayaPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
    WebElement btnHome;
    
    @FindBy(xpath = "//a[normalize-space()='Rincian Biaya']")
    WebElement btnRincianBiaya;
    
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;
    
    @FindBy(xpath = "//h3[normalize-space()='Data Rincian Biaya']")
    WebElement txtData;
    
    @FindBy(xpath = "//td[normalize-space()='Pelatihan Bagus']")
    WebElement programyangdicari;
    
    @FindBy(xpath = "//select[@name='st']")
    WebElement selectbtn;
    
    @FindBy(xpath = "//b[normalize-space()='Total Search : 0 Data']")
    WebElement zero;
    
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-xs\"]")
    WebElement btnEdit;
    
    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi nama program']")
    WebElement alertNamaProgram;
    
    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi keunggulan program']")
    WebElement alertKeunggulan1;
    
    @FindBy(xpath = "//input[@id='nama']")
    WebElement NamaProgram;
    
    @FindBy(xpath = "//input[@id='harga']")
    WebElement HargaNormal;
    
    @FindBy(xpath = "//input[@name='diskon']")
    WebElement Diskon;
    
    @FindBy(xpath = "//input[@name='keunggulan1']")
    WebElement Keunggulan1;
    
    @FindBy(xpath = "//input[@name='keunggulan2']")
    WebElement Keunggulan2;
    
    @FindBy(xpath = "//input[@name='keunggulan3']")
    WebElement Keunggulan3;
    
    @FindBy(xpath = "//input[@name='keunggulan4']")
    WebElement Keunggulan4;
    
    @FindBy(xpath = "//input[@name='keunggulan5']")
    WebElement Keunggulan5;
    
    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement btnSimpan;
    
    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txtEditRincianBiaya;
    
    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtDataBerhasilUpdate;

	public void clickBtnHome() throws InterruptedException {
		Thread.sleep(1000);
        btnHome.click();
	}
	
	public void clickBtnRincianBiaya() throws InterruptedException {
		Thread.sleep(1000);
        btnRincianBiaya.click();
	}

	public String getTxtData() {
		return txtData.getText();
	}
    
	public void Search(String search) throws InterruptedException {
		this.search.sendKeys(search);	
	}

	public void Enter() throws InterruptedException {
		Thread.sleep(2000);
        search.sendKeys(Keys.ENTER);
	}

	public String getProgramyangdicari() {
		return programyangdicari.getText();
	}
	
	public void selectOpsi(int index) throws InterruptedException {
		Thread.sleep(1000);
        Select selectedOpsi = new Select(selectbtn);  
		selectedOpsi.selectByIndex(index);
	}

	public String getTxtZero() {
		return zero.getText();
	}
	
	public void clickBtnEdit() throws InterruptedException {
		Thread.sleep(1000);
        btnEdit.click();
	}
    
	public String getTxtAlertNamaProgram() throws InterruptedException {
		Thread.sleep(1000);
		return alertNamaProgram.getText();
	}
	
	public String getTxtAlertkeunggulan1() throws InterruptedException {
		Thread.sleep(1000);
		return alertKeunggulan1.getText();
	}

	public void ClearNama() throws InterruptedException {
		this.NamaProgram.clear();
	}

	public void EditNamaProgram(String NamaProgram) throws InterruptedException {
		Thread.sleep(1000);
		this.NamaProgram.sendKeys(NamaProgram);
	}
	
	public void ClearHarga() throws InterruptedException {
		this.HargaNormal.clear();
	}

	public void EditHarga(String HargaNormal) throws InterruptedException {
		Thread.sleep(1000);
		this.HargaNormal.sendKeys(HargaNormal);
	}

	public void ClearDiskon() throws InterruptedException {
		this.Diskon.clear();
	}

	public void EditDiskon(String Diskon) throws InterruptedException {
		Thread.sleep(1000);
		this.Diskon.sendKeys(Diskon);
	}

	public void ClearKeunggulan1() throws InterruptedException {
		this.Keunggulan1.clear();
	}

	public void EditKeunggulan1(String Keunggulan1) throws InterruptedException {
		Thread.sleep(1000);
		this.Keunggulan1.sendKeys(Keunggulan1);
	}

	public void ClearKeunggulan2() throws InterruptedException {
		this.Keunggulan2.clear();
	}

	public void EditKeunggulan2(String Keunggulan2) throws InterruptedException {
		Thread.sleep(1000);
		this.Keunggulan2.sendKeys(Keunggulan2);
	}
	
	public void ClearKeunggulan3() throws InterruptedException {
		this.Keunggulan3.clear();
	}

	public void EditKeunggulan3(String Keunggulan3) throws InterruptedException {
		Thread.sleep(1000);
		this.Keunggulan3.sendKeys(Keunggulan3);
	}
	
	public void ClearKeunggulan4() throws InterruptedException {
		this.Keunggulan4.clear();
	}

	public void EditKeunggulan4(String Keunggulan4) throws InterruptedException {
		Thread.sleep(1000);
		this.Keunggulan4.sendKeys(Keunggulan4);
	}
	
	public void ClearKeunggulan5() throws InterruptedException {
		this.Keunggulan5.clear();
	}

	public void EditKeunggulan5(String Keunggulan5) throws InterruptedException {
		Thread.sleep(1000);
		this.Keunggulan5.sendKeys(Keunggulan5);
	}

	public void ClickBtnSimpan() throws InterruptedException {
		Thread.sleep(1000);
        btnSimpan.click();
	}
	
	public String getTxtEditRincianBiaya() throws InterruptedException {
		Thread.sleep(1000);
		return txtEditRincianBiaya.getText();
	}
	
	public String getTxtDataBerhasilUpdate() throws InterruptedException {
		Thread.sleep(1000);
		return txtDataBerhasilUpdate.getText();
	}
}
