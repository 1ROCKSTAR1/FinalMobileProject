package bs_wiki;

import com.codeborne.selenide.WebDriverProvider;
import config.BSConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.jspecify.annotations.NonNull;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserStackAndroidDriver implements WebDriverProvider {

    private static final BSConfig config =
            ConfigFactory.create(BSConfig.class, System.getProperties());

    @NonNull
    @Override
    public WebDriver createDriver(@NonNull Capabilities capabilities) {

        UiAutomator2Options options = new UiAutomator2Options();


        Map<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("userName", config.browserstackId());
        bstackOptions.put("accessKey", config.browserstackKey());
        bstackOptions.put("deviceName", config.browserstackDevice());
        bstackOptions.put("osVersion", config.browserstackOsVersion());
        bstackOptions.put("projectName", "First Java Project");
        bstackOptions.put("buildName", "browserstack-build-1");
        bstackOptions.put("sessionName", "first_test");

        options.setCapability("platformName", "Android");
        options.setCapability("app", config.browserstackApp());
        options.setCapability("appium:automationName", "UiAutomator2");
        options.setCapability("bstack:options", bstackOptions);

        try {
            URL url = new URL(config.browserstackRemoteUrl());
            System.out.println("Connecting to: " + url);
            return new AndroidDriver(url, options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid BrowserStack URL", e);
        } catch (Exception e) {
            System.err.println("Error creating BrowserStack session: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }
}