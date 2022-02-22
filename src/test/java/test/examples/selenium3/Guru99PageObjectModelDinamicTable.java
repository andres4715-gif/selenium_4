package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guru99PageObjectModelDinamicTable {

    public static WebDriver wd;

    @BeforeSuite
    public void setup() {
        Setup.mySetup();
        wd = new ChromeDriver();
    }

    @AfterSuite
    public void after() throws InterruptedException {
        Setup.after(wd);
    }

    @Test(priority = 1)
    public static void checkingRadioButton() {
        Setup.specificDataTable(wd);
        Setup.dinamicDataTable(wd);
    }
}
