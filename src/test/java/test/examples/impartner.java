package test.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class impartner {
static String start = "(//*[@class='stopwatch__label--action'])[1]";
static String seconds = "(//*[@title='Seconds'])[1]";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.timeanddate.com/stopwatch/");
        driver.findElement(By.xpath(start)).click();
        String hola = driver.findElement(By.xpath(seconds)).getAttribute("title");
        System.out.println("this is the date: " +  hola);
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
