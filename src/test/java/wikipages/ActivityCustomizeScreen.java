package wikipages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class ActivityCustomizeScreen {

    private SelenideElement customizeHeader = $(AppiumBy.xpath("//android.widget.TextView[@text='Customize']")),
            spentReadingSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=Time spent reading]")),
            readingInsightsSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=Reading insights]")),
            editingInsightsSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=Editing insights]")),
            allTimeImpactSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=All time impact]")),
            gameStatsSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=Game stats]")),
            timelineBehaviorSwitch = $(AppiumBy.xpath("//android.widget.TextView[@text=Timeline of behavior]"));



    public String getCustomizeHeaderText() {
        return customizeHeader.getText();
    }

    public String getSpentReadingSwitchText() {
        return spentReadingSwitch.getText();
    }

    public String getReadingInsightsSwitchText() {
        return readingInsightsSwitch.getText();
    }

    public String getEditingInsightsSwitchText() {
        return editingInsightsSwitch.getText();
    }

    public String getAllTimeImpactSwitchText() {
        return allTimeImpactSwitch.getText();
    }

    public String getGameStatsSwitchText() {
        return gameStatsSwitch.getText();
    }

    public String getTimelineBehaviorSwitchText() {
        return timelineBehaviorSwitch.getText();
    }
}
