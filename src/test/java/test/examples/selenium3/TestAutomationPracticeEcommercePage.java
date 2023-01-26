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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void dropDown() {
        // import org.openqa.selenium.support.ui.Select;
        Select value = new Select(driver.findElement(By.name("customerCurrency")));
        value.selectByVisibleText("Euro");
    }

    @Test
    public void checkElementDisplayed() {
        WebElement element = driver.findElement(By.cssSelector("[class='cart-label']"));
        boolean checkingDisplayed = element.isDisplayed();
        System.out.println("The element is displayed: " + checkingDisplayed);
        Assert.assertTrue(checkingDisplayed);
    }

    @Test
    public void checkElementVisible() {
        WebElement element = driver.findElement(By.cssSelector("[class='cart-label']"));
        boolean checkingVisibleElement = element.isDisplayed();
        System.out.println("The element is visible: " + checkingVisibleElement);
        Assert.assertTrue(checkingVisibleElement);
    }

    @Test
    public void gettingAttribute() {
        WebElement element = driver.findElement(By.cssSelector("[class='ico-register']"));
        String obtainedAttribute = element.getAttribute("text");
        System.out.println("The attribute obtained is: " + obtainedAttribute);
        Assert.assertEquals("Register", obtainedAttribute);
    }

    @Test
    public void elementVisible() {
        WebElement element = driver.findElement(By.xpath("//*[@class= 'news-list-homepage']//*[@class = 'title']"));
        boolean obtainedAttribute = element.isEnabled();
        System.out.println("The element is Enabled: " + obtainedAttribute);
        Assert.assertTrue(obtainedAttribute);
    }

    @Test
    public void scrollForAnyPartOfThePage() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1500)");
    }

    @Test
    public void scrollToSpecificElement() {
        WebElement element = driver.findElement(By.xpath("//*[@class= 'news-list-homepage']//*[@class = 'title']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void clicks() {
        String article = "iPhone 8";

        WebElement element = driver.findElement(By.cssSelector("#small-searchterms"));
        element.sendKeys(article);
        WebElement submitSearch = driver.findElement(By.xpath("//button[@type= 'submit']"));
        submitSearch.click();
        // ebElement resultSearchBox = driver.findElement(By.xpath("//*[@id= 'q']"));
        String resultSearchBox = driver.findElement(By.cssSelector("[value='iPhone 8']")).getAttribute("value");

        System.out.println("The result text is: " + resultSearchBox);
        Assert.assertEquals(resultSearchBox, article);
    }

    @Test
    public void gettingElementList() {
        List<WebElement> elements = driver.findElements(By.cssSelector("[class='header-links'] li"));
        List<WebElement> nuevaLista = new ArrayList<WebElement>();
        for(WebElement dataList : elements) {
            System.out.println(dataList.getText());
            nuevaLista.add(dataList);
        }
        Assert.assertFalse(elements.isEmpty());
        int numberOfelementNewList = nuevaLista.size();
        System.out.println("The number of element in the new list is: " + numberOfelementNewList);
        Assert.assertTrue(numberOfelementNewList > 2);
    }
}
