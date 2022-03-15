package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginSteps {

    WebDriver driver;

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^the user enters username and password$")
    public void the_user_enters_username_and_password() {

    }

    @And("^clicks on login button$")
    public void clicks_on_login_button() {

    }

    @Then("^the user is navigated to the home page$")
    public void the_user_is_navigated_to_the_home_page() {

        driver.quit();
    }
}
