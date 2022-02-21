package test.examples.selenium3;

import PomPractice.pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchPomTestPageObject {

    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        googleSearchTest();
    }

    static void googleSearchTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

        driver.get("https://www.google.com/");

        searchPageObj.setTextInSearchBox("Cucumber");

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
