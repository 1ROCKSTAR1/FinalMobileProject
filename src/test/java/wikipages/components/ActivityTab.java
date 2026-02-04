package wikipages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class ActivityTab {

    private SelenideElement activityHeader = $(AppiumBy.xpath("(//android.widget.TextView[@text='Activity'])[1]")),
    activityInnerTab = $(AppiumBy.xpath("//android.widget.Button[@content-desc='More']")),
            continueButton = $(AppiumBy.xpath("//*[@text='Continue']"));

    public String getActivityHeader () {
        return activityHeader.getText();
    }

    public ActivityInnerTab goToInnerActivityTab() {
        if(continueButton.isDisplayed()) {
            continueButton.click();
        }
        activityInnerTab.click();
        return new ActivityInnerTab();
    }
}