package mobile_wiki;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = MobileDriver.class.getName();
        Configuration.browserSize = null; // обязательный костыль №1
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(); // обязательный костыль №2

    }

    @AfterEach
    void afterEach() {
        takeScreenshot();
        closeWebDriver();
    }

    private void takeScreenshot() {
        File screenshot = Screenshots.takeScreenShotAsFile();

        if (screenshot != null) {
            try {
                Allure.addAttachment("Screenshot",
                        "image/png",
                        Files.newInputStream(screenshot.toPath()),
                        "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
