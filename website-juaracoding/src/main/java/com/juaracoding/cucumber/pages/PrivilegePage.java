package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PrivilegePage {
	private WebDriver driver;

    public PrivilegePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
    WebElement navHome;
    
//    @FindBy(xpath = "//*[@id=\\\"simple-bar\\\"]/div[1]/div[2]/div/div/div/li[4]/ul/li")
    @FindBy(className = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(4) > ul")
    List<WebElement> ListHome;
    
        
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[5]/a")
    WebElement navAbout;
    
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[6]/a")
    WebElement navBlog;
    
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[7]/a")
    WebElement navContact;
    
    @FindBy(xpath = "")
    WebElement navPeserta;
    
    @FindBy(xpath = "")
    WebElement navProgram;
    
    @FindBy(xpath = "")
    WebElement navUser;
    
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/a")
    WebElement navGallery;
    
    @FindBy(xpath = "")
    WebElement navSetting;
  
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/h3")
    WebElement txtAbout;
  
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/h3")
    WebElement txtBlog;
    
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/h3")
    WebElement txtContact;
    
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/h3")
    WebElement txtGallery;

    
    public void clickHome() {
    	navHome.click();
    }
    
    public void listHome() throws InterruptedException{
    	Thread.sleep(1000);
    	
//    	int dataTampung = 0;
//   	 boolean state= true;
//        navHome.click();
	
//
//    	 for (WebElement element: ListHome) {
//    		 dataTampung += Integer.parseInt(element.getText());
////    	        System.out.println(dataTampung);
//        
//    	    }

    	
   	 for (int i = 1; i <= ListHome.size(); i++)
	 {
	     System.out.println(ListHome.get(i).getText());
	 }
    	
    	
//		while (state) {
//    			try {
//    				for (WebElement element: ListHome) {
//    					dataTampung += Integer.parseInt(element.getText());
//    					System.out.println(dataTampung);
//    				}
//    				state = false;
//    			} catch (Exception e) {
//    				// TODO: handle exception
//    				state = true;
//    				System.out.println("Error");
//    			};
//    			
//    			assertTrue (dataTampung > 0);
    }

	public void clickAbout() throws InterruptedException {
		Thread.sleep(1000);
        navAbout.click();
	}

	public String getTxtAbout() {
		return txtAbout.getText();
	}
	
	public void clickBlog() throws InterruptedException {
		Thread.sleep(1000);
		navBlog.click();
	}

	public String getTxtBlog() {
		return txtBlog.getText();
	}
	
	public void clickContact() throws InterruptedException {
		Thread.sleep(1000);
		navContact.click();
	}

	public String getTxtContact() {
		return txtContact.getText();
	}
	
	public void clickGallery() throws InterruptedException {
		Thread.sleep(1000);
		navGallery.click();
	}

	public String getTxtGallery() {
		return txtGallery.getText();
	}
    
}
