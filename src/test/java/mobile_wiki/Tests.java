package mobile_wiki;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import wikipages.MainScreen;

import static com.codeborne.selenide.Selenide.back;


public class Tests extends BaseTest {

    MainScreen mainScreen = new MainScreen();

    @Test
    @Feature("Search line")
    @DisplayName("Check the result isn't empty")
    void searchEmptyTest() {
        back();
        boolean actualResult = mainScreen
                .clickOnFakeSearchField()
                .sendSearchPhraseInRealSearchField("NASCAR")
                .checkAllResultsNotEmpty();

        Assertions.assertTrue(actualResult);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header of the tab 'saved' ")
    void savedTabTest() {
        back();
        String expectedHeader = mainScreen
                .clickOnSavedTab()
                .getSavedTabHeader();

        Assertions.assertEquals("Saved", expectedHeader);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header of the tab 'settings' ")
    void savedSettingsTest() {
        back();
        String expectedHeader = mainScreen
                .clickOnMoreTab()
                .clickOnSettings()
                .getSettingsTabHeader();

        Assertions.assertEquals("Settings", expectedHeader);
    }

    @Test
    @Feature("Settings switches")
    @DisplayName("Check switch 'show link previews' ")
    void showPreviewTest() {
        back();
        boolean expectedShowPreviewCondition = mainScreen
                .clickOnMoreTab()
                .clickOnSettings()
                .checkShowPreviewIsTrue();

        Assertions.assertTrue(expectedShowPreviewCondition);
    }

    @Test
    @Feature("Settings switches")
    @DisplayName("Check switch 'prefer offline' ")
    void preferOfflineTest() {
        back();
        boolean expectedPreferOfflineCondition = mainScreen
                .clickOnMoreTab()
                .clickOnSettings()
                .scrollToPreferOffline()
                .checkPreferOfflineIsFalse();

        Assertions.assertTrue(expectedPreferOfflineCondition);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header of the tab 'activity' ")
    void activityTest() {
        back();
        String expectedHeader = mainScreen
                .clickOnActivityTab()
                .getActivityHeader();

        Assertions.assertEquals("Activity",expectedHeader);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header on activity custom screen")
    void activityCustomHeaderTest() {
        back();
        String expectedHeader = mainScreen
                .clickOnActivityTab()
                .goToInnerActivityTab()
                .clickOnCustomizeOption()
                .getCustomizeHeaderText();

        Assertions.assertEquals("Customize",expectedHeader);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the switches on activity custom screen")
    void activityCustomSwitchesTest() {
        back();
        boolean allSwitchesAreShown = mainScreen
                .clickOnActivityTab()
                .goToInnerActivityTab()
                .clickOnCustomizeOption()
                .areAllSwitchTextsCorrect();

        Assertions.assertTrue(allSwitchesAreShown);
    }
}
