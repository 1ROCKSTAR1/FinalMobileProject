package bs_wiki.tabs_and_pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Collection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainBsScreen {

    private SelenideElement moreTab = $(AppiumBy.xpath("//android.widget.TextView[@text='More']")),
            savedTab = $(AppiumBy.xpath("//android.widget.TextView[@text='Saved']")),
            fakeSearchField = $(AppiumBy.xpath("//android.widget.TextView[@text='Search Wikipedia']")),
            realSearchField = $(AppiumBy.xpath("(//android.widget.AutoCompleteTextView)[1]"));

    private ElementsCollection searchResults = $$(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='org.wikipedia.alpha:id/search_results_list']"));

    public MoreBsTab clickOnMoreTab() {
        moreTab.click();
        return new MoreBsTab();
    }

    public SavedBsScreen clickOnSavedTab() {
        savedTab.click();
        return new SavedBsScreen();
    }

    public MainBsScreen clickOnFakeSearchField() {
        fakeSearchField.click();
        return this;
    }

    public MainBsScreen fillRealSearchField(String s) {
        realSearchField.sendKeys(s);
        return this;
    }

    public boolean checkAllResultsNotEmpty() {

            try {

                return $$((Collection<? extends WebElement>) searchResults)
                        .shouldHave(sizeGreaterThan(0), Duration.ofSeconds(10))
                        .size() > 0;
            } catch (Exception e) {
                return false;
            }
        }
    }

