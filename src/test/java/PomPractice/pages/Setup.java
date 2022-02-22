package PomPractice.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Setup {

    public static void mySetup() {
        WebDriverManager.chromedriver().setup();
    }

    public static void gettingPageAndClick(WebDriver driver) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/ajax.html");
        driver.findElement(By.id("no")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
