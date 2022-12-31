package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BiayaPage {

    private WebDriver driver;

    public BiayaPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Home")
    WebElement btn_home;

    @FindBy(linkText = "Rincian Biaya")
    WebElement btn_biaya;

    @FindBy(linkText = "Tambah")
    WebElement btn_tambah;

    @FindBy(name = "mysubmit")
    WebElement btn_simpan;

    @FindBy(id = "nama")
    WebElement inputnama;

    @FindBy(id = "harga")
    WebElement inputharga;

    @FindBy(id = "diskonid")
    WebElement inputdiskon;

    @FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
    WebElement publish;

    @FindBy(name = "keunggulan1")
    WebElement inputunggul1;

    @FindBy(name = "keunggulan2")
    WebElement inputunggul2;

    @FindBy(name = "keunggulan3")
    WebElement inputunggul3;

    @FindBy(name = "keunggulan4")
    WebElement inputunggul4;

    @FindBy(name = "keunggulan5")
    WebElement inputunggul5;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtberhasiltambah;

    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi nama program']")
    WebElement txtgagalnama;

    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi harga program']")
    WebElement txtgagalharga;

    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi keunggulan program']")
    WebElement txtgagalkeunggulan;


    public void btnhome() throws InterruptedException {
        Thread.sleep(1000);
        btn_home.click();
    }

    public void btnbiaya() throws InterruptedException {
        Thread.sleep(1000);
        btn_biaya.click();
    }

    public void btntambah() throws InterruptedException {
        Thread.sleep(1000);
        btn_tambah.click();
    }

    public void selectPublish(int index) throws InterruptedException {
        Thread.sleep(1000);
        Select selectedPublish = new Select(publish);
        selectedPublish.selectByIndex(index);
    }

    public void btnsimpan() throws InterruptedException {
        Thread.sleep(1000);
        btn_simpan.click();
    }

    public void setInputnama(String inputnama) {
        this.inputnama.sendKeys(inputnama);
    }

    public void setInputharga(String inputharga) {
        this.inputharga.sendKeys(inputharga);
    }

    public void setInputdiskon(String inputdiskon) {
        this.inputdiskon.sendKeys(inputdiskon);
    }

    public void setInputunggul1(String inputunggul1) {
        this.inputunggul1.sendKeys(inputunggul1);
    }

    public void setInputunggul2(String inputunggul2) {
        this.inputunggul2.sendKeys(inputunggul2);
    }

    public void setInputunggul3(String inputunggul3) {
        this.inputunggul3.sendKeys(inputunggul3);
    }

    public void setInputunggul4(String inputunggul4) {
        this.inputunggul4.sendKeys(inputunggul4);
    }

    public void setInputunggul5(String inputunggul5) {
        this.inputunggul5.sendKeys(inputunggul5);
    }

    public String getTexttambah() {
        return txtberhasiltambah.getText();
    }

    public String getTextgagalnama() {
        return txtgagalnama.getText();
    }

    public String getTextgagalharga() {
        return txtgagalharga.getText();
    }

    public String getTextgagalkeunggulan() {
        return txtgagalkeunggulan.getText();
    }




}
