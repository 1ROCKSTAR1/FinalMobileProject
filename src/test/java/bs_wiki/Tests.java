package bs_wiki;

import bs_wiki.tabs_and_pages.MainBsScreen;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

@Tag("remote")
public class Tests extends BaseBrowserstackTest {

    MainBsScreen mainBsScreen = new MainBsScreen();

    @Test
    @Feature("Searchline")
    @DisplayName("Check search results aren't empty ")
    public void checkSearchResults() {
        back();
        boolean resultsAreShown = mainBsScreen
                .clickOnFakeSearchField()
                .fillRealSearchField("NASCAR")
                .checkAllResultsNotEmpty();

        Assertions.assertTrue(resultsAreShown);
    }

    @Test
    @Feature("Headers")
    @DisplayName("Check the header of the tab 'saved' ")
    public void savedHeaderTest() {
        back();
        String expectedHeader = mainBsScreen
                .clickOnSavedTab()
                .getSavedHeader();

        Assertions.assertEquals("Saved",expectedHeader);
    }

    @Test
    @Feature("Headers")
    @DisplayName("Check the header of the tab 'settings' ")
    public void settingsHeaderTest() {
        back();
        String expectedHeader = mainBsScreen
                .clickOnMoreTab()
                .clickOnSettingsItem()
                .getSettingsHeader();

        Assertions.assertEquals("Settings",expectedHeader);
    }

    @Test
    @Feature("Switches")
    @DisplayName("Check the switch preview is on ")
    public void showPreviewSwitchTest() {
        back();
        boolean previewSwitchIsOn = mainBsScreen
                .clickOnMoreTab()
                .clickOnSettingsItem()
                .checkPreviewSwitch();

        Assertions.assertTrue(previewSwitchIsOn);
    }

    @Test
    @Feature("Switches")
    @DisplayName("Check the switch shareData is on")
    public void shareDataSwitchTest() {
        back();
        boolean shareDataSwitchIsOn = mainBsScreen
                .clickOnMoreTab()
                .clickOnSettingsItem()
                .scrollToShareData()
                .checkShareDataSwitch();

        Assertions.assertTrue(shareDataSwitchIsOn);
    }
}