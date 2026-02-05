package bs_wiki.tabs_and_pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class MoreBsTab {

    private SelenideElement settingsItem = $(AppiumBy.xpath("//android.widget.TextView[@text='Settings']"));

    public SettingsBsScreen clickOnSettingsItem() {
        settingsItem.click();
        return new SettingsBsScreen();
    }
}
