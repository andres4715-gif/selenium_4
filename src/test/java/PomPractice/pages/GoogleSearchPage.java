package PomPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    private static WebElement elenent = null;

    public static WebElement textBoxSearch (WebDriver driver) {
        elenent = driver.findElement(By.name("q"));
        return elenent;
    }
}
