package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guru99PageObjectModelTable {

    private static WebDriver driver;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void checkingRadioButton() {
        Setup.table(driver);
    }

    @AfterSuite
    public void after() throws InterruptedException {
        Setup.after(driver);
    }
}
