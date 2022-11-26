package UjianMingguKeLima;

import com.juaracoding.UjianMingguKeLima.Pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearch {
    WebDriver driver;
    private static ExtentTest extentTest;

    private SearchPage searchPage = new SearchPage();

    public TestSearch(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("User click button search for product not found")
    public void user_click_button_search_for_product_not_found(){
        searchPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search for product not found");
    }

    @And("User enter hat product")
    public void user_enter_hat_product(){
        searchPage.searchItem("hat");
        extentTest.log(LogStatus.PASS, "User enter hat product");
    }

    @And("User press enter for product not found")
    public void user_press_enter_for_product_not_found(){
        searchPage.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter for product not found");
    }

    @Then("Showing text message no product were found")
    public void showing_text_message_no_product_were_found(){
        Assert.assertTrue(searchPage.getTxtMessageNotFound().contains("No products were found"));
        extentTest.log(LogStatus.PASS,"Showing message no product were found");
    }

    @When("User click button search")
    public void user_click_button_search(){
        searchPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @And("User enter jeans product")
    public void user_enter_jeans_product(){
        searchPage.searchItem("jeans");
        extentTest.log(LogStatus.PASS, "User enter jeans product");
    }

    @And("User press enter")
    public void user_press_enter(){
        searchPage.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter");
    }

    @Then("Showing jeans products")
    public void showing_jeans_products(){
        Assert.assertTrue(searchPage.getTxtJeans().contains("JEANS"));
        extentTest.log(LogStatus.PASS, "Showing jeans products");
    }

}