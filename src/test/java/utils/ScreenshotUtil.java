package utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;

public class ScreenshotUtil {

    public static void capture(WebDriver driver) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);

            Allure.addAttachment(
                    "Screenshot on failure",
                    new ByteArrayInputStream(screenshot)
            );

        } catch (Exception e) {
            System.out.println("Erro ao capturar screenshot: " + e.getMessage());
        }
    }
}