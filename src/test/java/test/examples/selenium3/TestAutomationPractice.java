package test.examples.selenium3;

import PomPractice.pages.Setup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TestAutomationPractice {

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
    public void correctCredentials() {

    }

    @Test
    public void wrongCredentials() {

    }

    @Test
    public void invalidEmail() {

    }

    @Test
    public void EmptyCredentials() {

    }
}
