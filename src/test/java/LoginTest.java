import driverFactory.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.GuestPage;
import pages.LoginPage;
import utils.MessageType;
import utils.PageTest;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends PageTest {
    private LoginPage loginPage;
    private Logger logger = Logger.getLogger(LoginTest.class);


    @Override
    @BeforeMethod
    public void setUp() throws Exception {
        super.setUp();
        loginPage = new LoginPage(driver);
    }


    /****** Test ******/

    @Test
    public void login_shall_login_valid_user(){
        logger.info("Login correct user test");
        loadPage(loginPage);
        loginPage.login("user@gmail.com", "password");
        GuestPage guestPage = new GuestPage(driver);
        String diveCenterName = guestPage.getDiveCenterName().getText();

        assertThat(diveCenterName).isEqualToIgnoringCase("Makadi Bay");

    }


    @Test
    public void login_shall_show_error_on_invalid_credentials(){
        logger.info("Login wrong user test");
        loadPage(loginPage);
        loginPage.login("user@gmail.com", "wrongPassword");

        assertMessage(MessageType.ERROR, "Unknown user or wrong password");
    }


}
