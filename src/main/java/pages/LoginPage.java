package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    @FindBy(css = "#input-18")
    private WebElement userInput;

    @FindBy(css = "#input-21")
    private WebElement passwordInput;

    @FindBy(css = "#login > div > div > div > form > div > div > div.text-right.col.col-12 > button")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver, "/login");
    }


    public void login(String userName, String password){
        this.passwordInput.sendKeys(password);
        this.userInput.sendKeys(userName);
        this.loginBtn.click();
    }
}
