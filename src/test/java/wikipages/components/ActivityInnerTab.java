package wikipages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import wikipages.ActivityCustomizeScreen;

import static com.codeborne.selenide.Selenide.$;

public class ActivityInnerTab {

    private SelenideElement customizeOption = $(AppiumBy.xpath("//android.widget.TextView[@text='Customize']"));

    public ActivityCustomizeScreen clickOnCustomizeOption() {
        customizeOption.click();
        return new ActivityCustomizeScreen();
    }
}
