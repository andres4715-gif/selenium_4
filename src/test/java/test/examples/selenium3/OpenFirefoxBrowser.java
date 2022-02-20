package test.examples.selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org");

        driver.get("https://www.selenium.dev/");

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
