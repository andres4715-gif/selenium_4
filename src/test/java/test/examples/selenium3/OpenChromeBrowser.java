package test.examples.selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenChromeBrowser {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 10, alwaysRun = true)
    public void openPage() {
        driver.get("https://www.selenium.dev/");
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
