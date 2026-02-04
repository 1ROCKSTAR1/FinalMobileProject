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

        System.out.println("=== BROWSERSTACK CONFIG ===");
        System.out.println("User: " + config.browserstackId());
        System.out.println("Key: " + config.browserstackKey());
        System.out.println("Device: " + config.browserstackDevice());
        System.out.println("OS Version: " + config.browserstackOsVersion());
        System.out.println("App: " + config.browserstackApp());
        System.out.println("==========================");

        Map<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("userName", config.browserstackId());
        bstackOptions.put("accessKey", config.browserstackKey());
        bstackOptions.put("deviceName", config.browserstackDevice());
        bstackOptions.put("platformVersion", config.browserstackOsVersion());
        bstackOptions.put("projectName", "First Java Project");
        bstackOptions.put("buildName", "browserstack-build-1");
        bstackOptions.put("sessionName", "first_test");

        //bstackOptions.put("appiumVersion", "2.0.0");

        options.setCapability("platformName", "Android");
        options.setCapability("appium:automationName", "uiautomator2");
        options.setCapability("appium:app", config.browserstackApp());

        options.setCapability("bstack:options", bstackOptions);

        options.setCapability("appium:noReset", false);
        options.setCapability("appium:fullReset", false);
        options.setCapability("appium:autoGrantPermissions", true);
        options.setCapability("appium:newCommandTimeout", 300);

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
