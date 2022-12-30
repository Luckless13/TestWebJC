package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"frmlogin\"]/div[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
    WebElement txtDashboard;

    public void login(String username, String password) throws InterruptedException{
        this.username.sendKeys(username);
        Thread.sleep(2000);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() throws InterruptedException{
    	Thread.sleep(2000);
        btnLogin.click();
    }

    public String getTxtDashboard() {
    	return txtDashboard.getText();
    }


}
