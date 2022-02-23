package test.examples.selenium3;

import PomPractice.pages.Guru99HomePage;
import PomPractice.pages.Guru99Login;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PomTestGuru99TakeScreenShot {

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
    public void test_Home_Page_Appear_Correct() throws IOException {
        driver.get("http://demo.guru99.com/V4/");

        TakesScreenshot tc = (TakesScreenshot) driver; // Type Casting
        File src = tc.getScreenshotAs(OutputType.FILE);  // For taking the screenShot
        FileHandler.copy(src, new File("./screenshots/sc1.png"));
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
