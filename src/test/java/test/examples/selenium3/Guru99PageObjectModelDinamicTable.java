package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guru99PageObjectModelDinamicTable {

    private static WebDriver wd;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        wd = new ChromeDriver();
    }

    @Test(priority = 4, alwaysRun = true)
    public void checkingRadioButton() {
        Setup.specificDataTable(wd);
        Setup.dinamicDataTable(wd);
    }

    @AfterSuite
    public void after() throws InterruptedException {
        Setup.after(wd);
    }
}
