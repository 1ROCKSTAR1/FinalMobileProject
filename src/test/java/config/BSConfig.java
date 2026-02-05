package config;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:${config:remote}.properties")
public interface BSConfig extends Config {

    @Key("browserstack.id")
    @DefaultValue("lex_7EZofB")
    String browserstackId();

    @Key("browserstack.key")
    @DefaultValue("BxJxFbAzwVkYQ3s3sW1F")
    String browserstackKey();

    @Key("browserstack.device")
    @DefaultValue("Samsung Galaxy S22")
    String browserstackDevice();

    @Key("browserstack.os_version")
    @DefaultValue("12.0")
    String browserstackOsVersion();

    @Key("browserstack.app")
    @DefaultValue("bs://3f7310b8b0dd1b5b7c81edbe97047a5ea3614f7c")
    String browserstackApp();

    @Key("browserstack.remote.url")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String browserstackRemoteUrl();
}

