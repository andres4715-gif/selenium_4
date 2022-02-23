package test.examples.selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenFirefoxBrowser {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void openPage() {
        driver.get("https://www.selenium.dev/");
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
