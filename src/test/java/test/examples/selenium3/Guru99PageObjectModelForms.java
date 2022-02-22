package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99PageObjectModelForms {

    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void after() throws InterruptedException {
        Setup.after(driver);
    }

    @Test(priority = 1, alwaysRun = true)
    public static void openGuruPage() {
        Setup.inputValuesForm(driver);
    }
}
