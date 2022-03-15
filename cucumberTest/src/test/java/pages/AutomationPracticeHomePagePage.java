package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeHomePagePage {

    protected WebDriver driver;

    private By signInButton = By.xpath("//*[@class='login']");


    // Constructor
    public AutomationPracticeHomePagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}
