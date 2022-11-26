package UjianMingguKeLima;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.Login.feature",
                "src/main/resources/features/02.Search.feature",
                "src/main/resources/features/03.Addcart.feature",
                "src/main/resources/features/04.CheckoutProduct.feature"},
        glue = "com.juaracoding.RioTamaraUjianMingguKeLima.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
