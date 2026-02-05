package bs_wiki;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.BSConfig;
import helpers.Attach;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BaseBrowserstackTest {

    private static final BSConfig config =
            ConfigFactory.create(BSConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserStackAndroidDriver.class.getName();
        Configuration.browserSize = null; // обязательный костыль №1
        Configuration.timeout = 15000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(); // обязательный костыль №2

        try {


            if ($(AppiumBy.xpath("//*[@text='Get started']")).isDisplayed()) {
                $(AppiumBy.xpath("//*[@text='Get started']")).click();

                $(AppiumBy.xpath("//*[@text='Skip']"))
                        .shouldBe(visible, Duration.ofSeconds(8))
                        .click();
                return;
            }
        } catch (Exception e) {

        }
    }

    @AfterEach
    void afterEach() {
        String sessionId = Selenide.sessionId().toString();
        Attach.screenshotAs("Last screenshot");
        Attach.addVideo(sessionId);
        closeWebDriver();
    }
}
