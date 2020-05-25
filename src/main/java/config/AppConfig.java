package config;

import org.openqa.selenium.remote.BrowserType;

import java.util.ResourceBundle;

public final class AppConfig {
    public static final String REMOTE_HUB_URL;
    public static final long IMPLICIT_WAIT;
    public static final String DEDAULT_USERNAME;
    public static final String DEDAULT_USER_PASSWORD;
    public static final String LOCALSTORAGE_TOKEN_KEY;
    public static final String APP_URL;
    public static final String DEFAULT_BROWSER;

    static {
        ResourceBundle appConfig = ResourceBundle.getBundle("app");
        REMOTE_HUB_URL = appConfig.getString("hubUrl");
        IMPLICIT_WAIT = Integer.parseInt(appConfig.getString("driver.implicitWait"));
        DEDAULT_USERNAME = appConfig.getString("default.userName");
        DEDAULT_USER_PASSWORD = appConfig.getString("default.password");
        LOCALSTORAGE_TOKEN_KEY = appConfig.getString("localStorage_key");
        APP_URL = appConfig.getString("appUrl");
        DEFAULT_BROWSER = appConfig.getString("default.browser");
    }
}
