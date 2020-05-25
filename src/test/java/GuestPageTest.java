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
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/label")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[3]/label")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/label")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div[3]/div/div/table/tbody/tr/td[3]")).click();
        driver.findElement(By.id("input-58")).click();
        driver.findElement(By.xpath("//div[@id='list-item-184-1']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div[2]/div/div[2]/button/span")).click();
        driver.findElement(By.id("input-327")).click();
        driver.findElement(By.id("input-327")).clear();
        driver.findElement(By.id("input-327")).sendKeys("asfdafds");
        driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div/form/div/div[3]")).click();
        driver.findElement(By.id("input-330")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
        driver.findElement(By.id("input-330")).clear();
        driver.findElement(By.id("input-330")).sendKeys("asdfadsfafds");
        driver.findElement(By.xpath("//div[@id='app']/div[6]/div/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[5]/button/div")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[30]")).click();
        driver.findElement(By.id("input-339")).click();
        driver.findElement(By.xpath("//div[@id='list-item-394-4']/div/div")).click();
        driver.findElement(By.id("input-344")).click();
        driver.findElement(By.id("input-344")).clear();
        driver.findElement(By.id("input-344")).sendKeys("234");
        driver.findElement(By.id("input-348")).click();
        driver.findElement(By.id("input-348")).clear();
        driver.findElement(By.id("input-348")).sendKeys("asfdafds");
        driver.findElement(By.id("input-351")).click();
        driver.findElement(By.id("input-351")).clear();
        driver.findElement(By.id("input-351")).sendKeys("asdfadsf");
        driver.findElement(By.id("input-354")).click();
        driver.findElement(By.id("input-354")).clear();
        driver.findElement(By.id("input-354")).sendKeys("asdf");
        driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div/form/div/div[10]")).click();
        driver.findElement(By.id("input-357")).click();
        driver.findElement(By.xpath("//div[@id='list-item-417-2']/div")).click();
        driver.findElement(By.id("input-363")).click();
        driver.findElement(By.id("input-363")).clear();
        driver.findElement(By.id("input-363")).sendKeys("lolo@lolo.lo");
        driver.findElement(By.id("input-366")).click();
        driver.findElement(By.id("input-366")).clear();
        driver.findElement(By.id("input-366")).sendKeys("asdfafds");
        driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[2]/td[2]/div/span/span")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[2]/td[2]/div/span/span")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[2]/td[2]/div/span/span | ]]
        driver.findElement(By.id("app")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[3]/td[2]/div/span/span")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[3]/td[2]/div/span/span")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='app']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr[3]/td[2]/div/span/span | ]]
        driver.findElement(By.id("input-471")).clear();
        driver.findElement(By.id("input-471")).sendKeys("asfdafdsasd");
        driver.findElement(By.id("input-471")).sendKeys(Keys.ENTER);
    }



}
