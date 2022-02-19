package test.examples.selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingDemo {

    public static void main(String[] args) throws InterruptedException {

        /*
        // NORMAL (This is to wait until the full page loads)
        // By default normal is set to browser if none is provided
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        // Getting new driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        Thread.sleep(3000);
        driver.close();
        driver.quit();

         */

        // EAGER
        // Wait ultil the initial HTML document has been completely loaded and parsed
        // discards loading of stylesheets, images and subframes
        // it is faster than NORMAL option.
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        // Getting new driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        driver.close();
        driver.quit();
    }
}
