package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Guru99PageObjectModelFindElements {

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
    public static void openGuruPage() throws InterruptedException {
        Setup.gettingElementsValues(driver);
    }
}
