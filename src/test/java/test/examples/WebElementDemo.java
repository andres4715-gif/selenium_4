package test.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementDemo {

    public static void main(String[] args) throws InterruptedException {

        // driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // find elements
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by step" + Keys.ENTER);

        driver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> elements = driver.findElements(By.tagName("select"));
        for(WebElement myElementList : elements) {
            System.out.println(myElementList.getText());
        }

        // get active element
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("WebElement");
        // Get attribute of current active element
        String attr = driver.switchTo().activeElement().getAttribute("title");
        System.out.println("this is title: " + attr);

        // Check is enable
        driver.navigate().to("https://trytestingthis.netlify.app/");
        WebElement element4 = driver.findElement(By.xpath("//button[@onclick='alertfunction()']"));
        boolean checkElement4 = element4.isEnabled();
        System.out.println("The element4 is enable?: " + checkElement4);

        // is selected
        WebElement element5 = driver.findElement(By.id("moption"));
        element5.click();
        boolean checkActiveElement5 = element5.isSelected();
        System.out.println("The element5 is selected?: " + checkActiveElement5);

        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
