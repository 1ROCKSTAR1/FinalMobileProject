package wikipages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class ActivityTab {

    private SelenideElement activityHeader = $(AppiumBy.xpath("(//android.widget.TextView[@text='Activity'])[1]")),
    activityInnerTab = $(AppiumBy.xpath("//android.widget.Button[@content-desc='More']"));

    public String getActivityHeader () {
        return activityHeader.getText();
    }

    public ActivityInnerTab goToInnerActivityTab() {
        activityInnerTab.click();
        return new ActivityInnerTab();
    }
}