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
    
}
