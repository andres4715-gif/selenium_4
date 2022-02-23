package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99PageObjectModelForms {

    private static WebDriver driver;

    @BeforeTest
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void openGuruPage() {
        Setup.inputValuesForm(driver);
    }

    @AfterTest
    public void after() throws InterruptedException {
        Setup.after(driver);
    }
}
