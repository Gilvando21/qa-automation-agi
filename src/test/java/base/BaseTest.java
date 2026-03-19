package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import utils.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    static {
        //executa apenas uma vez (evita múltiplos drivers)
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        if ("true".equals(System.getProperty("headless"))) {
            options.addArguments("--headless=new");
        }

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            try {
                ScreenshotUtil.capture(driver);
            } catch (Exception e) {
                System.out.println("Erro ao capturar screenshot: " + e.getMessage());
            } finally {
                driver.quit(); //suficiente (não precisa close)
            }
        }
    }
}