package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CodilityPractice {

    private static WebDriver driver;

    @Before
    public void before() {
        Setup.mySetup();
        driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
    }

    @After
    public void after() throws InterruptedException {
        Setup.after(driver);
    }

    @Test
    public void testElementAreDisplayed() {
        WebElement passwordInput = driver.findElement(By.id("password-input"));
        WebElement emailInput = driver.findElement(By.id("email-input"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        boolean emailField = emailInput.isDisplayed();
        assertEquals(true, emailField);
        boolean passwordField = passwordInput.isDisplayed();
        assertEquals(true, passwordField);
        boolean buttonDiplayed = loginButton.isDisplayed();
        assertEquals(true, buttonDiplayed);
    }

    @Test
    public void correctCredentials() {
        driver.findElement(By.id("email-input")).sendKeys("login@codility.com");
        driver.findElement(By.id("password-input")).sendKeys("password");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='message success']")).getText(), "Welcome to Codility");
    }

    @Test
    public void wrongCredentials() {
        driver.findElement(By.id("email-input")).sendKeys("unknown@codility.com");
        driver.findElement(By.id("password-input")).sendKeys("password");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='message error']")).getText(), "You shall not pass! Arr!");
    }

    @Test
    public void invalidEmail() {
        driver.findElement(By.id("email-input")).sendKeys("unknown");
        driver.findElement(By.id("password-input")).sendKeys("password");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='validation error']")).getText(), "Enter a valid email");
    }

    @Test
    public void EmptyCredentials() {
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.findElement(By.xpath("//*[text()= 'Email is required']")).getText(), "Email is required");
        assertEquals(driver.findElement(By.xpath("//*[text()= 'Password is required']")).getText(), "Password is required");
    }
}
