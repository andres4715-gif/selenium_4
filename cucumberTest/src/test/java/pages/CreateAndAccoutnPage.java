package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAndAccoutnPage {

    protected WebDriver driver;

    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By labelCreateAnAccount = By.xpath("//*[@id='noSlide']/h1");

    // Constructor
    public CreateAndAccoutnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String strFirstName) {
        driver.findElement(firstName).sendKeys(strFirstName);
    }

    public void inputLastName(String strlastName) {
        driver.findElement(lastName).sendKeys(strlastName);
    }

    public boolean checkCreateAnAccountLabe() {
        boolean checkingLabel = driver.findElement(labelCreateAnAccount).isDisplayed();
        return checkingLabel;
    }
}
