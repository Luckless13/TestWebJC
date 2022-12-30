package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {

    private WebDriver driver;

    public BlogPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Blog']")
    WebElement btn_blog;

    @FindBy(css= "li:nth-child(6) a:nth-child(1)")
    WebElement btn_blog2;

    @FindBy(xpath = "//a[@class='btn btn-gradient']")
    WebElement btn_tambah;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement btn_simpan;

    @FindBy(xpath = "//input[@placeholder='Search Judul']")
    WebElement search;

    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txttambah;

    @FindBy(xpath = "//h3[normalize-space()='List Blog']")
    WebElement txtlist;

    @FindBy(xpath = "//h4[normalize-space()='contoh test']")
    WebElement listdata;

    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txtedit;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtberhasiltambah;

    @FindBy(xpath = "//span[@aria-hidden='true']")
    WebElement pagenumber;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement btnupload;

    @FindBy(xpath = "//input[@id='judul']")
    WebElement inputjudul;

    @FindBy(xpath = "//*[@name=\"publish\"]")
    WebElement selectPublish;

    @FindBy(xpath = "//*[@name=\"set_top\"]")
    WebElement selectsettohome;

    @FindBy(xpath = "//textarea[@name='body_preview']")
    WebElement inputcontent1;

    @FindBy(xpath = "//div[@role='textbox']")
    WebElement inputcontent2;




    public void btnblog() throws InterruptedException {
        Thread.sleep(1000);
        btn_blog.click();
    }

    public void btnblog2() throws InterruptedException {
        Thread.sleep(1000);
        btn_blog2.click();
    }


    public void btntambah() throws InterruptedException {
        Thread.sleep(1000);
        btn_tambah.click();
    }

    public void btnsimpan() throws InterruptedException {
        Thread.sleep(1000);
        btn_simpan.click();
    }

    public void Listdata() throws InterruptedException {
        Thread.sleep(1000);
        listdata.click();
    }


    public String getTexttambah() {
        return txttambah.getText();
    }

    public String getTextberhasiltambah() {
        return txtberhasiltambah.getText();
    }

    public String getTextlist() {
        return txtlist.getText();
    }

    public String getTextedit() {
        return txtedit.getText();
    }

    public void setSearch(String search) {
        this.search.sendKeys(search, Keys.ENTER);

    }

    public void setPagenumber() throws InterruptedException {
        Thread.sleep(2000);
        pagenumber.click();
    }

    public void clickBtnUpload(String photo) throws InterruptedException {
        Thread.sleep(1000);
        btnupload.sendKeys(photo);
    }

    public void setInputjudul(String inputjudul) {
        this.inputjudul.sendKeys(inputjudul);

    }

    public void setselectPublish(int index) throws InterruptedException {
        Thread.sleep(1000);
        Select selectedPublish = new Select(selectPublish);
        selectedPublish.selectByIndex(index);
    }

    public void setselecttohome(int index) throws InterruptedException {
        Thread.sleep(1000);
        Select selectedPublish = new Select(selectsettohome);
        selectedPublish.selectByIndex(index);
    }

    public void setInputcontent1(String inputcontent1) {
        this.inputcontent1.sendKeys(inputcontent1);

    }

    public void setInputcontent2(String inputcontent2) {
        this.inputcontent2.sendKeys(inputcontent2);

    }


}
