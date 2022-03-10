package stepDefinition;

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

    @Given("^the user is on the login project page$")
    public void the_user_is_on_the_login_project_page() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://example.testproject.io/web/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("^the user enters the valid username and password$")
    public void the_user_enters_the_valid_username_and_password() {
        driver.findElement(By.id("name")).sendKeys("Raghav");
        driver.findElement(By.id("password")).sendKeys("12345");

    }

    @And("^taps over login button$")
    public void taps_over_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("^the user can check if this is valid credentials$")
    public void the_user_can_check_if_this_is_valid_credentials() throws InterruptedException {
        boolean checkLogOut = driver.findElement(By.id("logout")).isDisplayed();
        Assert.assertTrue(checkLogOut);

        Thread.sleep(1000);
        driver.quit();

    }
}
