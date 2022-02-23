package test.examples.selenium3;

import PomPractice.pages.Guru99HomePage;
import PomPractice.pages.Guru99Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PomRunningTest99GuruLogin {

    WebDriver driver;

    Guru99Login objLogin;
    Guru99HomePage objHomePage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */

    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct() {
        driver.get("http://demo.guru99.com/V4/");
        //Create Login Page object
        objLogin = new Guru99Login(driver);
        //Verify login page title
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        objLogin.loginToGuru99("mgr123", "mgr!23");
        // go the next page
        objHomePage = new Guru99HomePage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
