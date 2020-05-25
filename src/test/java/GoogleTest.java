import driverFactory.DriverFactory;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import pages.GooglePage;
import utils.PageTest;

public class GoogleTest extends PageTest {
    private GooglePage page;
    private Logger logger = Logger.getLogger(GoogleTest.class);


    @BeforeTest
    public void setUp() throws Exception {
        this.driver = DriverFactory.getWebDriver();
        this.page = new GooglePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /**************** Tests *************/

    @Test
    public void testUntitledTestCase() throws Exception {
        logger.info("Login test");
        driver.get("https://www.google.com/");
        page.search("olimpiadas de 1992");
    }


}
