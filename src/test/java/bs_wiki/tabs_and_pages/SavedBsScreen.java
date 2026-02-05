package bs_wiki.tabs_and_pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class SavedBsScreen {

    private SelenideElement savedHeader = $(AppiumBy.xpath("//android.widget.TextView[@text='Saved'][1]"));

    public String getSavedHeader() {
        return savedHeader.getText();
    }
}
