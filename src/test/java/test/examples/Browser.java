package test.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Browser {
    public static void main(String[] args) throws InterruptedException, IOException {

        // driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Time outs
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        String originalWindow = driver.getWindowHandle();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // open the url and check the title and current URL
        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://automationstepbystep.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        // Windows back, fordward and refresh
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();

        // switch to another window and a new tap
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window(originalWindow);
        Thread.sleep(1000);

        // Frames:
        driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Action")).click();
        driver.switchTo().defaultContent();

        // Manage windows size
        driver.manage().window().getSize().getWidth();
        driver.manage().window().getSize().getHeight();

        Dimension size = driver.manage().window().getSize();
        System.out.println("++++ The complete size Width and Height is: " + size);
        System.out.println("++++ The size Width is: " + size.getWidth());
        System.out.println("++++ The size Height is: " + size.getHeight());

        // Manage windows size/change Dimension
        driver.manage().window().setSize(new Dimension(1400, 1200));

        // Manage windows size/Maximize, minimize, fullscreen
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();

        // Takes a screenshots
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./screenshots/image1.png"));

        // Takes a screenshots/just a part of the page
        driver.switchTo().frame("classFrame");
        WebElement element = driver.findElement(By.cssSelector(".title"));
        File srcFile2 = element.getScreenshotAs((OutputType.FILE));
        FileUtils.copyFile(srcFile2, new File("./screenshots/image2.png"));
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
