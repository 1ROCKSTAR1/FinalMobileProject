package bs_wiki.tabs_and_pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.Dimension;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SettingsBsScreen {

    private SelenideElement settingsHeader = $(AppiumBy.xpath("//android.widget.TextView[@text='Settings'][1]")),
    showPreviewSwitch = $(AppiumBy.xpath("(//android.widget.Switch)[1]")),
    shareDataSwitch = $(AppiumBy.xpath("(//android.widget.Switch)[3]"));

    public String getSettingsHeader() {
        return settingsHeader.getText();
    }

    public boolean checkPreviewSwitch() {
        String checkedValue = showPreviewSwitch.getAttribute("checked");
        System.out.println("Switch checked attribute value: " + checkedValue);
        return "true".equalsIgnoreCase(checkedValue);
    }

    public SettingsBsScreen scrollToShareData() {
        Dimension size = getWebDriver().manage().window().getSize();

        // Используем scrollGesture
        for (int i = 0; i < 3; i++) {
            executeJavaScript("mobile: scrollGesture", Map.of(
                    "left", 100,
                    "top", 100,
                    "width", size.width - 200,
                    "height", size.height - 200,
                    "direction", "down",
                    "percent", 2.0  // 200% - большой скролл
            ));

            sleep(800);
        }

        return this;
    }

    public boolean checkShareDataSwitch() {
        String checkedValue = shareDataSwitch.getAttribute("checked");
        System.out.println("Switch checked attribute value: " + checkedValue);
        return "true".equalsIgnoreCase(checkedValue);
    }
}
