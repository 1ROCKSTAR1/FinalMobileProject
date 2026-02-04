package bs_wiki;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import wikipages.MainScreen;

import static com.codeborne.selenide.Selenide.*;

@Tag("remote")
public class Tests extends BaseBrowserstackTest {

    MainScreen mainScreen = new MainScreen();

//    @Test
//    @Feature("Search line")
//    @DisplayName("Check the result isn't empty")
//    void searchEmptyTest() {
//        back();
//        boolean actualResult = mainScreen
//                .clickOnFakeSearchField()
//                .sendSearchPhraseInRealSearchField("NASCAR")
//                .checkAllResultsNotEmpty();
//
//        Assertions.assertTrue(actualResult);
//    }
//
//    @Test
//    @Feature("Tabs")
//    @DisplayName("Check the header of the tab 'saved' ")
//    void savedTabTest() {
//        back();
//        String expectedHeader = mainScreen
//                .clickOnSavedTab()
//                .getSavedTabHeader();
//
//        Assertions.assertEquals("Saved", expectedHeader);
//    }
//
//    @Test
//    @Feature("Tabs")
//    @DisplayName("Check the header of the tab 'settings' ")
//    void savedSettingsTest() {
//        back();
//        String expectedHeader = mainScreen
//                .clickOnMoreTab()
//                .clickOnSettings()
//                .getSettingsTabHeader();
//
//        Assertions.assertEquals("Settings", expectedHeader);
//    }
//
//    @Test
//    @Feature("Settings switches")
//    @DisplayName("Check switch 'show link previews' ")
//    void showPreviewTest() {
//        back();
//        boolean expectedShowPreviewCondition = mainScreen
//                .clickOnMoreTab()
//                .clickOnSettings()
//                .checkShowPreviewIsTrue();
//
//        Assertions.assertTrue(expectedShowPreviewCondition);
//    }
//
//    @Test
//    @Feature("Settings switches")
//    @DisplayName("Check switch 'prefer offline' ")
//    void preferOfflineTest() {
//        back();
//        boolean expectedPreferOfflineCondition = mainScreen
//                .clickOnMoreTab()
//                .clickOnSettings()
//                .scrollToPreferOffline()
//                .checkPreferOfflineIsFalse();
//
//        Assertions.assertTrue(expectedPreferOfflineCondition);
//    }
//
//    @Test
//    @Feature("Tabs")
//    @DisplayName("Check the header of the tab 'activity' ")
//    void activityTest() {
//        back();
//        String expectedHeader = mainScreen
//                .clickOnActivityTab()
//                .getActivityHeader();
//
//        Assertions.assertEquals("Activity",expectedHeader);
//    }
//
//    @Test
//    @Feature("Tabs")
//    @DisplayName("Check the header on activity custom screen")
//    void activityCustomHeaderTest() {
//        back();
//        String expectedHeader = mainScreen
//                .clickOnActivityTab()
//                .goToInnerActivityTab()
//                .clickOnCustomizeOption()
//                .getCustomizeHeaderText();
//
//        Assertions.assertEquals("Customize",expectedHeader);
//    }
//
//    @Test
//    @Feature("Tabs")
//    @DisplayName("Check the switches on activity custom screen")
//    void activityCustomSwitchesTest() {
//        back();
//        boolean allSwitchesAreShown = mainScreen
//                .clickOnActivityTab()
//                .goToInnerActivityTab()
//                .clickOnCustomizeOption()
//                .areAllSwitchTextsCorrect();
//
//        Assertions.assertTrue(allSwitchesAreShown);
//    }

    @Test
    void debugBrowserStackConnection() {
        // 1. Сделать скриншот
        //Screenshots.takeScreenShot("debug_initial");

        // 2. Получить page source
        String pageSource = Selenide.webdriver().driver().source();
        System.out.println("Page source length: " + pageSource.length());

        // 3. Поискать все видимые элементы
        ElementsCollection allElements = $$(AppiumBy.xpath("//*"));
        System.out.println("Total elements found: " + allElements.size());

        // 4. Вывести текст всех видимых элементов
        allElements.forEach(el -> {
            if (el.isDisplayed()) {
                String text = el.getText();
                String id = el.getAttribute("resource-id");
                if (text != null && !text.isEmpty()) {
                    System.out.println("Visible element - Text: '" + text + "', ID: " + id);
                }
            }
        });

        // 5. Попробовать найти конкретные элементы
        String[] testTexts = {"Saved", "Settings", "Activity", "Search", "More"};
        for (String text : testTexts) {
            try {
                SelenideElement element = $(AppiumBy.xpath("//*[@text='" + text + "']"));
                System.out.println("Element with text '" + text + "' exists: " + element.exists());
                System.out.println("Element with text '" + text + "' displayed: " + element.isDisplayed());
            } catch (Exception e) {
                System.out.println("Element with text '" + text + "' not found");
            }
        }
    }
}
