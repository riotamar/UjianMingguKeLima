package UjianMingguKeLima;

import com.juaracoding.UjianMingguKeLima.Pages.LoginPage;
import com.juaracoding.UjianMingguKeLima.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to Web Shop Demoqa")
    public void user_go_to_Web_ShopDemoqa(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Shop Demoqa");
    }

    @And("User enter username password invalid")
    public void user_enter_username_password_invalid(){
        loginPage.login();
        loginPage.loginForm("riotamar", "riotamar1233");
        extentTest.log(LogStatus.PASS, "User enter username or email password invalid");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User invalid credentials")
    public void user_invalid_credentials(){
        Assert.assertTrue(loginPage.getTxtMessageError().contains("ERROR"));
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

    @When("User enter username password valid")
    public void user_enter_username_password_valid(){
        loginPage.loginForm("riotamar", "riotamar123");
        extentTest.log(LogStatus.PASS, "User enter username password");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("User valid credentials")
    public void user_valid_credentials(){
        Assert.assertEquals(loginPage.getTxtMyAccount(), "riotamar");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }
}
