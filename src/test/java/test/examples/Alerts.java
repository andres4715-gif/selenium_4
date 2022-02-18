package test.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        String text  = "January";

        // Getting new driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open the page
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//*[text()= 'JavaScript Alerts']")).click();
        driver.findElement(By.xpath("//*[text()= 'Click for JS Alert']")).click();

        // switch to the alert
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        if(driver.getPageSource().contains("You successfully clicked an alert")) {
            System.out.println("Great!!!");
        }

        // switch to the confirm alert
        driver.findElement(By.xpath("//*[text()= 'Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
        if(driver.getPageSource().contains("You clicked: Cancel")) {
            System.out.println("We cancel the confirm alert second option, Great!!!");
        }

        // prompt and copy something on the alert
        driver.findElement(By.xpath("//*[text()= 'Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys(text);
        alert3.accept();
        if(driver.getPageSource().contains("You entered:")) {
            System.out.println("We added a text and confirm the alert, Great!!!");
        }

        // Close the browser
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
