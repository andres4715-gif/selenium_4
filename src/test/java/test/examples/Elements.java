package test.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class Elements {

    public static void main(String[] args) throws InterruptedException {

        // driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Time outs
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // open the url and check the title and current URL
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation step by step", Keys.ENTER);

        driver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> options = driver.findElements(By.id("owc"));

        for (WebElement element: options) {
            System.out.println("these ara the list: " + element.getText());
        }

        //using CSS selectors
        // it is possible with variable like the previous example
        driver.findElement(By.cssSelector("#lname")).sendKeys("Andres Test");

        // action click
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        WebElement login1 = driver.findElement(By.id("btnLogin"));
        login1.click();

        // Relative locators
        WebElement login = driver.findElement(By.id("btnLogin"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(login)).sendKeys("Password");

        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
