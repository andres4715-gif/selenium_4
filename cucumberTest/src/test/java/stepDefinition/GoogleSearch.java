package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class GoogleSearch {

    WebDriver driver;

    @Given("^the user is on the google home page$")
    public void the_user_is_on_the_google_home_page() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("^the user enters text in search box$")
    public void the_user_enters_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
    }

    @And("^hits enter$")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("^the user is navigated to the search results$")
    public void the_user_is_navigated_to_the_search_results() throws InterruptedException {
        driver.getPageSource().contains("Online Courses");

        Thread.sleep(2000);
        driver.quit();
    }
}
