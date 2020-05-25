package driverFactory;

import config.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.html5.RemoteLocalStorage;

import javax.annotation.Nullable;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static RemoteWebDriver buildRemoteWebDriver(@Nullable String browserType) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(Optional.ofNullable(browserType).orElse(AppConfig.DEFAULT_BROWSER));
        RemoteWebDriver driver = new RemoteWebDriver(new URL(AppConfig.REMOTE_HUB_URL), capabilities );
        driver.manage().timeouts().implicitlyWait(AppConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);

        return driver;
    }

    public static WebDriver getWebDriver(String browserType) throws Exception {
        return DriverFactory.buildRemoteWebDriver(browserType);
    }

    public static WebDriver getWebDriver() throws Exception {
        return DriverFactory.buildRemoteWebDriver(null);
    }

    public static LocalStorage getLocalStorage(WebDriver driver){
        return new RemoteLocalStorage(new RemoteExecuteMethod((RemoteWebDriver) driver));
    }
}
