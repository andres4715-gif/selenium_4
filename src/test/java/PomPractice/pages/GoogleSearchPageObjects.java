package PomPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

    // driver call
    WebDriver driver;

    // Locators
    By texBoxSearch = By.name("q");


    // Create Construtor:
    public GoogleSearchPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextInSearchBox(String text1) {
        driver.findElement(texBoxSearch).sendKeys(text1);
    }
}
