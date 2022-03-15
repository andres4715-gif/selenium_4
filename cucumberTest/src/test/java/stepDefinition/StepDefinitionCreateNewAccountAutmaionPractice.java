package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.AutomationPracticeHomePagePage;
import pages.CreateAndAccoutnPage;

import java.time.Duration;

public class StepDefinitionCreateNewAccountAutmaionPractice {
    WebDriver driver;
    CreateAndAccoutnPage createAnAccountPage;

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

    @Given("^the user is on the home page Automatio logo$")
    public void the_user_is_on_the_home_page_automatio_logo() {
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^the user do click on the signIn button$")
    public void the_user_do_click_on_the_sign_in_button() {
        AutomationPracticeHomePagePage hpSignInButton = new AutomationPracticeHomePagePage(driver);
        hpSignInButton.clickSignIn();
    }

    @When("^the user type his (.*) and clicks over create and account button$")
    public void the_user_type_his_andres_gmail_com_and_clicks_over_create_and_account_button(String email) {
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.inputEmailAddress(email);
        authenticationPage.clickCreateAnAccountButton();
    }

    @When("the user enters the personal infomation (.*) and (.*)$")
    public void the_user_enters_the_personal_infomation_andres_and_rios(String firstname, String lastname) {
        createAnAccountPage = new CreateAndAccoutnPage(driver);
        createAnAccountPage.inputFirstName(firstname);
        createAnAccountPage.inputLastName(lastname);
    }

    @Then("^the user can check the create an account page$")
    public void the_user_can_check_the_create_an_account_page() {
        createAnAccountPage  = new CreateAndAccoutnPage(driver);
        Assert.assertTrue(createAnAccountPage.checkCreateAnAccountLabe());
    }
}
