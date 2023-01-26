package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TestAutomationPracticeEcommercePage {

    private static WebDriver driver;

    @Before
    public void before() {
        Setup.mySetup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void after() throws InterruptedException {
        Setup.after(driver);
    }

    @Test
    public void checkTheTitlePage() {
        String titlePage = driver.getTitle();

        System.out.println("The title is displayed: " + titlePage);
        assertEquals("nopCommerce demo store", titlePage );
        assertNotNull(titlePage);
        assertNotSame("nopCommerce demo store__XXX", titlePage);
    }

    @Test
    public void checkingTheUrl() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The obtained url is: " + currentUrl);
        Assert.assertEquals("https://demo.nopcommerce.com/", currentUrl);
    }

    @Test
    public void gettingText() {
        String webElementToGetValue1 = driver.findElement(By.cssSelector(".ico-register")).getText();
        System.out.println("The obtained text is: " + webElementToGetValue1);

        // Another way:
        WebElement webElementToGetValue2 = driver.findElement(By.cssSelector(".ico-register"));
        String obtainedText = webElementToGetValue2.getText();

        System.out.println("The obtained text is: " + obtainedText);
    }

    @Test
    public void checkWeGetTheCorrectValue() {
        String webElementToGetValud = driver.findElement(By.cssSelector(".ico-register")).getText();
        // String obtainedText = webElementToGetValud.getText();

        System.out.println("The obtained text is: " + webElementToGetValud);
        Assert.assertNotNull(webElementToGetValud);
        Assert.assertEquals("REGISTER", webElementToGetValud);
    }

    @Test
    public void writeSomethingAndTappingEnter() {
        driver.findElement(By.cssSelector("#small-searchterms"))
                .sendKeys("iPhone", Keys.ENTER);
    }

    @Test
    public void clearFieldValues() {
        driver.findElement(By.cssSelector("#small-searchterms"))
                .sendKeys("iPhone");
        driver.findElement(By.cssSelector("#small-searchterms")).clear();
    }
}
