package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Guru99PageObjectModel {

    public static WebDriver driver;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        driver = new ChromeDriver();
    }

    @Test
    public static void openGuruPage() throws InterruptedException {
        Setup.gettingPageAndClick(driver);
    }
}
