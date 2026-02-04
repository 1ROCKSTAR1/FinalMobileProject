package bs_wiki;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import wikipages.MainScreen;

@Tag("remote")
public class Tests extends BaseBrowserstackTest {

    MainScreen mainScreen = new MainScreen();

    @Test
    @Feature("Search line")
    @DisplayName("Check the result isn't empty")
    void searchEmptyTest() {

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

        String expectedHeader = mainScreen
                .clickOnSavedTab()
                .getSavedTabHeader();

        Assertions.assertEquals("Saved", expectedHeader);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header of the tab 'settings' ")
    void savedSettingsTest() {

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

        String expectedHeader = mainScreen
                .clickOnActivityTab()
                .getActivityHeader();

        Assertions.assertEquals("Activity",expectedHeader);
    }

    @Test
    @Feature("Tabs")
    @DisplayName("Check the header on activity custom screen")
    void activityCustomHeaderTest() {

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

        boolean allSwitchesAreShown = mainScreen
                .clickOnActivityTab()
                .goToInnerActivityTab()
                .clickOnCustomizeOption()
                .areAllSwitchTextsCorrect();

        Assertions.assertTrue(allSwitchesAreShown);
    }
}