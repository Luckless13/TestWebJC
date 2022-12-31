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


    @FindBy(linkText = "Blog")
    WebElement btn_blog3;

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

    @FindBy(xpath = "//img[@alt='Image description']")
    WebElement listdata;

    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txtedit;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtberhasiltambah;

    @FindBy(xpath = "//div[normalize-space()='Harap isi judul']")
    WebElement txtgagaljudul;

    @FindBy(xpath = "//div[normalize-space()='Harap isi content perview']")
    WebElement txtgagalcontent1;

    @FindBy(xpath = "//div[normalize-space()='Harap isi content blog']")
    WebElement txtgagalcontent2;

    @FindBy(xpath = "//a[normalize-space()='3']")
    WebElement pagenumber;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement btnupload;

    @FindBy(xpath = "//input[@id='judul']")
    WebElement inputjudul;

//    @FindBy(id = "exampleFormControlSelect9")
//    WebElement selectPublish;

    @FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
    WebElement publish;

    @FindBy(name = "set_top")
    WebElement settohome;

    @FindBy(xpath = "//textarea[@name='body_preview']")
    WebElement inputcontent1;

    @FindBy(xpath = "//div[@role='textbox']")
    WebElement inputcontent2;

    @FindBy(xpath = "//li[@class='active page-item']")
    WebElement activepage;


    public void btnblog() throws InterruptedException {
        Thread.sleep(1000);
        btn_blog.click();
    }


    public void btnblog3() throws InterruptedException {
        Thread.sleep(1000);
        btn_blog3.click();
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

    public String gettxtgagaljudul() {
        return txtgagaljudul.getText();
    }

    public String gettxtgagalcontent1() throws InterruptedException {
        Thread.sleep(2000);
        return txtgagalcontent1.getText();
    }

    public String gettxtgagalcontent2() throws InterruptedException {
        Thread.sleep(2000);
        return txtgagalcontent2.getText();
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

    public void judulHapus() {
        this.inputjudul.clear();
    }

//    public void setselectPublish(int index) throws InterruptedException {
//        Thread.sleep(1000);
//        selectPublish.click();
//    }

    public void selectPublish(int index) throws InterruptedException {
        Thread.sleep(1000);
        Select selectedPublish = new Select(publish);
        selectedPublish.selectByIndex(index);
    }

    public void selecttohome(int index) throws InterruptedException {
        Thread.sleep(1000);
        Select selectedtohome = new Select(settohome);
        selectedtohome.selectByIndex(index);
    }

    public String getActivePage() {
        return activepage.getAttribute("class");
//			return nextpage.getText();
    }

    public void setInputcontent1(String inputcontent1) {
        this.inputcontent1.sendKeys(inputcontent1);

    }

    public void content1Hapus() {
        this.inputcontent1.clear();
    }

    public void setInputcontent2(String inputcontent2) {
        this.inputcontent2.sendKeys(inputcontent2);

    }

    public void content2Hapus() {
        this.inputcontent2.clear();
    }
}