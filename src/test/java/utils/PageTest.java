package utils;

import config.AppConfig;
import driverFactory.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Page;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class PageTest {
    protected WebDriver driver;
    protected Logger logger = Logger.getLogger(PageTest.class);

    @BeforeMethod
    public void setUp() throws Exception {
        driver = DriverFactory.getWebDriver();
        logger.debug("Created new webDriver");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        logger.debug("Web driver closed");
    }

    protected void assertMessage(MessageType type, String message){
        WebElement notificationContainer = driver.findElement(By.cssSelector("div.vue-notification-group"));

        List<WebElement> notifications = notificationContainer.findElements(By.cssSelector(".vue-notification"));
        assertThat(notifications.size()).isGreaterThan(0);
        String messageClass = notifications.get(0).getAttribute("class");

        String text = driver.findElement(By.className("notification-content")).getText();
        assertThat(text).isEqualTo(message);

        switch (type){
            case ERROR:
                assertThat(messageClass).contains("error");
                break;
            case INFO:
                assertThat(messageClass).isEqualTo("info");
                break;
            case SUCCESS:
                assertThat(messageClass).isEqualTo("success");
                break;
        }
    }

    protected void loadPage(Page page){
        driver.get(AppConfig.APP_URL + page.getUrl());
    }
}
