package utils;

import config.AppConfig;
import driverFactory.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.html5.RemoteLocalStorage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.Page;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class LoggedPageTest extends PageTest {
    protected LocalStorage localStorage;

    @Override
    @BeforeMethod
    public void setUp() throws Exception {
        super.setUp();
        localStorage = DriverFactory.getLocalStorage( driver);
    }

    @AfterMethod
    public void tearDown(){
        logout();
        super.tearDown();
    }

    private String getToken(String userName, String password){
        // TODO implement this
        return "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyQGdtYWlsLmNvbSIsImV4cCI6MTU5MDQ0MjE4NSwiaWF0IjoxNTkwNDM0OTg1fQ.mUGyV9M2LZhqxyy1QdDyaP8qb6YC6Gx27s9sZFpK3fMihY700k35lK3JJJtL0RhYzdXqA9Op8ooZtFnA_SfSpQ";
    }


    public void loginUser(@Nullable String user, @Nullable String password){
        user = Optional.ofNullable(user).orElse(AppConfig.DEDAULT_USERNAME);
        password = Optional.ofNullable(password).orElse(AppConfig.DEDAULT_USER_PASSWORD);

        String token = getToken(user, password);
        localStorage.setItem(AppConfig.LOCALSTORAGE_TOKEN_KEY, token);
    }

    public void loginDefault(){
//        loginUser(null, null);
        LoginPage loginPage = new LoginPage(driver);
        super.loadPage(loginPage);
        loginPage.login(AppConfig.DEDAULT_USERNAME, AppConfig.DEDAULT_USER_PASSWORD);
    }


    public void logout(){
        localStorage.removeItem(AppConfig.LOCALSTORAGE_TOKEN_KEY);
    }


    @Override
    protected void loadPage(Page page) {
        driver.get(AppConfig.APP_URL);
        loginDefault();
        super.loadPage(page);
    }

    protected void loadPage(Page page, String username, String password) {
        driver.get(AppConfig.APP_URL);
        loginUser(username, password);
        super.loadPage(page);
    }
}
