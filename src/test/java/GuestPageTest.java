import config.AppConfig;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GuestPage;
import pages.LoginPage;
import utils.LoggedPageTest;

public class GuestPageTest extends LoggedPageTest {
    private GuestPage guestPage;
    private Logger logger = Logger.getLogger(GuestPageTest.class);


    @Override
    @BeforeMethod
    public void setUp() throws Exception {
        super.setUp();
        guestPage = new GuestPage(driver);
    }


    /****** Test ******/

    @Test
    public void shall_load_page_without_login(){
        loadPage(guestPage);
    }

    @Test
    public void shall_load_page_without(){
        loadPage(guestPage);
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
        guestPage.getDriver().get(AppConfig.APP_URL);
        guestPage.getDriver().get(AppConfig.APP_URL+guestPage.getUrl());
    }



}
