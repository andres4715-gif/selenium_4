package test.examples.selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

    public static void main(String[] args) throws InterruptedException {
        goobleSearch();
    }

    static void goobleSearch () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("automation step by step", Keys.ENTER);

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
