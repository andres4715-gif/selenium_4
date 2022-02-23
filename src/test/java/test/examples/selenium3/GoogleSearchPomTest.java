package test.examples.selenium3;

import PomPractice.pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPomTest {

    private static WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void goobleSearch() {

        driver.get("https://www.google.com/");
        GoogleSearchPage.textBoxSearch(driver).sendKeys("This is with POM", Keys.ENTER);
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
