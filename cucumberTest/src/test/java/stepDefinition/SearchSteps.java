package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Locale;

public class SearchSteps {

    WebDriver driver;

    @Given("^the user is in the index page$")
    public void theUserIsInTheIndexPage() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^the user enters (.*) in the search bar$")
    public void the_user_enters_dresses_in_the_search_bar(String clothes) {
        driver.findElement(By.id("search_query_top")).sendKeys(clothes);
    }

    @When("^the user clicks the search button$")
    public void theUserClicksTheSearchButton() {
        driver.findElement(By.name("submit_search")).click();
    }

    @Then("^the (.*) page appears$")
    public void the_dresses_page_appears(String clothes) throws InterruptedException {
        String titleResultPage = driver.findElement(By.cssSelector("[class='lighter']")).getText();
        Assert.assertEquals(titleResultPage, "\"" + clothes.toUpperCase() + "\"");

        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}