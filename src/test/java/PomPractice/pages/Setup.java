package PomPractice.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public static void gettingElementsValues(WebDriver driver) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements: " + elements.size());

        for(WebElement element : elements) {
            System.out.println(element.getAttribute("value"));
        }
    }

    public static void after(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
