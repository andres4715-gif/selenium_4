package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class loginDemoProject {
    WebDriver driver;

    @Before
    public void driverOptions() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Given("^the user is on the login project page$")
    public void the_user_is_on_the_login_project_page() {
        driver.get("https://example.testproject.io/web/");
    }

    @When("^the user enters the valid (.*) and (.*)$")
    public void the_user_enters_the_valid_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(1000);
    }

    @And("^taps over login button$")
    public void taps_over_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("^the user can check if this is valid credentials$")
    public void the_user_can_check_if_this_is_valid_credentials() throws InterruptedException {
        boolean checkLogOut = driver.findElement(By.id("logout")).isDisplayed();
        Assert.assertTrue(checkLogOut);
    }
}
