package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBase {

    public static WebDriver driver = null;

    protected TestBase() {
        initDriver();
    }

    @AfterTest
    public void tearDown() {
        quitDriver();
    }

    private static void initDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}