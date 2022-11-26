package UjianMingguKeLima;

import com.juaracoding.UjianMingguKeLima.Pages.CheckoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckout {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private CheckoutPage checkoutPage = new CheckoutPage();

    public TestCheckout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button checkout")
    public void user_click_button_checkout() {
        checkoutPage.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User click buton checkout");
    }

    @And("User enter firstname lastname")
    public void user_typing_firstname_lastname() {
        checkoutPage.name("Azis", "Fikri");
        extentTest.log(LogStatus.PASS,"User enter firstname lastname");
    }

    @And("User enter company name just optional")
    public void user_typing_company_name_just_optional() {
        checkoutPage.companyName("Juara Coding");
        extentTest.log(LogStatus.PASS,"User typing company name");
    }

    @And("User choose country")
    public void user_choose_country() {
        checkoutPage.country("ID");
        extentTest.log(LogStatus.PASS,"User choose country");
    }

    @And("User typing address one")
    public void user_typing_address_one() {
        checkoutPage.addressOne("Jalan Angin Puyuh");
        extentTest.log(LogStatus.PASS,"User typing address one");
    }

    @And("User typing address two just optional")
    public void user_typing_address_two_just_optional() {
        checkoutPage.addressTwo("");
        extentTest.log(LogStatus.PASS,"User typing address two");
    }

    @And("User typing city")
    public void user_typing_city() {
        checkoutPage.city("Jakarta");
        extentTest.log(LogStatus.PASS,"User typing city");
    }

    @And("User choose province")
    public void user_choose_province() {
        checkoutPage.province("BT");
        extentTest.log(LogStatus.PASS,"User choose province");
    }

    @And("User typing postcode")
    public void user_typing_postcode() {
        checkoutPage.postcode("14120");
        extentTest.log(LogStatus.PASS,"User typing postcode");
    }

    @And("User typing phone number")
    public void user_typing_phone_number() {
        checkoutPage.phoneNumber("812137879");
        extentTest.log(LogStatus.PASS,"User typing phone number");
    }

    @And("User enter notes just optional")
    public void user_enter_notes_just_optional() {
        checkoutPage.notes("");
        extentTest.log(LogStatus.PASS,"User enter notes just optional");
    }

    @And("User click button place order")
    public void user_click_button_place_order() {
        checkoutPage.clickBtnPlaceOrder();
        extentTest.log(LogStatus.PASS,"User click button place order");
    }

    @Then("Showing message Thank you. Your order has been received")
    public void showing_message_thank_you_your_order_has_been_received() {
        Assert.assertEquals(checkoutPage.getTxtThankyou(),"Thank you. Your order has been received.");
    }
}
