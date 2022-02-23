package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Guru99PageObjectModel {

    private static WebDriver driver;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void openGuruPage() {
        Setup.gettingPageAndClick(driver);
    }

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
