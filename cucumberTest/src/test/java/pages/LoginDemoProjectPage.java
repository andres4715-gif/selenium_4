package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemoProjectPage {

    protected WebDriver driver;

    private By userName = By.id("name");
    private By password = By.id("password");
    private By login = By.id("login");
    private By logOut = By.id("logout");

    // Constructor
    public LoginDemoProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUserName(String userNameV) {
        driver.findElement(userName).sendKeys(userNameV);
    }

    public void inputPassword(String passwordv) {
        driver.findElement(password).sendKeys(passwordv);
    }

    public void clickLoginButton() {
        driver.findElement(login).click();
    }

    public boolean clickLogOutButton() {
       boolean checkLogOutButto = driver.findElement(logOut).isDisplayed();
        return checkLogOutButto;
    }
}
