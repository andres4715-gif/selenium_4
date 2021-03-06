package test.examples.selenium3;

import PomPractice.pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPomTestPageObjectTestNg {

    private static WebDriver driver;

    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void googleSearchTest() {
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        driver.get("https://www.google.com/");
        searchPageObj.setTextInSearchBox("Cucumber");
    }

    @Test
    public void checkSuma() {
        System.out.println(suma(1, 2));
    }

    public int suma(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
