package UjianMingguKeLima;

import com.juaracoding.UjianMingguKeLima.Pages.AddcartPage;
import com.juaracoding.UjianMingguKeLima.Pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddcart {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private AddcartPage addcartPage = new AddcartPage();

    private SearchPage searchPage = new SearchPage();

    public TestAddcart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click jeans product")
    public void user_click_jeans_product(){
        addcartPage.clickJeansProduct();
        extentTest.log(LogStatus.PASS, "User click jeans product");
    }

    @And("User pick jeans product color")
    public void user_pick_jeans_product_color(){
        addcartPage.pickColor("dark blue");
        extentTest.log(LogStatus.PASS, "User pick jeans product color");
    }

    @And("User pick jeans product size")
    public void user_pick_jeans_product_size(){
        addcartPage.pickSize("36");
        extentTest.log(LogStatus.PASS, "User pick jeans product size");
    }

    @And("User click addcart button on jeans product")
    public void User_click_addcart_button_on_jeans_product(){
        addcartPage.clickBtnAddcart();
        extentTest.log(LogStatus.PASS, "User click addcart button on jeans product");
    }

    @And("User click cart icon for jeans view")
    public void user_click_cart_icon_for_jeans_view(){
        addcartPage.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click cart icon for jeans view");
    }

    @Then("Showing jeans product after add to cart")
    public void showing_jeans_product_after_add_to_cart(){
        Assert.assertTrue(addcartPage.getTxtJeansProduct().contains("JEANS"));
        extentTest.log(LogStatus.PASS,"Showing dress product after add cart");
    }

    @When("User click coat product")
    public void user_click_coat_product(){
        searchPage.clickBtnSearch();
        searchPage.searchItem("coat");
        searchPage.pressEnter();
        addcartPage.clickCoatProduct();
        extentTest.log(LogStatus.PASS, "User click coat product");
    }

    @And("User pick coat product color")
    public void user_pick_coat_product_color(){
        addcartPage.pickColor("nude");
        extentTest.log(LogStatus.PASS, "User pick coat product color");
    }

    @And("User pick coat product size")
    public void user_pick_coat_product_size(){
        addcartPage.pickSize("small");
        extentTest.log(LogStatus.PASS, "User pick coat product size");
    }

    @And("User click addcart button on jeans product")
    public void user_click_addcart_button_on_jeans_product() {
        addcartPage.clickBtnAddcart();
        extentTest.log(LogStatus.PASS,"User click addcart button on jeans product");
    }

    @And("User click cart icon for coat view")
    public void user_click_cart_icon_for_coat_view(){
        addcartPage.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click cart icon for coat view");
    }

    @Then("Showing coat product after add to cart")
    public void showing_coat_product_after_add_to_cart(){
        Assert.assertTrue(addcartPage.getTxtCoatProduct().contains("COAT"));
        extentTest.log(LogStatus.PASS, "Showing coat product after add to cart");
    }
}