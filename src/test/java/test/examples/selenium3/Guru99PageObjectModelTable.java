package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guru99PageObjectModelTable {

    public static WebDriver driver;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void after() throws InterruptedException {
        Setup.after(driver);
    }

    @Test(priority = 1)
    public static void checkingRadioButton() {
        Setup.table(driver);
    }
}
