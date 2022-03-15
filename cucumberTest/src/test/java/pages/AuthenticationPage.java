package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    protected WebDriver driver;

    private By inputEmailAddress = By.id("email_create");
    private By btnCreateAnAccount = By.xpath("//*[text() = 'Create an account']");


    // Constructor
    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmailAddress(String email) {
        driver.findElement(inputEmailAddress).sendKeys(email);
    }

    public void clickCreateAnAccountButton() {
        driver.findElement(btnCreateAnAccount).click();
    }
}
