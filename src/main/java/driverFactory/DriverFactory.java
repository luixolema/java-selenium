package driverFactory;

import config.AppConfig;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.html5.RemoteLocalStorage;
import org.openqa.selenium.support.ThreadGuard;

import javax.annotation.Nullable;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static RemoteWebDriver buildRemoteWebDriver(@Nullable DesiredCapabilities capabilities) throws Exception {
        capabilities = Optional.ofNullable(capabilities).orElse(DriverFactory.defaultDesiredCapabilities());

        RemoteWebDriver driver = new RemoteWebDriver(new URL(AppConfig.REMOTE_HUB_URL), capabilities );
        driver.manage().timeouts().implicitlyWait(AppConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);

        ThreadGuard.protect(driver);

        return driver;
    }

    private static DesiredCapabilities defaultDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setBrowserName(AppConfig.DEFAULT_BROWSER);
        capabilities.setPlatform(Platform.ANY);

        return  capabilities;
    }

    public static WebDriver getWebDriver(DesiredCapabilities capabilities) throws Exception {
        return DriverFactory.buildRemoteWebDriver(capabilities);
    }

    public static WebDriver getWebDriver() {
        try {
            return DriverFactory.buildRemoteWebDriver(null);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static LocalStorage getLocalStorage(WebDriver driver){
        return new RemoteLocalStorage(new RemoteExecuteMethod((RemoteWebDriver) driver));
    }
}
