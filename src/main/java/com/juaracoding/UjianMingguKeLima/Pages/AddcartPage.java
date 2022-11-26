package com.juaracoding.UjianMingguKeLima.Pages;

import com.juaracoding.UjianMingguKeLima.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcartPage {
    private WebDriver driver;

    public AddcartPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'dark blue vice high waisted slash knee skinny jean')]")
    WebElement clickJeansItem;

    @FindBy (xpath = "//a[normalize-space()='nude shaggy faux fur coat']")
    WebElement clickCoatItem;

    @FindBy(id = "pa_color")
    WebElement color;

    @FindBy(id = "pa_size")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddCart;

    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement btnViewCart;

    @FindBy(xpath = "//a[.='dark blue vice high waisted slash knee skinny jeans - Dark Blue']")
    WebElement txtJeansProduct;

    @FindBy(xpath = "//a[normalize-space()='nude shaggy faux fur coat - Nude']")
    WebElement txtCoatProduct;

    public void clickJeansProduct(){
        clickJeansItem.click();
    }

    public void clickCoatProduct(){
        clickCoatItem.click();
    }

    public void pickColor(String color){
        Select selectMenuColor = new Select(this.color);
        selectMenuColor.selectByValue(color);
    }

    public void pickSize(String size){
        Select selectMenuSize = new Select(this.size);
        selectMenuSize.selectByValue(size);
    }

    public void clickBtnAddcart(){
        btnAddCart.click();
    }

    public void clickIconCart(){
        btnViewCart.click();
    }

    public String getTxtJeansProduct(){
        return txtJeansProduct.getText();
    }

    public String getTxtCoatProduct(){
        return txtCoatProduct.getText();
    }
}