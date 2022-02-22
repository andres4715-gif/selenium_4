package test.examples.selenium3;

import PomPractice.pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ExtendsReportWithTestNg {

    private static WebDriver driver = null;

    @BeforeSuite
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void searchGoobleResult() {
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        driver.get("https://www.google.com/");
        searchPageObj.setTextInSearchBox("Cucumber");
        System.out.println("The result is: " + suma(3, 5));
    }

    public int suma(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
