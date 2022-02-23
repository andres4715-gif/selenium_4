package test.examples.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgTestExecution {

    private WebDriver driver;

    By launchPageHeading = By.xpath("/html/body/div[2]/h2");
    By userName_element = By.xpath("//input[@name='uid']");
    By password_element = By.xpath("//input[@name='password']");
    By signIn_element = By.xpath("//input[@name='btnLogin']");
    By managerID = By.xpath("//td[contains(text(),'Manger Id')]");
    By newCustomer = By.xpath("//a[@href='addcustomerpage.php']");
    By fundTransfer = By.xpath("//a[@href='FundTransInput.php']");

    final String userName_value = "mgr123", password_value = "mgr!23";

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    /**
     * This test case will initialize the webDriver
     */
    @Test(groups = {"bonding", "strong_ties"})
    public void tc01LaunchURL() {
        driver.get("http://www.demo.guru99.com/V4/");
    }

    /**
     * Will check the presence of Heading on Login Page
     */
    @Test(groups = {"bonding"})
    public void tc02VerifyLaunchPage() {
        Assert.assertTrue(driver.findElement(launchPageHeading).isDisplayed(),
                "Home Page heading is not displayed");
        System.out.println("Home Page heading is displayed");
    }

    /**
     * This test case will enter User name, password and will then click on
     * signIn button
     */
    @Test(groups = {"bonding", "strong_ties"})
    public void tc03EnterCredentials() {
        driver.findElement(userName_element).sendKeys(userName_value);
        driver.findElement(password_element).sendKeys(password_value);
        driver.findElement(signIn_element).click();
    }

    /**
     * /*
     * This test case will verify manger's ID presence on DashBoard
     */
    @Test(groups = {"strong_ties"})
    public void tc04VerifyLoggedInPage() {
        Assert.assertTrue(driver.findElement(managerID).isDisplayed(),
                "Manager ID label is not displayed");
        System.out.println("Manger Id label is displayed");
    }

    /**
     * This test case will check the presence of presence of New customer link
     * And FundTransfer link in Left pannel
     */
    @Test(groups = {"bonding"})
    public void tc05VerifyHyperlinks() {
        Assert.assertTrue(driver.findElement(newCustomer).isEnabled(),
                "New customer hyperlink is not displayed");
        System.out.println("New customer hyperlink is displayed");

        Assert.assertTrue(driver.findElement(fundTransfer).isEnabled(),
                "Fund Transfer hyperlink is not displayed");
        System.out.println("Fund Transfer hyperlink is displayed");
    }
}
