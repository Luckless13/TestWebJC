package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(id = "nama")
    WebElement inputnama;

    @FindBy(id = "harga")
    WebElement inputharga;

    @FindBy(id = "diskonid")
    WebElement inputdiskon;

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








}
