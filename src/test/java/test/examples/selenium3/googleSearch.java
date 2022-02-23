package test.examples.selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class googleSearch {

    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1, alwaysRun = true)
    public void goobleSearch() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("automation step by step", Keys.ENTER);
    }

    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
