package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Guru99PageObjectModelCheckBox {

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

    @Test(priority = 1, alwaysRun = true)
    public static void checkingRadioButton() {
        Setup.radioButton(driver);
        Setup.checkBox(driver);
    }
}
