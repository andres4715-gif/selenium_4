package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pages.LoginDemoProjectPage;

import java.time.Duration;

public class LoginDemoProject {
    WebDriver driver;
    LoginDemoProjectPage loginPageElements;

    @Given("^the user is on the login project page$")
    public void the_user_is_on_the_login_project_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://example.testproject.io/web/");
    }

    @When("^the user enters the valid (.*) and (.*)$")
    public void the_user_enters_the_valid_username_and_password(String username, String password) throws InterruptedException {
        loginPageElements = new LoginDemoProjectPage(driver);
        loginPageElements.inputUserName(username);
        loginPageElements.inputPassword(password);
        Thread.sleep(1000);
    }

    @And("^taps over login button$")
    public void taps_over_login_button() {
        loginPageElements = new LoginDemoProjectPage(driver);
        loginPageElements.clickLoginButton();
    }

    @Then("^the user can check if this is valid credentials$")
    public void the_user_can_check_if_this_is_valid_credentials() throws InterruptedException {
        loginPageElements = new LoginDemoProjectPage(driver);
        boolean checkLogOut = loginPageElements.clickLogOutButton();
        Assert.assertTrue(checkLogOut);
        Thread.sleep(1000);
        driver.quit();
    }
}
