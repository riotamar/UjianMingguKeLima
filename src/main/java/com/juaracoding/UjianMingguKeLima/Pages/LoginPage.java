package com.juaracoding.UjianMingguKeLima.Pages;

import com.juaracoding.UjianMingguKeLima.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement clickDismiss;
    @FindBy(id = "username")
    WebElement inpUsername;

    @FindBy (id = "password")
    WebElement inpPassword;

    @FindBy (xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[.='My Account']")
    WebElement btnMyAccount;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    WebElement txtMyAccount;

    @FindBy(xpath = "//strong[normalize-space()='ERROR']")
    WebElement txtMessageError;

    public void login(){
        clickDismiss.click();
        btnMyAccount.click();
    }
    public void loginForm(String username, String password){
        this.inpUsername.sendKeys(username);
        this.inpPassword.sendKeys(password);
    }
    public void clickLoginBtn(){
        btnLogin.click();
    }

    public String getTxtMyAccount(){

        return txtMyAccount.getText();
    }

    public String getTxtMessageError(){
        return txtMessageError.getText();
    }
}
