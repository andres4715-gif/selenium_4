package PomPractice.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Setup {

    public static void mySetup() {
        WebDriverManager.chromedriver().setup();
    }

    public static void after(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    public static void gettingPageAndClick(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/ajax.html");
        driver.findElement(By.id("no")).click();
    }

    public static void gettingElementsValues(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements: " + elements.size());

        for (WebElement element : elements) {
            System.out.println(element.getAttribute("value"));
        }
    }

    public static void inputValuesForm(WebDriver driver) {
        driver.get("https://demo.guru99.com/test/login.html#");
        WebElement email = driver.findElement(By.id("email"));
        WebElement logIn = driver.findElement(By.id("SubmitLogin"));
        WebElement password = driver.findElement(By.name("passwd"));
        email.sendKeys("andres777@gmail.com");
        password.sendKeys("password123456");
        email.clear();
        password.clear();
        email.sendKeys("andres777@gmail.com");
        password.sendKeys("password123456");
        logIn.submit();
    }

    public static void radioButton(WebDriver driver) {
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.findElement(By.id("vfb-7-1")).click();
        driver.findElement(By.id("vfb-7-2")).click();
    }

    public static void checkBox(WebDriver driver) {
        driver.findElement(By.id("vfb-6-0")).click();
        driver.findElement(By.id("vfb-6-1")).click();
        driver.findElement(By.id("vfb-6-2")).click();
    }

    // I need to import this:
    // import org.openqa.selenium.support.ui.Select;
    public static void dropDown(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Select dropDownCountry = new Select(driver.findElement(By.name("country")));
        dropDownCountry.selectByVisibleText("BAKER ISLAND");
    }

    public static void upload(WebDriver driver) {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        WebElement send = driver.findElement(By.id("submitbutton"));
        uploadElement.sendKeys("/Users/andresrios/Desktop/WebDriverAgent.xcodeproj");
        WebElement terms = driver.findElement(By.id("terms"));
        terms.click();
        send.click();
    }

    public static void table(WebDriver driver) {
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        driver.get(baseUrl);
        String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println("this cell is: " + innerText);
    }

    public static void specificDataTable(WebDriver driver) {
        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
        driver.get(baseUrl);
        WebElement getDaily = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]"));
        System.out.println(getDaily.getText());
    }

    public static void dinamicDataTable(WebDriver driver) {
        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
        driver.get(baseUrl);
        // The column number
        List<WebElement> col = driver.findElements(By.xpath("//*[@class='dataTable']/thead/tr/th"));
        System.out.println("The colum elements are: " + col.size());

        // The rows number
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        System.out.println("The row elements are: " + rows.size());

        // data table.
        for(WebElement data : rows) {
        System.out.println(data.getText());
        }
    }
}
